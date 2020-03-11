package com.wujianguang.utils;

public class FileUtil {
	public static String getExtendName(String fileName) {
		/*分隔文件名*/
		String[] split = fileName.split("\\.");
		fileName="."+split[1];
		return fileName;
		
	}
}
