package ch05;

import java.util.Scanner;

public class b10905001_5 {

	public static void main(String[] args) {
		
		int num;
		Scanner keyin = new Scanner(System.in); 
		System.out.printf("請輸入一個整數:");
		num=keyin.nextInt();
		System.out.printf("%d倒過來為",num);
		while(num>0) 
		{
			System.out.printf("%d",num%10);
			num/=10;
		}
		
		System.out.println();
		
		int num1,num2,guestAns,realAns;
		System.out.printf("輸入第一個整數:");
		num1=keyin.nextInt();
		System.out.printf("輸入第二個整數:");
		num2=keyin.nextInt();
		realAns=num1+num2;
		while(true)
		{
			System.out.printf("%d+%d=",num1,num2);
			guestAns=keyin.nextInt();
			if(realAns==guestAns)
			{
				System.out.printf("答對了\n");
				break;
			}
			else
				System.out.printf("答錯了\n");
		}
		
		System.out.println();
		
		int i=1,password=201209,guess;
		while(i<=3)
		{
			System.out.printf("輸入密碼:");
			guess=keyin.nextInt();
			if(password==guess)
			{
				System.out.printf("密碼正確");
				break;
			}
			else
			{
				System.out.printf("密碼錯誤\n");
				i++;
			}
		}
		
		keyin.close();
		

	}

}
