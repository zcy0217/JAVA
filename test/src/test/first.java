package test;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num,temp,temp2;
		System.out.println("-----1-----");
		System.out.println("班級:AI二，學號:B10905001，姓名:張啟玥");
		
		System.out.println("-----2-----");
		System.out.println("請輸入三位整數:");
		num=keyin.nextInt();
		temp=num%10;
		System.out.print("反轉前"+num+"，反轉後，"+temp);
		temp2=num/10;
		temp=temp2%10;
		System.out.print(temp);
		temp2=num/100;		
		System.out.print(temp2);
		
		System.out.printf("\n-----3-----\n");
		int score;
	    System.out.print("請輸入你的分數(0~100)");
	    System.out.print("輸入成績:");
	    score=keyin.nextInt(); 
	    score=score/10;
	    switch (score)
	    {
	    case 10:
	    case 9:
	    	System.out.println("A");
	    	break;
	    case 8:
	    	System.out.println("B");
	    	break;
	    case 7:
	    	System.out.println("C");
	    	break;
	    case 6:
	    	System.out.println("D");
	    	break;
	    default:
	    	System.out.println("F");
	    } 
	    
	    System.out.println("-----4-----");
	    int x1,y1,x2,y2,x3,y3;
	    System.out.print("請輸入矩形左上和右下端點座標：");
	    x1=keyin.nextInt(); //1
	    y1=keyin.nextInt(); //3
	    x2=keyin.nextInt(); //4
	    y2=keyin.nextInt(); //1
	    System.out.print("請輸入座標點");
	    x3=keyin.nextInt(); //2
	    y3=keyin.nextInt(); //2
	    if((x2>x3)&&(x3>x1)&&(y1>y3)&&(y3>y2))
	    	System.out.printf("點(%d,%d)在矩形內!!",x3,y3);
	    else
	    	System.out.printf("點(%d,%d)不在矩形內!!",x3,y3);
	    
	    keyin.close();
	}

}
