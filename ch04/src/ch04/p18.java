package ch04;

import java.util.Scanner;

public class p18 {

	public static void main(String[] args) {
		//f,F:format   c,C:copy   d,D:delete 
		Scanner keyin = new Scanner(System.in);
		char cha;
		cha=keyin.nextLine().charAt(0);
		switch (cha)
		{
		case 'f':
		case 'F':
			System.out.println("format");
			break;
		case 'c':
		case 'C':
			System.out.println("copy");
			break;
		case 'd':
		case 'D':
			System.out.println("delete");
			break;
		}
		keyin.close();
	}
}
