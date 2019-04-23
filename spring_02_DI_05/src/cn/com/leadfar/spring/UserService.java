package cn.com.leadfar.spring;

import java.io.File;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class UserService implements BeanFactoryAware{
	
	//private ExcelTransfer transfer;
	private BeanFactory factory;
	
	private String saveDir;
	private int maxFile;
	private List someList;
	
	public UserService(String saveDir,int maxFile,List someList) {
		this.saveDir = saveDir;
		this.maxFile = maxFile;
		this.someList = someList;
	}

	public void addUser(){
		System.out.println("UserService.addUser()");
	}
	
	public void uploadExcel(File f){
		
		ExcelTransfer transfer = (ExcelTransfer)factory.getBean("excelTransfer");//new ExcelTransfer();
		
		transfer.transfer(f);
		
		System.out.println(saveDir+","+maxFile);
	}

	public void setBeanFactory(BeanFactory f) throws BeansException {
		this.factory = f;
	}

	public void setMaxFile(int maxFile) {
		this.maxFile = maxFile;
	}
	
//	public void setTransfer(ExcelTransfer t){
//		this.transfer = t;
//	}
}
