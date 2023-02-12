package ch06;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int money;
		int gift;
		System.out.print("輸入消費總金額:");
		money = keyin.nextInt();
		gift = (int) Math.floor(money / 1000.0) * 100; //無條件捨去
		//或 gift = money / 1000 * 100; 
		
		System.out.println("獲得的禮券金額為" + gift + "元");
		keyin.close();		
	} 
}
