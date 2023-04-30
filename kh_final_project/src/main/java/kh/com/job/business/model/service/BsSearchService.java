package kh.com.job.business.model.service;

import java.util.List;

import kh.com.job.business.model.dto.BsSearchDto;
import kh.com.job.common.page.Criteria;

public interface BsSearchService {

	
	
//	public Paging resumePageList(BsSearchDto sdto);

	public List<BsSearchDto> resumeList(BsSearchDto sdto);
	public List<BsSearchDto> resumePagingList(Criteria cri); 
		
}
