package kh.com.job.person.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.com.job.person.model.dto.PsResumeDto;
import kh.com.job.person.model.dto.PsUserDto;
import kh.com.job.person.model.service.PsResumeService;
import kh.com.job.person.model.service.PsService;

@Controller
@RequestMapping("person/resume")
public class PsResumeController {
	
	@Autowired
	private PsResumeService rservice;
	private PsService pservice;
	
	@GetMapping("/write")
	public ModelAndView doresume(ModelAndView mv, String userId){
		
		System.out.println(userId);
		
//		if(userId==null) {
//			mv.setViewName("redirect:/");
//			return mv;
//		}
		
		try {
			PsUserDto result = pservice.selectOne(userId);
			if(result!=null) {
				mv.addObject("userinfo", result);
			} else {
				mv.setViewName("redirect:/");
				return mv;
			}
		} 
			catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("person/resume/write");
		return mv;
	}
	
	// 예외처리는 프로젝트 후반에 작성 
	

}
