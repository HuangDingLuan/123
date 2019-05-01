package 常用类;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class TEXT5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入日期(yyyy-MM-dd)：");
		String Date = input.next();
		input.close();
		int year = Integer.valueOf(Date.substring(0, 4));
		int month = Integer.valueOf(Date.substring(5, 7));
		int dayOfMonth = Integer.valueOf(Date.substring(8));
		LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println("七日后：");
		System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

	}

}
