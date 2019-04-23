package cn.com.leadfar.spring;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatePropertyEditorSupport extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			setValue(format.parse(text));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
