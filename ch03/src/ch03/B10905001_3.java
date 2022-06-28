package ch03;

import java.util.Scanner;

public class B10905001_3 {

	public static void main(String[] args) {
		
		int num1,num2,num3,a,b,c;
		float num4;
		
		System.out.printf("----------1----------\n");
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入兩個整數:");
		num1=keyin.nextInt();
		num2=keyin.nextInt();
		System.out.printf("和:%d、差:%d、積:%d、商:%.2f\n",num1+num2,num1-num2,num1*num2,(float)num1/num2);
		
		System.out.printf("----------2----------\n");
		System.out.print("輸入一個整數:");
		num3=keyin.nextInt();
		System.out.printf("8進位:%o,16進位:%x\n",num3,num3);
		
		System.out.printf("----------3----------\n");
		System.out.print("輸入攝氏溫度:");
		num4=keyin.nextFloat();
		System.out.printf("攝氏溫度%.3f轉成華氏溫度=%.3f\n",num4,(float)9/5*num4+32);
		
		System.out.printf("----------4----------\n");
		System.out.print("請輸入長寬高:");
		a=keyin.nextInt();
		b=keyin.nextInt();
		c=keyin.nextInt();
		System.out.printf("周長:%d,表面積:%d,體積:%d\n",4*(a+b+c),2*(a*b+b*c+a*c),a*b*c);
		
		keyin.close();
	}

}
