package com.wujianguang.utils;

import java.util.Date;

public class DateUtil {
	public static Date getDateByInitMoenth(Date src) {
		/*设置时间*/
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		return src;
		
	}
	
	public static Date getDateByFullMonth(Date src) {
		return src;
		
	}
}
