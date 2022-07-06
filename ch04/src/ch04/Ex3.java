package ch04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); 
		  int score;  
		  System.out.print("輸入成績:");
		  score=keyin.nextInt();   
		  if (score>=60)
		    System.out.println("及格");
		  else
		    System.out.println("不及格");
		  keyin.close();
	}
}
