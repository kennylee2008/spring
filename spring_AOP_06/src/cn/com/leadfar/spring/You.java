package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("realYou")
public class You implements YouInterface {

	@Override
	public void playInChangCheng() {
		System.out.println("ȥ������");
	}

	@Override
	public void playInGuGong() {
		System.out.println("ȥ�ʹ���");
	}

}
