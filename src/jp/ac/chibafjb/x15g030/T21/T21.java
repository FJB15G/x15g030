package jp.ac.chibafjb.x15g030.T21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner (System.in);
		int a = sin.nextInt();
		int b = sin.nextInt();
		int c = sin.nextInt();
		sin.close();
		System.out.println("ハンバーガーの個数　　→"+a);
		System.out.println("フライドポテトの個数　→"+b);
		
		 int q = a*100;
		 int w = b*180;
		 int g = q+w;
		 int s = 97;
		 int d = g+s;
		 int e = c-d;
		System.out.println("ハンバーガーの代金 ="+q);
		System.out.println("フライドポテトの代金 ="+w);
		System.out.println("小計 ="+g);
		
		System.out.println("消費税 ="+s);
		System.out.println("合計金額  = "+d);
		
		
		System.out.println("受取金額 ="+c);
		System.out.println("つり銭 ="+e);
		
		
		
		
	}

}
