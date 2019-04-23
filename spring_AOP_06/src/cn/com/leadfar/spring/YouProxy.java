package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("you")
public class YouProxy implements YouInterface {
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	@Resource(name="realYou")
	private You you;
	
	@Override
	public void playInChangCheng() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		you.playInChangCheng();
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

	@Override
	public void playInGuGong() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		you.playInGuGong();
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

}
