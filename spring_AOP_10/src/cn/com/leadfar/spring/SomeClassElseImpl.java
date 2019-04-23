package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("someClass")
public class SomeClassElseImpl implements SomeClassElse {

	@Override
	public void play() {
		System.out.println(this+".play");
	}

}
