package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("me")
public class MyProxy implements MeInterface{
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	@Resource(name="realMe")
	private Me me;
	
	@Override
	public void play() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		me.play(); //�����£�����
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

	@Override
	public void playInWangFuJing() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		me.playInWangFuJing();
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

	@Override
	public void playInXiDang() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		me.playInXiDang();
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

	@Override
	public void work() {
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		
		me.work();
		
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
	}

}
