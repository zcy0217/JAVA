package ch05;

import java.util.Scanner;

public class b10905001_6 {

	public static void main(String[] args) {
		
		int num1,num2,temp;
		Scanner keyin = new Scanner(System.in); 
		System.out.printf("請輸入第一個整數:");
		num1=keyin.nextInt();
		System.out.printf("請輸入第二個整數:");
		num2=keyin.nextInt();
		while(true)
		{
			temp=num1%num2;
			if(num1%num2==0)
			{
				System.out.printf("最大公因數=%d",num2);
				System.out.println();
				break;
			}
			else
			{
				num1=num2;
				num2=temp;
			}
			
		}
	
		System.out.println();
		
		//A=65 char(65)
		int i,j;
		char c='A';
		for(i=1;i<=5;i++)//共幾層
		{
			for(j=0;j<i;j++)//每層裡幾個字母
			{
				System.out.printf("%c",c);
				c++;
			}
			System.out.println();
		}
		System.out.println();
		
		int n;
		System.out.print("請輸入落地次數:");
		n=keyin.nextInt();
		double h=100;
		double d=100;
		int k=0;
		
		while(k<n) {
			d=d+h; 
			h=h/2; 
			k++;
		}
		
		System.out.println("高度為" + h);
		System.out.println("距離為" + d);
		
		
		
		
		
		keyin.close();

	}

}
