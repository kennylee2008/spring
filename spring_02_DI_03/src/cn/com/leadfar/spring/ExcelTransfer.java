package cn.com.leadfar.spring;

import java.io.File;

/**
 * ����������״̬�ģ�ÿ�λ����������ʱ�򣬶������ǲ�ͬ�Ķ���(prototype)
 * @author Administrator
 *
 */
public class ExcelTransfer {
	
	//״̬
	private int currentRow;
	
	public String transfer(File excelFile){
		System.out.println("���������á�"+this+"������ת��Excel�ļ�");
		return "ת��֮��Ľ��";
	}
}
