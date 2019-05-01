package 常用类;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEXT4 {
	 public static void Test1(String phone) {
	        Pattern b = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
	        Matcher p = b.matcher(phone);

	        if (p.matches())
	            System.out.println("电话号码："+phone +  "符合(0000)0000-0000");
	        else
	            System.out.println("电话号码："+phone +  "不符合(0000)0000-0000");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第一题：");
		Test1("(2019)1314-1520");
    	Test1("123456789012");

	}

}