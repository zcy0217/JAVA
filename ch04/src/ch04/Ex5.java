package ch04;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); 
		  int power;
		  double bill;  
		  System.out.print("輸入用電度數(>=0):");
		  power=keyin.nextInt();  
		  switch((power-1)/100)   //switch case 不能用浮點數，須以整數方式來做判斷
		   {
		    case 0 : // 0  -100 度        
		    case 1:  // 101-200 度
		       bill=power*3.2;
		       break;
		    case 2:  // 201-300 度
		       bill=200*3.2+(power-200)*3.4;
		       break;     
		    default:  // 301度以上 
		       bill=200*3.2+100*3.4+(power-300)*3.6;               
		   } 
		  System.out.printf("電費=%.0f元\n" , bill);
		  keyin.close();
	}
}
