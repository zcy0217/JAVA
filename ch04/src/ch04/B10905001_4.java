package ch04;

import java.util.Scanner;

public class B10905001_4 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int ten,five,one;
		System.out.printf("----------1----------\n");
		System.out.print("請輸入幾枚十元、五元、一元硬幣");
		ten=keyin.nextInt();
		five=keyin.nextInt();
		one=keyin.nextInt();
		System.out.printf("總金額%d元\n",ten*10+five*5+one*1);

		System.out.printf("----------2----------\n");
		char operator;
		int num1,num2;
		System.out.print("輸入a,b:");
		num1=keyin.nextInt(); 
		num2=keyin.nextInt();  
		System.out.print("輸入運算子:");
		operator=keyin.next().charAt(0);
		switch (operator)
		 {
		     case '+':
		       System.out.printf("%d%c%d=%d\n",num1,operator,num2,num1+num2);
		       break;
		     case '-':
		       System.out.printf("%d%c%d=%d\n",num1,operator,num2,num1-num2);
		       break;
		     case '*':
		       System.out.printf("%d%c%d=%d\n",num1,operator,num2,num1*num2);
		       break;
		     case '/':
		       System.out.printf("%d%c%d=%f\n",num1,operator,num2,(float)num1/num2);
		 }
		
		System.out.printf("----------3----------\n");
		int score;
	    System.out.print("輸入成績:");
	    score=keyin.nextInt();  
	    if (score>=80)
	      System.out.println("等級:A");
	    else if (score>=60)
	      System.out.println("等級:B");
	    else 
	      System.out.println("等級:C");
	    
	    System.out.printf("----------4----------\n");
	    int score2;
	    System.out.print("輸入成績:");
	    score2=keyin.nextInt(); 
	    score2=score/10;
	    switch (score2)
	    {
	    case 10:
	    case 9:
	    case 8:
	    	System.out.println("等級:A");
	    	break;
	    case 7:
	    case 6:
	    	System.out.println("等級:B");
	    	break;
	    default:
	    	System.out.println("等級:C");
	    }
	    keyin.close(); 
	}

}
