package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("me")
public class Me {
	public void play(){
		dress(); //��ע��
		cook(); //��ע��
		drive(); //��ע��
		System.out.println("��");
		cook(); //��ע��
		undress(); //��ע��
	}
	
	private void dress(){
		System.out.println("���·�");
	}
	
	private void cook(){
		System.out.println("����");
	}
	
	private void drive(){
		System.out.println("����");
	}
	
	private void undress(){
		System.out.println("���·�");
	}
}
