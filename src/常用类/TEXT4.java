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
	 public static void Text6(String str) {
		 Pattern p = Pattern.compile("abc$");
			Matcher m = p.matcher(str);
			if(m.find())
				System.out.println("字符串"+str + "是以abc结尾的字符串！");
			else
				System.out.println("字符串"+str + "不是以abc结尾的字符串！");
	 }
	 public void Text8() {
		 String s="ae256dd—w348e6";
		 String[] num=new String[3];
		 Pattern p=Pattern.compile("\\d+");
		 Matcher m=p.matcher(s);
		 int i=0;
		 while(m.find()) {
		 num[i]=m.group();
		 i++;
		 }
		 for(int j=0;j<i;j++) {
		 System.out.println(num[j]+",");
		 }
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
		
		System.out.println("第六题：");
		Text6("abcabcabc");
		
		System.out.println("第八题：");
		t.Text8();
		System.out.println();
		
	}


}