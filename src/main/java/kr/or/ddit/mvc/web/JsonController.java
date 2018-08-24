package kr.or.ddit.mvc.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/json")
@Controller
public class JsonController {
	
	@ModelAttribute("rangers")
	public void rangers(Model model){
		List<String> list = new ArrayList<String>();
		list.add("brown");
		list.add("cony");
		list.add("sally");
		
		model.addAttribute("rangers", list);
	}
	
	//localhost:8280/json/excelData
	@RequestMapping("/excelData")
	public String excelData(){
		return "excelDownloadView";
	}
	
	// localhost:8280/json/fileDown?fileName=sally.png
	// localhost:8280/json/fileDown?fileName=52727f9e-96e9-4965-a5ea-ece2a554248e.png
	@RequestMapping("/fileDown")
	public String fileDown(@RequestParam("fileName") String fileName, Model model){
		model.addAttribute("fileName", fileName);
		return "fileDownloadView";
	}
	
	//rangers 리스트를 json응답으로 생성
	// localhost:8280/json/data
	@RequestMapping("/data")
	public String data(){
		
		return "jsonView";
		//지금까지는 jsp이름 리턴 (폴더를 포함한 경로와 jsp 파일이름)
		//현재 viewResolver 설정상황
		//1.두개의 viewResolver가 등록
		//	1.1 order 0 : beanNameViewResolver
		//  1.2 order 1 : internalResourceViewResolver
		
	}
}







