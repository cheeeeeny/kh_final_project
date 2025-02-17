package kh.com.job.person.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;

import kh.com.job.admin.model.dto.AdBannerDto;
import kh.com.job.admin.model.dto.AdCategoryDto;
import kh.com.job.admin.model.service.AdBusinessService;
import kh.com.job.admin.model.service.AdCategotyService;
import kh.com.job.admin.model.service.AdService;
import kh.com.job.board.model.dto.CompanyDto;
import kh.com.job.business.model.dto.BsAplicantDto;
import kh.com.job.business.model.dto.BsRecruitDetailDto;
import kh.com.job.business.model.dto.BsRecruitDto;
import kh.com.job.business.model.dto.BsSuggestDto;
import kh.com.job.business.model.service.BsRecruitService;
import kh.com.job.common.file.FileUtil;
import kh.com.job.common.mail.MailUtil;
import kh.com.job.common.page.Paging;
import kh.com.job.person.model.dto.PsApplyDto;
import kh.com.job.person.model.dto.PsResumeDto;
import kh.com.job.person.model.dto.PsScrapInfoDto;
import kh.com.job.person.model.dto.PsUserDto;
import kh.com.job.person.model.service.PsResumeService;
import kh.com.job.person.model.service.PsService;

@Controller
@RequestMapping("/person")
public class PsMainController {

	@Autowired
	private PsService service;

	@Autowired
	private AdCategotyService cateservice;

	@Autowired
	private PsResumeService rservice;
	
	@Autowired
	private BsRecruitService brservice;

	@Autowired
	private AdBusinessService abs;
	
	@Autowired
	private AdService adservice;

	@Autowired
	@Qualifier("fileUtil")
	private FileUtil fileUtil;

	private final static String UPLOAD_FOLDER = "\\resources\\uploadfiles";

	// 암호화 기능 가지고 있는 클래스 자동주입
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	// 메인화면
	@GetMapping("/main")
	public ModelAndView viewmain(ModelAndView mv, Principal principal) {
		
		return mv;
	}

	// 아이디 찾기
	@GetMapping("/findid")
	public ModelAndView viewfindId(ModelAndView mv) {
		mv.setViewName("person/findid");
		return mv;
	}

	// 아이디 찾기
	@PostMapping("/findid")
	@ResponseBody
	public String dofindId(ModelAndView mv, @RequestParam("name") String nameParam,
	        @RequestParam("birth") String birthParam, @RequestParam("email") String email,
	        @RequestParam("phone") String phone) throws Exception {

	    Object birth = birthParam.replaceAll("[^0-9]", "");
	    Object name = nameParam.replace(",", "");

	    Map<String, Object> findId = new HashMap<>();
	    findId.put("userName", name);
	    findId.put("userBirth", birth);
	    findId.put("userEmail", email);
	    findId.put("userPhone", phone);

	    PsUserDto userId = service.findId(findId);
	    String findUserId = "";
	    if (userId != null) {
	        findUserId = userId.getUserId();
	    }
	    
	    return findUserId;
	}

	// 비밀번호 찾기
	@GetMapping("/findpw")
	public ModelAndView viewfindPw(ModelAndView mv) {
		mv.setViewName("person/findpw");
		return mv;
	}

	// 비밀번호 찾기
	@PostMapping("/findpw")
	@ResponseBody
	public int dofindPw(ModelAndView mv, @RequestParam("id") String id, @RequestParam("pid") String pid,
			@RequestParam("name") String name, @RequestParam("pname") String pname, @RequestParam("birth") String birth,
			@RequestParam("pbirth") String pbirth, @RequestParam("email") String email,
			@RequestParam("phone") String phone) throws Exception {

		Map<String, Object> findPw = new HashMap<>();
		if (!id.isEmpty()) {
			findPw.put("userId", id);
		} else if (!pid.isEmpty()) {
			findPw.put("userId", pid);
		}

		if (!name.isEmpty()) {
			findPw.put("userName", name);
		} else if (!pname.isEmpty()) {
			findPw.put("userName", pname);
		}

		if (!birth.isEmpty()) {
			findPw.put("userBirth", birth);
		} else if (!pbirth.isEmpty()) {
			findPw.put("userBirth", pbirth);
		}

		findPw.put("userEmail", email);
		findPw.put("userPhone", phone);

		System.out.println("map 저장 값" + findPw);

		PsUserDto dto = service.findPw(findPw);

		// TODO: 임시 비밀번호 만들기
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		int length = random.nextInt(9) + 8; // 8~16 사이의 길이
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		String newpassword = sb.toString();
		dto.setUserPw(passwordEncoder.encode(newpassword)); // 패스워드암호화

		// TODO:비밀번호 update
		int update = service.update(dto);
		System.out.println(dto);
		dto.getUserEmail();

		// TODO: 찾은 이메일로 메일 발송
		String title = "job-a 임시 비밀번호입니다.";
		String from = "tkdtlrdl07@gmail.com";
		String text = "<h1>job-a 임시 비밀번호입니다.</h1><br>회원님의 임시 비밀번호는 " + newpassword
				+ " 입니다. <br>해당 비밀번호로 로그인 후 회원정보 수정 페이지에서 새로운 비밀번호로 변경하세요.";
		String to = dto.getUserEmail();
		String[] cc = new String[0];
		int ccNum = cc.length;
		MailUtil.mailSend(title, from, text, to, cc, ccNum);

		return update;
	}

