package jp.ac.chibafjb.x15g030.kd151;

import java.util.Scanner;

public class Kd152 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		
		float b =sin.nextFloat();
		
		sin.close();
		
	
		float a = (float) 3.14;
		float c = 2 * a * b;
		float d = a*b*b;
		System.out.println("半径→"+b);
		System.out.println("円周 ="+c);
		System.out.println("面積 ="+d);
	}

}
