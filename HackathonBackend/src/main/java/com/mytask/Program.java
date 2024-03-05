package com.mytask;

public class Program {
	private static int num1=10;
	private int num2=20;
	
	public void show1() {
		
		System.out.println("In non-static show()"+num1+" "+num2);
	}
	public static void show() {
		System.out.println("In static show()"+num1);
	}
	
	public void check() {
		System.out.println("In non-static method"+num1+num2);
		Program.show();
		Program p = new Program();
		p.show1();
	}
	public static void check2() {
		System.out.println("In static method."+num1);
	}
	public static void main(String[] args) {
//		System.out.println("In static main"+num1);
//		Program p = new Program();
//		p.check();
//		Program.check2();
//		System.out.println(Math.sqrt(24));
		int arr[]=new int[10^8];
	}
}
