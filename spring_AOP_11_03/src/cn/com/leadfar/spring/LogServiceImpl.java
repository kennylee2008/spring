package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component("logService")
public class LogServiceImpl implements LogService {

	@Override
	public void addLog(String methodName) {
		System.out.println("��־��¼��"+methodName+"�������ˣ�");
	}

}
