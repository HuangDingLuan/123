package ������;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEXT4 {
	 public static void Test1(String phone) {
	        Pattern b = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
	        Matcher p = b.matcher(phone);

	        if (p.matches())
	            System.out.println("�绰���룺"+phone +  "����(0000)0000-0000");
	        else
	            System.out.println("�绰���룺"+phone +  "������(0000)0000-0000");
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
			System.out.println("�ַ���ѹ����" + newStr);
		}
	 public static void Text6(String str) {
		 Pattern p = Pattern.compile("abc$");
			Matcher m = p.matcher(str);
			if(m.find())
				System.out.println("�ַ���"+str + "����abc��β���ַ�����");
			else
				System.out.println("�ַ���"+str + "������abc��β���ַ�����");
	 }
	 public void Text8() {
		 String s="ae256dd��w348e6";
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
		System.out.println("��һ�⣺");
		Test1("(2019)1314-1520");
    	Test1("123456789012");

    	System.out.println("�ڶ��⣺");
    	TEXT4 t=new TEXT4();
    	t.Test2();
    	
    	System.out.println("�����⣺");
		Text3("aaabbbccccd");
		
		System.out.println("�����⣺");
		Text6("abcabcabc");
		
		System.out.println("�ڰ��⣺");
		t.Text8();
		System.out.println();
		
	}


}