	// 찾기 실패
	@GetMapping("/findfail")
	public ModelAndView findFail(ModelAndView mv) {
		return mv;
	}

	// 회원가입 화면
	@GetMapping("/signUp")
	public ModelAndView viewsignUp(ModelAndView mv) {
		mv.setViewName("person/signUp");
		return mv;
	}

	// 회원가입 작성
	@PostMapping("/signUp")
	public ModelAndView dosignUp(ModelAndView mv, PsUserDto dto, RedirectAttributes rttr, HttpServletRequest request) throws Exception {
	    int result = -1;
	    dto.setUserPw(passwordEncoder.encode(dto.getUserPw()));

	    // 이메일 중복 확인
	    int emailChk = service.emailChk(dto.getUserEmail());
	    // 아이디 중복 확인
	    int idChk = service.idChk(dto.getUserId());

	    if (emailChk > 0) {
	        rttr.addFlashAttribute("msg", "가입하신 이메일 정보가 존재합니다. 정보 확인 후 다시 로그인 해주세요.");
	        mv.setViewName("redirect:/person/login");
	        return mv; 
	    } else if (idChk > 0) {
	        rttr.addFlashAttribute("msg", "가입하신 아이디 정보가 존재합니다. 정보 확인 후 다시 시도해주세요.");
	        mv.setViewName("redirect:/person/signUp");
	        return mv; 
	    }

	    result = service.insert(dto);

	    if (result > 0) {
	        rttr.addFlashAttribute("msg", "JOB-A 회원가입에 성공하였습니다.");
	        mv.setViewName("redirect:/");
	    } else {
	        rttr.addFlashAttribute("msg", "JOB-A 회원가입에 실패하였습니다.");
	        mv.setViewName("redirect:/person/signUp");
	    }

	    return mv;
	}
	
