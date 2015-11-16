package jp.ac.chibafjb.x15g030.kd142;

import java.util.Scanner;

public class Kd142 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		String s1 = sin.next();
		String s2 = sin.next();
		sin.close();
		int a = Integer.parseInt(s1)+ Integer.parseInt(s2);
		int b = Integer.parseInt(s1)- Integer.parseInt(s2);
		int c = Integer.parseInt(s1)* Integer.parseInt(s2);
		int d = Integer.parseInt(s1)/ Integer.parseInt(s2);
		System.out.println("整数aの入力 →"+s1);
		System.out.println("整数bの入力 →"+s2);
		System.out.println(s1 +"+"+s2 +"="+a);
		System.out.println(s1 +"-"+s2 +"="+b);
		System.out.println(s1 +"*"+s2 +"="+c);
		System.out.println(s1 +"/"+s2 +"="+d);
		
	}

}
