package ch06;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class b10905001_7 {

	public static void main(String[] args) throws IOException {
		Scanner keyin = new Scanner(System.in); 
		char ch;
		System.out.print("輸入字元:");
		ch = keyin.next().charAt(0);
		if (Character.isLetter(ch))
			System.out.println("是英文字母");
		else
			System.out.println("不是英文字母");
		
		System.out.print("輸入字元:");
		ch = keyin.next().charAt(0);
		if (Character.isLowerCase(ch))
			System.out.println("是小寫英文字母");
		else
			System.out.println("不是小寫英文字母");
		
		System.out.print("輸入字元:");
		char ch2 = (char) System.in.read(); //要同時讀取到拖曳字元想不到方法 空白鍵和tab沒問題
		if (Character.isWhitespace(ch2))
			System.out.println("是空白字元");
		else
			System.out.println("不是空白字元");
		
		long start=0,end=0,time;
		long sum=0,i;
		for(i=1;i<=1000000000;i++)
		{	
			sum+=i;
			if(i==1)
			{
				start=System.currentTimeMillis();
			}
			if(i==1000000000)
			{
				end=System.currentTimeMillis();
			}
			
		}
		
		time=end-start;
		System.out.printf("1+2+3+…+100000000所花的時間=%d毫秒",time);
		
		keyin.close();

	}

}
