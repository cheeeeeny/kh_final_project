package kh.com.job.temp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.com.job.temp.model.service.TempService;

@Controller
@RequestMapping("/member")
public class TempController {
	
	@Autowired
	private TempService service;

	@GetMapping("/list")
	public ModelAndView memberList(ModelAndView mv) {
	
		System.out.println("멤버리스트");
	
		
		try {
			mv.addObject("mlist", service.memberList());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		return mv;
	}
	
	@GetMapping("/boardlist")
	public ModelAndView boardList(ModelAndView mv) {
		System.out.println("게시글 리스트");
		
		try {
			mv.addObject("blist", service.boardList());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		return mv;
	}
	
}
