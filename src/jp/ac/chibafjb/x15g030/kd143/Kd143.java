package jp.ac.chibafjb.x15g030.kd143;

import java.util.Scanner;

public class Kd143 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin =new Scanner(System.in);
		String  s1 =sin.next();
		String s2 = sin.next();
		String s3 = sin.next();
		sin.close();
		System.out.println("住所の入力 →"+s1);
		System.out.println("氏名の入力 →"+s2);
		System.out.println("電話番号の入力 →"+s3);
		
		System.out.println(" ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
