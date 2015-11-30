package jp.ac.chibafjb.x15g030.kd153;

import java.util.Scanner;

public class Kd153 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sin = new Scanner(System.in);
		
		float b =sin.nextFloat();
		
		sin.close();
		
	
		float a = (float) 3.14;
		float c = 2 * a * b;
		float d = a*b*b;
		
		System.out.println("半径→"+b);
//		System.out.println("円周 ="+c);
//		System.out.println("面積 ="+d);
		float value =c;
		System.out.print("円周 =");
		System.out.println(Math.round(value*10)/10.0f);
		System.out.print("面積 =");
		float value1 = d;
		System.out.println(Math.round(value1*10)/10.0f);
	}

}
