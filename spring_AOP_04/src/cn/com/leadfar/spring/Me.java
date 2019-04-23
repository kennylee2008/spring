package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("realMe")
public class Me implements MeInterface{

	public void play(){
		System.out.println("Íæ");
	}
}
