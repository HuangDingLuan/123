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
	 public void Test2() {
			Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
			String ip=" 111.222.33.444";
			Matcher m=p.matcher(ip);
			if(m.find()) {
				System.out.println("ip:"+ip.substring(m.start(),m.end()));
				}

			}
	 public static void Text3(String str){
			String newStr = str.replaceAll("(.)(\\1)*", "$1");
			System.out.println("字符串压缩：" + newStr);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第一题：");
		Test1("(2019)1314-1520");
    	Test1("123456789012");

    	System.out.println("第二题：");
    	TEXT4 t=new TEXT4();
    	t.Test2();
    	
    	System.out.println("第三题：");
		Text3("aaabbbccccd");
	}


}