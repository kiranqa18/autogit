package selenium;

import java.util.Scanner;

public class DebuggingDemo {
	public int m1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array Size :");
		
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		
		int sum =0;
		
		System.out.println("Enter the Array Elements :");
		
		for(int i=0 ; i<a.length ; i++) {
			
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]=" + a[i]);
			sum = sum+ a[i];
			
			
		}
		
		System.out.println("Sum of the Array is :" + sum);
		return sum;
		
	}
	public static void main(String[] args) {
		
		
	 DebuggingDemo obj1 =	new DebuggingDemo();	
	 
	  int count = obj1.m1();
		
	  System.out.println("count of array is : " + count);
}
	
	}
