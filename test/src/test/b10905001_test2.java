package test;

import java.util.Scanner;

public class b10905001_test2 {
//1. 計算20階層之結果值，並顯示此結果值後方連續有幾個0。(40%)
//2. 由使用者輸入10個相異整數，找出第幾個是最大值、第幾個是最小值。(40%) 
	public static void main(String[] args) {
		
		System.out.println("-----第一題-----");
		int i=1,count=0;
		long answer=1;
		for(i=1;i<=20;i++)
		{
			answer=answer*i;
		}
		System.out.println(answer);
		while(true)
		{
			if(answer%10==0)
			{
				count++;
				answer/=10;
			}
			else
				break;
		}
		System.out.println(count);
		
		System.out.println("-----第二題-----");
		int num,maxnum=0,minnum=0,maxindex=0,minindex=0;
		Scanner keyin = new Scanner(System.in); 
		for(i=1;i<=10;i++)
		{
			System.out.printf("請輸入第%d個數字:",i);
			num=keyin.nextInt();
			if(i==1)
			{
				maxnum=num;
				minnum=num;
			}
			if(num>maxnum)
			{
				maxnum=num;
				maxindex=i;
			}
			if(num<minnum)
			{
				minnum=num;
				minindex=i;
			}
			
		}
		System.out.printf("最大值%d在第%d個位子\n",maxnum,maxindex);
		System.out.printf("最小值%d在第%d個位子",minnum,minindex+1);
		
		keyin.close();
		
		
	
	}

}
