package 常用类;

import java.util.Arrays;
import java.util.Random;

public class TEXT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[10];
	        Random r = new Random();
	        System.out.println("产生的随机数 : ");
	        for (int i = 0; i < 10; i++) {
	        	arr[i] = r.nextInt(100);
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("复制随机数:");
	        int arr1[]=new int[10];
			System.arraycopy(arr, 0, arr1, 0, 10);//将arr复制到arr1中
			for(int i=0;i<10;i++) {			
				System.out.println(arr1[i]);		
			}
			 System.out.println("排序结果: ");
		        Arrays.sort(arr);
		        for (int i = 0; i < 10; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        System.out.println();

	}

}
