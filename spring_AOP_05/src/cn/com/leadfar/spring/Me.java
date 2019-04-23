package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("realMe")
public class Me implements MeInterface{

	public void play(){
		System.out.println("��");
	}

	@Override
	public void playInWangFuJing() {
		System.out.println("ȥ��������");
	}

	@Override
	public void playInXiDang() {
		System.out.println("ȥ������");
	}

	@Override
	public void work() {
		System.out.println("����");
	}
}
