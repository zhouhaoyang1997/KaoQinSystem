package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtil {
	public static Timestamp getDateTime(){
		java.util.Date date = new java.util.Date();  
		//将时间格式转换成符合Timestamp要求的格式  
		String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);  
		java.sql.Timestamp datetime = java.sql.Timestamp.valueOf(nowTime);
		return datetime;
	}
	public static int getMonth(String s){
		String[] str = null;
		str = s.split("-");
		return Integer.parseInt(str[1]);
	}
}
