package test;

import java.util.Scanner;

public class b10905001_no3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int i, total = 0;
		System.out.print("輸入一大寫英文單字(<=20個字母):");
		String words = keyin.next();
		for(i=0;i<words.length();i++)
			total=total+(words.charAt(i)-64);
		System.out.printf("%s所得到的分數為%d",words,total);
		
		keyin.close();

	}

}
