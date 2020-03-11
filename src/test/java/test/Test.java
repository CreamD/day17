package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import com.wujianguang.utils.DateUtil;
import com.wujianguang.utils.FileUtil;
import com.wujianguang.utils.StreamUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		Date date=new Date(2020, 3, 11, 14, 42, 30);
		Date src = DateUtil.getDateByInitMoenth(date);
		System.out.println(src);
		
		String name = FileUtil.getExtendName("aaa.jpg");
		System.out.println(name);
		
		File file=new File("D://Articles/123.txt");
		InputStream ips=new FileInputStream(file);
		String textFile = StreamUtil.readTextFile(ips);
		System.out.println(textFile);
	}
}
