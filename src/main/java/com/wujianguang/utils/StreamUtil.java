package com.wujianguang.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
	public static void closeAll(FileInputStream fips,BufferedInputStream br) throws IOException {
		/*关流*/
		fips.close();
		br.close();
	}
	
	public static String readTextFile(InputStream src) throws IOException {
		File file=new File("D:\\Articles\123.txt");
		FileInputStream ips=new FileInputStream(file);
		BufferedInputStream br=new BufferedInputStream(ips);
		closeAll(ips, br);
		return br.toString();
	
	}
	
	public static String readTextFile(File textFile) {
		/*调用读取方法*/
		String text = readTextFile(textFile);
		return text;
		
	}
}
