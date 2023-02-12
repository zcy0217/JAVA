package test;

import java.util.Scanner;

public class b10905001_no2 {

	public static void main(String[] args) {
		int time,i,total=0,num;
		Scanner keyin = new Scanner(System.in); 
		System.out.printf("輸入一個正整數:");
		time=keyin.nextInt();
		int[]n=new int[time];
		for(i=0;i<=time-1;i++)
		{
			System.out.printf("輸入第%d個整數:",i+1);
			num=keyin.nextInt();
			total+=num;
			n[i]=num;
		}
		for(i=0;i<n.length-1;i++)
		{
			System.out.printf("%d+",n[i]);
		}
		System.out.printf("%d=%d",n[n.length-1],total);
		
		keyin.close();

	}

}
