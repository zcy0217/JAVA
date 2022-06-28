package ch03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in); //需要背
		int num1, num2;

		// 方法1 分次輸入
		System.out.print("輸入第1個整數(以「換行」作為結束):");
		num1 = keyin.nextInt();
		System.out.print("輸入第2個整數(以「換行」作為結束):");
		num2 = keyin.nextInt();

		// 方法2 一次輸入
		// System.out.print("輸入兩個整數:(以「空白」或「Tab」或「換行」作為分隔)") ;
		// num1=keyin.nextInt();
		// num2=keyin.nextInt();
		
		// 方法3
		//System.out.print("輸入第1個整數:");
		//num1 = Integer.parseInt(keyin.next());
		//System.out.print("輸入第2個整數:");
		//num2 = Integer.parseInt(keyin.next());
		
		// 方法4
		// System.out.print("輸入兩個整數:(以「空白」或「Tab」或「換行」作為分隔)") ;
		// num1=Integer.parseInt(keyin.next());
		// num2=Integer.parseInt(keyin.next());
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)); //有括號會視為運算式
		// System.out.println(num1 + "+" + num2 + "=" + num1 + num2); //沒括號會像字串相加的概念
		// 若num1=1,num2=2,則結果為1+2=12(不是3)

		keyin.close(); //釋放資源

	}

}
