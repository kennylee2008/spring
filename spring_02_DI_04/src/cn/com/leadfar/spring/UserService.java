package cn.com.leadfar.spring;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class UserService implements BeanFactoryAware{
	
	//private ExcelTransfer transfer;
	private BeanFactory factory;
	
	private String saveDir;
	private int maxFile;
	private boolean boolvalue;
	private Date datevalue;
	
	private Properties props;
	
	public void setBoolvalue(boolean boolvalue) {
		this.boolvalue = boolvalue;
	}

	public void setDatevalue(Date datevalue) {
		this.datevalue = datevalue;
	}

	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}

	public void setMaxFile(int maxFile) {
		this.maxFile = maxFile;
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

	public void setProps(Properties props) {
		this.props = props;
	}
	
//	public void setTransfer(ExcelTransfer t){
//		this.transfer = t;
//	}
}