	// 기업 회원가입
	@PostMapping("/bsSignUp")
	public ModelAndView doBsSignUp(ModelAndView mv, PsUserDto dto, RedirectAttributes rttr,
			HttpServletRequest request) {

		int result = -1;

		try {

			dto.setUserPw(passwordEncoder.encode(dto.getUserPw()));
			result = service.businessInsert(dto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (result > 0) {
			rttr.addFlashAttribute("msg", "JOB-A 기업 회원가입에 성공하였습니다.");
			mv.setViewName("redirect:/");
			return mv;
		} else {
			rttr.addFlashAttribute("msg", "JOB-A 기업  회원가입에 실패하였습니다.");
			mv.setViewName("redirect:/person/signUp");
			return mv;
		}

	}

	// 아이디 중복 체크
	@PostMapping("/idChk")
	@ResponseBody
	public String idChk(String userId) throws Exception {
		System.out.println("회원아이디: " + userId);
		int result = service.idChk(userId);
		String data = "N";
		if (result == 1) {
			data = "Y";
			return data;
		} else {
			return data;
		}
	}

	// 마이페이지 홈-회원정보 확인 화면
	@GetMapping("/mypage")
	public ModelAndView viewMyPage(ModelAndView mv, Principal principal) throws Exception {

		mv.addObject("PsUserDto", service.selectOne(principal.getName()));
			
		return mv;
	}

	// 마이페이지에서 회원 비밀번호 확인
	@PostMapping("/pwChk")
	public ModelAndView pwChk(String confirmPw, ModelAndView mv, RedirectAttributes rttr) throws Exception {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		PsUserDto pdto = service.selectOne(auth.getName());

		if (passwordEncoder.matches(confirmPw, pdto.getUserPw())) {
			mv.setViewName("redirect:/person/update");
		} else {
			rttr.addFlashAttribute("msg", "비밀번호가 틀렸습니다. 다시 확인해주세요.");
			mv.setViewName("redirect:/person/mypage");
		}

		return mv;
	}

	// 회원정보 업데이트 화면
	@GetMapping("/update")
	public ModelAndView viewUpdate(ModelAndView mv, Principal principal) throws Exception {
		System.out.println("로그인정보: " + principal.getName());

		if (principal.getName() != null) {
			mv.addObject("PsUserDto", service.selectOne(principal.getName()));
			mv.setViewName("person/update");
		} else {
			mv.setViewName("redirect:/");
		}
		return mv;
	}

	// 회원정보 업데이트
	@PostMapping("/update")
	public ModelAndView update(ModelAndView mv
			, PsUserDto dto
			, Principal principal
			, RedirectAttributes rttr)
			throws Exception {

		if (principal.getName() != null) {
			dto.setUserId(principal.getName());
			dto.setUserPw(passwordEncoder.encode(dto.getUserPw())); // 패스워드 암호화
		
			service.update(dto);
			mv.setViewName("redirect:/person/mypage");
			rttr.addFlashAttribute("msg", "회원정보 수정에 성공했습니다.");
		} else {
			mv.setViewName("redirect:/");
			rttr.addFlashAttribute("msg", "회원정보 수정에 실패했습니다.");
		}

		return mv;
	}

	// 회원탈퇴 화면
	@GetMapping("/delete")
	public ModelAndView viewDelete(ModelAndView mv, Principal principal) throws Exception {
		System.out.println("로그인정보: " + principal.getName());

		if (principal.getName() != null) {
			mv.addObject("PsUserDto", service.selectOne(principal.getName()));
			mv.setViewName("person/delete");
		} else {
			mv.setViewName("redirect:/");
		}
		return mv;
	}

	// 회원탈퇴 화면 - 비밀번호 확인 화면
	@GetMapping("/deletepw")
	public ModelAndView viewDeletepw(ModelAndView mv, Principal principal) throws Exception {
		System.out.println("로그인정보: " + principal.getName());

		if (principal.getName() != null) {
			mv.addObject("PsUserDto", service.selectOne(principal.getName()));
			mv.setViewName("person/deletepw");
		} else {
			mv.setViewName("redirect:/");
		}
		return mv;
	}

	// 회원탈퇴
	@PostMapping("/deletepw")
	public ModelAndView delete(ModelAndView mv, String userId, String userPw, RedirectAttributes rttr)
			throws Exception {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		PsUserDto pdto = service.selectOne(auth.getName());

		if (passwordEncoder.matches(userPw, pdto.getUserPw())) {
			service.delete(userId);
			SecurityContextHolder.clearContext();
			mv.setViewName("redirect:/");

		} else {
			mv.setViewName("redirect:/person/deletepw");
			rttr.addFlashAttribute("msg", "회원탈퇴에 실패하였습니다. 비밀번호를 다시 확인해주세요");
		}

		return mv;
	}

	// 마이페이지 - 입사지원현황 화면
	@GetMapping("/applylist")
	public ModelAndView viewApplyList(ModelAndView mv, Principal principal) {
		try {
			PsUserDto result = service.selectOne(principal.getName());
			List<PsApplyDto> apply = service.selectListApply(principal.getName());

			if (result != null) {
				mv.addObject("userinfo", result);
				mv.addObject("applylist",apply);
				mv.setViewName("person/applylist");
			} else {
				mv.setViewName("redirect:/");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	
	// 입사지원 취소
	@PostMapping("cancelApply")
	@ResponseBody
	public int cancelApply(Principal principal, @RequestParam("raNum") Integer raNum) throws Exception {
		
		int result = -1;
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("raNum", raNum);
		InfoNo.put("userId", principal.getName());

		result = service.cancelApply(InfoNo);

		return result;
	}
	
	// 면접제안 리스트
	@GetMapping("/suggest")
	public ModelAndView suggestPage(ModelAndView mv, Principal principal, BsSuggestDto dto) {
		//로그인한 id로 조회
		dto.setPsUser(principal.getName());
		
		//페이징시, 페이지값(pnum) 0일 때, 기본값 1로 설정
				if(dto.getPnum() < 1) {
				dto.setPnum(1);
				}
				Paging list = service.psSuggestList(dto);
				System.out.println(dto);
								
				mv.addObject("suggest", list);		
				
				return mv;
	}
	
	//면접 제안 상세보기
	@GetMapping("/suggest/view")
	public ModelAndView viewSuggest (ModelAndView mv, Principal principal,
									 @RequestParam(name = "no", required = false) int sgNo) {
		
		BsSuggestDto sdto = service.viewSuggest(sgNo);
		mv.addObject("suggest", sdto);
		System.out.println(sdto);
		
		CompanyDto cdto = service.suggestCompanyInfo(sdto.getBsUser());
		mv.addObject("info", cdto);
		System.out.println(cdto);
		
		return mv;
	}
	
	
	//면접제안 수락
	@PostMapping("/interviewAccept")
	@ResponseBody
	public void interviewAccept( Principal principal,
												@RequestParam(name = "sgNo") int sgNo,
									            @RequestParam(name = "resumeNo") int resumeNo,
									            @RequestParam(name = "raNum") int raNum) {
             
		BsSuggestDto dto = new BsSuggestDto();
		dto.setSgNo(sgNo);
		dto.setResumeNo(resumeNo);
		dto.setRaNum(raNum);
		dto.setPsUser(principal.getName());
		
		service.interviewAccept(dto);
		service.updateAccept(dto);
	}
	
	// 관심기업정보 화면
	@GetMapping("/scrapcompany")
	public ModelAndView viewScrapCompany(ModelAndView mv, Principal principal) {
	
		try {
			PsUserDto result = service.selectOne(principal.getName());
			List<PsScrapInfoDto> scrap = service.selectListCom(principal.getName());
			
			if (result != null) {
				mv.addObject("userinfo", result);
				mv.addObject("scraplist", scrap);
				
				
				mv.setViewName("person/scrapcompany");
			} else {
				mv.setViewName("redirect:/");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	
	// 관심기업 삭제
	@PostMapping("deleteCompany")
	@ResponseBody
	public int deleteCompany(Principal principal, 
							@RequestParam("companyId") String companyId) throws Exception {
		
		int result = -1;
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("companyId", companyId);
		InfoNo.put("userId", principal.getName());

		result = service.deleteCompany(InfoNo);

		return result;
	}
	
	// 관심기업 여부 확인
	@PostMapping("/checkComScrap")
	@ResponseBody
	public int checkComScrap(@RequestParam("companyId") String companyId, Principal principal) throws Exception{
		
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("companyId", companyId);
		InfoNo.put("userId", principal.getName());

		int result = service.checkComScrap(InfoNo);
		int data = 0;
		if(result > 0) { //스크랩 돼있으면
			data = 1; // 데이터=1
			return data;
		} else { //스크랩 안 돼있으면 데이터=0
			return data;
		}
	}


	// 관심기업 등록
	@PostMapping("scrapCompany")
	@ResponseBody
	public int scrapCompany(Principal principal, @RequestParam("companyId") String companyId) throws Exception {
		
		int result = -1;
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("companyId", companyId);
		InfoNo.put("userId", principal.getName());

		result = service.scrapCompany(InfoNo);

		return result;
	}
	

	// 스크랩한 채용공고 화면
	@GetMapping("/scrapjob")
	public ModelAndView viewScrapJob(ModelAndView mv, Principal principal) {
		try {
			PsUserDto result = service.selectOne(principal.getName());
			List<PsScrapInfoDto> scrap = service.selectListScrap(principal.getName());
			List<PsResumeDto> resume = rservice.selectList(principal.getName());

			if (result != null) {
				mv.addObject("userinfo", result);
				mv.addObject("scraplist", scrap);
				mv.setViewName("person/scrapjob");
				mv.addObject("resumelist", resume);
			} else {
				mv.setViewName("redirect:/");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	// 1번 카카오톡에 사용자 코드 받기(jsp의 a태그 href에 경로 있음)
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView kakaoLogin(ModelAndView mv, @RequestParam(value = "code", required = false) String code
									 , HttpSession session
									 , RedirectAttributes rttr) throws Throwable {

		// 1번
		System.out.println("code : " + code);
		
		// code Null 인 경우 실행하지 않음
		if (code == null) {
			return mv;
		}
		
		//회원 권한을 위한 Authority지정
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();

		// 2번
		String access_Token = service.getAccessToken(code);
		System.out.println("###access_Token#### : " + access_Token);

		// 3번
		HashMap<String, Object> userInfo = service.getUserInfo(access_Token);
		System.out.println("###nickname#### : " + userInfo.get("nickname"));
		System.out.println("###email#### : " + userInfo.get("email"));

		// 사용자 이메일 정보 조회
		String userEmail = (String) userInfo.get("email");
		PsUserDto user = service.selectUserEmail(userEmail);
		
		
		// 이메일 정보가 일치하는 사용자가 존재할 경우 로그인 처리
		if (user != null && user.getUserEmail().equals(userEmail)) {
			
			System.out.println("### ####"+user.getUserRole());
			// 로그인

			roles.add(new SimpleGrantedAuthority(user.getUserRole()));
			String username = user.getUserId();
			//org.springframework.security.core.userdetails.User 으로 유저정보 저장
			//이 클래스로 지정 해야 UsernamePasswordAuthenticationToken 생성 시에 principal 저장 가능
			User userkakao = new User(username, "", roles);

			//인증 토큰을 위한 Authentication 생성 
		    Authentication auth = new UsernamePasswordAuthenticationToken(userkakao, null, roles);
		    
		    SecurityContextHolder.getContext().setAuthentication(auth);
		    session.setAttribute("kakaoToken", access_Token);

			mv.setViewName("redirect:/");
		} else {
			// 이메일 정보가 일치하지 않는 경우 로그인 실패 처리
			rttr.addFlashAttribute("msg", "이메일 정보가 일치하지 않습니다.");
			mv.setViewName("person/login");
		}
		return mv;
	}
	

	@GetMapping("/resume")
	public ModelAndView resume(ModelAndView mv) {
		return mv;
	}

	// 채용정보 페이지 - 1단계 
	@GetMapping("/recruit/info")
	public ModelAndView viewRecruitInfo(ModelAndView mv, Principal principal) {
		List<AdCategoryDto> fdeptList = cateservice.cateFdeptList();
		List<Map<String, Object>> resultList = new ArrayList<>();

		for (AdCategoryDto dto : fdeptList) {
			String categoryId = dto.getCategoryId();
			String categoryName = dto.getCategoryName();

			if ("LO".equals(categoryId) || "JN".equals(categoryId) ||"SC".equals(categoryId)) {
				Map<String, Object> resultMap = new HashMap<>();
				resultMap.put("categoryId", categoryId);
				resultMap.put("categoryName", categoryName);
				resultList.add(resultMap);
			}
		}
		
		List<BsRecruitDto> reCruitDto = brservice.recruitYAdmission();
		
	    
		int countYAdmission = brservice.countYAdmission();
		int lCatecountYAdmission = brservice.lCatecountYAdmission();

		mv.addObject("fdeptList", resultList);
		mv.addObject("recruitList", reCruitDto);
		mv.addObject("countYAdmission", countYAdmission);
		mv.addObject("lCatecountYAdmission", lCatecountYAdmission);
		mv.addObject("edList",  brservice.getCateList("ED"));
		mv.addObject("caList",  brservice.getCateList("CA"));
		mv.addObject("scList",  brservice.getCateList("SC"));
		mv.addObject("etList",  brservice.getCateList("ET"));
		mv.addObject("htList",  brservice.getCateList("HT"));

		return mv;
	}
	
	
	// 채용정보 페이지- 2단계 
	@PostMapping("/listmcate")
	@ResponseBody
	public String listMiddleCate(ModelAndView mv, String categoryId){
		
		List<AdCategoryDto> mlist = null;
		
		if(!categoryId.isEmpty() && !categoryId.equals("")){
			mlist = cateservice.cateMdeptList(categoryId);
		}

		return new Gson().toJson(mlist);
	}
	
	//채용정보 페이지- 3단계 
	@PostMapping("/listlcate")
	@ResponseBody
	public String listLastCate(ModelAndView mv, String categoryId){
			
			List<AdCategoryDto> llist = null;
			
			if(!categoryId.isEmpty() && !categoryId.equals("")){
				llist = cateservice.cateMdeptList(categoryId);
			}

			return new Gson().toJson(llist);
		}
		
	// 검색
	@PostMapping("/search")
	@ResponseBody
	public List<BsRecruitDto> search(
			ModelAndView mv,
	        @RequestBody Map<String, Object> keywords ) {
		
		 if (keywords == null || (keywords.get("checkedKeywords") == null && keywords.get("keyword") == null)) {
			  mv.setViewName("redirect:/"); // 리다이렉트할 URL 설정
		      return new ArrayList<>(); // 빈 List 반환
	     }
	     System.out.println(keywords);
	     List<BsRecruitDto> result = brservice.searchList(keywords);
	     return result;
	}

	// 구인공고 확인 화면
	@GetMapping("/viewrecruit/{raNum}")
	public ModelAndView viewRecruit(ModelAndView mv, @PathVariable String raNum, 
									Principal principal) {
		
		try {
			PsUserDto result = null;
			
			if(principal != null) {				
				result = service.selectOne(principal.getName());
			}
		
		
		if (result != null) {
			List<PsResumeDto> resume = rservice.selectList(principal.getName());
			// 공고 정보 출력
			BsRecruitDetailDto redto = abs.viewDetail(raNum);	
			mv.addObject("redto", redto);
			mv.addObject("resumelist", resume);
			mv.setViewName("person/viewrecruit");
		} else {
			mv.setViewName("redirect:/");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	
	// 입사지원하기
	@PostMapping("applyJob")
	@ResponseBody
	public int applyJob(Principal principal, BsAplicantDto dto){
		
		int result = -1;
		
		dto.setUserId(principal.getName());
		try {
			result = service.applyJob(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	// 입사지원 여부 체크
	@PostMapping("checkApply")
	@ResponseBody
	public int checkApply(@RequestParam("raNum") int raNum, Principal principal) throws Exception{
		
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("raNum", raNum);
		InfoNo.put("userId", principal.getName());

		int result = service.checkApply(InfoNo);
		int data = 0;
		if(result > 0) { //지원 돼있으면
			data = 1; // 데이터=1
			return data;
		} else { //안 돼있으면 데이터=0
			return data;
		}
	}

	
	// 카테고리에 맞는 채용공고 출력 
	@PostMapping("/recruit/info")
	@ResponseBody
	public List<BsRecruitDto> lCateRecruit(ModelAndView mv,
				@RequestParam String categoryId
				) {	
		
		 List<BsRecruitDto> recruitList = null;
		 
		    if (!categoryId.isEmpty() && !categoryId.equals("")) {
		        recruitList = brservice.lCateRecruit(categoryId);
		  }

		    return recruitList;

	}	

	//채용공고 스크랩 여부 확인
	@PostMapping("/checkScrap")
	@ResponseBody
	public int checkScrap(@RequestParam("raNum") int raNum, Principal principal) throws Exception{
		
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("raNum", raNum);
		InfoNo.put("userId", principal.getName());

		int result = service.checkScrap(InfoNo);
		int data = 0;
		if(result > 0) { //스크랩 돼있으면
			data = 1; // 데이터=1
			return data;
		} else { //스크랩 안 돼있으면 데이터=0
			return data;
		}
	}


	// 채용공고 스크랩
	@PostMapping("scrapJob")
	@ResponseBody
	public int scrapJob(Principal principal, @RequestParam("raNum") Integer raNum) throws Exception {
		
		int result = -1;
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("raNum", raNum);
		InfoNo.put("userId", principal.getName());

		result = service.scrapJob(InfoNo);

		return result;
	}
	
	
	// 채용공고 스크랩 삭제
	@PostMapping("deleteJob")
	@ResponseBody
	public int deleteJob(Principal principal, @RequestParam("raNum") Integer raNum) throws Exception {
		
		int result = -1;
		
		Map<String, Object> InfoNo = new HashMap<>();
		InfoNo.put("raNum", raNum);
		InfoNo.put("userId", principal.getName());

		result = service.deleteJob(InfoNo);

		return result;
	}
	
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) {
		
		List<AdBannerDto> bList = adservice.bannerList();
		
		mv.addObject("bList", bList);
		
		return mv;
	}

	// 파일 업로드
		@PostMapping("/fileupload")
		public ModelAndView fileupload(PsUserDto dto, ModelAndView mv, @RequestParam(name = "report", required = false) MultipartFile file,
				Principal principal, RedirectAttributes rttr) throws Exception {

			if (!file.isEmpty()) {
					String UserPic = rservice.upload(file, principal.getName());
					dto.setUserPic(UserPic);
					dto.setUserId(principal.getName());
					int result = service.userPic(dto);
					if(result > 0) {
						rttr.addFlashAttribute("msg", "사진등록이 완료되었습니다.");
						mv.setViewName("redirect:/person/mypage");
						return mv;
					}
					else {
						rttr.addFlashAttribute("msg", "사진등록이 실패되었습니다.");
					}
			}
			 mv.setViewName("redirect:/person/update");
			return mv;
		}
	

	
	
	
	// 예외처리는 프로젝트 후반에 작성
	@ExceptionHandler
	public void exception(Exception e) {
		e.printStackTrace();

	}

}