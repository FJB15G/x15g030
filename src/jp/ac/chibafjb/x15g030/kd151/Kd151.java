package jp.ac.chibafjb.x15g030.kd151;

import java.util.Scanner;

public class Kd151 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		float f1 =sin.nextFloat();
		float f2 =sin.nextFloat();
		
		sin.close();
		float a = f1+f2;
		float b = f1-f2;
		float c = f1*f2;
		float d = f1/f2;
	
		System.out.println("aの入力 →"+f1);
		System.out.println("bの入力 →"+f2);
		System.out.println(f1 +"+"+f2 +"="+a);
		System.out.println(f1 +"-"+f2 +"="+b);
		System.out.println(f1 +"*"+f2 +"="+c);
		System.out.println(f1 +"/"+f2 +"="+d);
		
	}

}
