package cn.com.leadfar.spring;

public class LogServiceImpl implements LogService {

	@Override
	public void addLog(String methodName) {
		System.out.println("日志记录："+methodName+"被调用了！");
	}

}
