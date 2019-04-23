package cn.com.leadfar.spring;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class UserService implements BeanFactoryAware{
	
	//private ExcelTransfer transfer;
	private BeanFactory factory;
	
	public void addUser(){
		System.out.println("UserService.addUser()");
	}
	
	public void uploadExcel(File f){
		
		ExcelTransfer transfer = (ExcelTransfer)factory.getBean("excelTransfer");//new ExcelTransfer();
		
		transfer.transfer(f);
	}

	public void setBeanFactory(BeanFactory f) throws BeansException {
		this.factory = f;
	}
	
//	public void setTransfer(ExcelTransfer t){
//		this.transfer = t;
//	}
}
