package cn.com.leadfar.spring;

public class LogServiceImpl implements LogService {

	@Override
	public void addLog(String methodName) {
		System.out.println("��־��¼��"+methodName+"�������ˣ�");
	}

}
