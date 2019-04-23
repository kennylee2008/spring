package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("realMe")
public class Me implements MeInterface{

	public void play(){
		System.out.println("玩");
	}

	@Override
	public void playInWangFuJing() {
		System.out.println("去王府井玩");
	}

	@Override
	public void playInXiDang() {
		System.out.println("去西单玩");
	}

	@Override
	public void work() {
		System.out.println("工作");
	}
}
