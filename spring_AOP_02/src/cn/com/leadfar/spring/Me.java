package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("me")
public class Me {
	public void play(){
		dress(); //关注点
		cook(); //关注点
		drive(); //关注点
		System.out.println("玩");
		cook(); //关注点
		undress(); //关注点
	}
	
	private void dress(){
		System.out.println("穿衣服");
	}
	
	private void cook(){
		System.out.println("做饭");
	}
	
	private void drive(){
		System.out.println("开车");
	}
	
	private void undress(){
		System.out.println("脱衣服");
	}
}
