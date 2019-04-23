package cn.com.leadfar.spring;

import java.io.File;

/**
 * 本类型是有状态的，每次获得这个对象的时候，都必须是不同的对象(prototype)
 * @author Administrator
 *
 */
public class ExcelTransfer {
	
	//状态
	private int currentRow;
	
	public String transfer(File excelFile){
		System.out.println("现在正在用【"+this+"】对象，转换Excel文件");
		return "转换之后的结果";
	}
}
