package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("realYou")
public class You implements YouInterface {

	@Override
	public void playInChangCheng() {
		System.out.println("去长城玩");
	}

	@Override
	public void playInGuGong() {
		System.out.println("去故宫玩");
	}

}
