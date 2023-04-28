package kh.com.job.person.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kh.com.job.business.model.dto.BsAplicantDto;
import kh.com.job.person.model.dto.PsApplyDto;
import kh.com.job.person.model.dto.PsScrapInfoDto;
import kh.com.job.person.model.dto.PsUserDto;
import kh.com.job.temp.model.dto.TempDto;

public interface PsService {
	
	public PsUserDto selectOne(String userId) throws Exception;
	public int idChk(String userId) throws Exception;
	public List<PsUserDto> selectList() throws Exception;
	public int insert(PsUserDto dto) throws Exception;
	public int businessInsert(PsUserDto dto) throws Exception;
	public int update(PsUserDto dto) throws Exception;
	public int delete(String userId) throws Exception;
	public PsUserDto findId(Map<String, Object> findId) throws Exception;
	public PsUserDto findPw(Map<String, Object> findPw) throws Exception;
	public int scrapJob(Map<String, Object> InfoNo) throws Exception;
	public int deleteJob(Map<String, Object> InfoNo) throws Exception;
	public int checkScrap(Map<String, Object> InfoNo) throws Exception;
	public List<PsScrapInfoDto> selectListScrap(String userId) throws Exception;
	public List<PsApplyDto> selectListApply(String userId) throws Exception;
	public int checkApply(Map<String, Object> InfoNo) throws Exception;
	 
	//입사지원
	public int applyJob(BsAplicantDto dto) throws Exception;
	//입사지원 취소
	public int cancelApply(Map<String, Object> InfoNo) throws Exception;
	
	
	// 카카오 로그인 
	String getAccessToken(String authorize_code) throws Throwable;
	public HashMap<String, Object> getUserInfo(String access_Token) throws Throwable;
	public PsUserDto selectUserEmail(String userEmail) throws Throwable;
}
