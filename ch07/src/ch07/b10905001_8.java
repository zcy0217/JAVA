package ch07;

import java.util.Random;
import java.util.Scanner;

public class b10905001_8 {

	public static void main(String[] args) {
		
		int i,start,end,count=0;
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入起始整數值:");
		start=keyin.nextInt();
		System.out.print("請輸入結束整數值:");
		end=keyin.nextInt();
		System.out.printf("%d~%d整數中符合3或是5的倍數數值:\n",start,end);
		for(i=start;i<=end;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.printf("%d ",i);
				count++;
			}
		}
		System.out.printf(",共%d個\n",count);
		
		int j,leftspace,leftword,middlespace,rightword;
		for (j=0;j<4;j++) //控制層數 
		{	
			for (leftspace=0;leftspace<j;leftspace++) //控制左邊空白
			{
				System.out.printf(" ");
				} 
			for (leftword=1;leftword>0;leftword--) //控制左邊字母
			{
				System.out.printf("%c",j+97);
				}
			for (middlespace=8;middlespace/2>j;middlespace--) //控制中間空白
			{
				System.out.printf(" ");
				}
			for (rightword=1;rightword>0;rightword--) //控制右邊字母 
			{
				System.out.printf("%c",j+97);
				} 
			System.out.printf("\n");
		}	
		//e
		System.out.printf("    e\n");
		for (j=5;j<9;j++) //控制層數 
		{	
			for (leftspace=3;leftspace>j-5;leftspace--) //控制左邊空白
			{
				System.out.printf(" ");
				} 
			for (leftword=1;leftword>0;leftword--) //控制左邊字母
			{
				System.out.printf("%c",j+97);
				}
			for (middlespace=1;middlespace/2<j-4;middlespace++) //控制中間空白
			{
				System.out.printf(" ");
				}
			for (rightword=1;rightword>0;rightword--) //控制右邊字母 
			{
				System.out.printf("%c",j+97);
				}
			System.out.printf("\n");
		}		
		
		int a,b,op,guess=0;
		float guess2=0;
		System.out.println("回答算術四則運算（+，-，*，/）的問題:");
		char[] operator = new char[] {'+','-','*','/'};
		Random rd = new Random();
		long r = System.currentTimeMillis();
		rd.setSeed(r);
		a=rd.nextInt(101)+1;
		b=rd.nextInt(101)+1;
		op=rd.nextInt(4);
		System.out.printf("%d%c%d=",a,operator[op],b);
		if(op!=3)
		{
			guess=keyin.nextInt();
		}
		else if(op==3)
			guess2=keyin.nextFloat();
		
		switch(op){
			case 0:
				if(a+b == guess)
				{
					System.out.println("答對");			
				}
				else
					System.out.println("答錯");
				break;
			case 1:
				if(a-b==guess)
				{
					System.out.println("答對");			
				}
				else
					System.out.println("答錯");
				break;
			case 2:
				if(a*b==guess)
				{
					System.out.println("答對");			
				}
				else
					System.out.println("答錯");
				break;
			case 3:
				if((float)a/b==guess2)
				{
					System.out.println("答對");			
				}
				else
					System.out.println("答錯");
				break;
		}
		keyin.close();

	}

}
