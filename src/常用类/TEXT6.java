package ������;

import java.util.Random;

public class TEXT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num = new int[10];
	        Random r = new Random();
	        System.out.println("����������� : ");
	        for (int i = 0; i < 10; i++) {
	            num[i] = r.nextInt(100);
	            System.out.print(num[i] + " ");
	        }
	        System.out.println();

	}

}
