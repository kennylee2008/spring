package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("me")
public class Me {
	
	@Resource
	private Cook cook;
	
	@Resource
	private Driver driver;
	
	@Resource
	private Servant01 servant01;
	
	@Resource
	private Servant02 servant02;
	
	public void play(){
		
		//ְ��ת�Ƹ���������
		
		servant01.dress(); //��ע��
		cook.cook(); //��ע��
		driver.drive(); //��ע��
		System.out.println("��");
		cook.cook(); //��ע��
		servant02.undress(); //��ע��
		
		//���ǣ���������������ڣ�
		//������ϵ̫�࣬���޷�ר�ĸ����Լ������飬�ҵ�������е����̣��ҵ�֪�����ж��ٸ����ˣ��ҵ�֪����Щ�����Ǹ�ʲô��
		//�ȵȵȵȡ�������
	}
}
