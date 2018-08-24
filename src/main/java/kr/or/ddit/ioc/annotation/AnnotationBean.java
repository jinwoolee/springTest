package kr.or.ddit.ioc.annotation;

import org.springframework.stereotype.Component;

@Component("annotationBean")
public class AnnotationBean {
	
	public AnnotationBean(){
		name = "brown";
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
