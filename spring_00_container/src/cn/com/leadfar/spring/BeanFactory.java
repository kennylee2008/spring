package cn.com.leadfar.spring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {

	private Map<String,Object> container = new HashMap<String,Object>();
	
	public BeanFactory(String config) {
		//��ʼ��Spring����
		try {
			
			//��һ������ʼ�����ֶ���
			Document doc = new SAXReader().read(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream(config));
			
			List nodes = doc.selectNodes("//bean");
			for (Iterator iterator = nodes.iterator(); iterator.hasNext();) {
				Element bean = (Element) iterator.next();
				String beanId = bean.attributeValue("id");
				String className = bean.attributeValue("class");
				
				container.put(beanId, Class.forName(className).newInstance());
			}
			
			//�ڶ���������������ϵ
			List properties = doc.selectNodes("//property");
			for (Iterator iterator = properties.iterator(); iterator.hasNext();) {
				Element property = (Element) iterator.next();
				String propertyName = property.attributeValue("name");
				String propertyRef = property.attributeValue("ref");
				String belongTo = property.getParent().attributeValue("id");
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object getBean(String beanId){
		return container.get(beanId);
	}

}
