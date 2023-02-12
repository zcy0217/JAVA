package ch07;

import java.util.Scanner;

public class b10905001_9 {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in); 
		
		//uva10340
		String s = keyin.next();
		String t = keyin.next();
		char a[] = new char[100000]; //位子要開大以免放不下欲分解的字母
		char b[] = new char[100000];
		for (int i = 0; i < s.length(); i++)
			a[i] = s.charAt(i); //分解輸入的值進array
		for (int j = 0; j < t.length(); j++)
			b[j] = t.charAt(j); //分解輸入的值進array
		int i, j;
		for (i = 0, j = 0; i < t.length() && j < s.length(); i++)
		{
			if (b[i] == a[j])
			j++;
		}
		if (j == s.length())
			System.out.println("Yes");
		else
			System.out.println("No");
        
		int num1;
		num1=keyin.nextInt();
		int num2=reverse(num1);
		if(primebool(num1)==true && primebool(num2)==true)
			System.out.printf("%d is emirp.",num1);
		else if(primebool(num1)==true && primebool(num2)==false)
			System.out.printf("%d is prime.",num1);
		else 
			System.out.printf("%d is not prime.",num1);
		
		keyin.close();
	}
	static boolean primebool(int Prime)
	{
		boolean isPrime = true;
		  if (Prime > 0)
		  {
			  for (int i = 2; i < Prime; i++)
			  {
				  if (Prime % i == 0)
				  {
				     isPrime = false;
				     break;
				    }
			  }
		  }
		  return isPrime;
	}
	static int reverse(int x) {
	    boolean isNegativeInt = x < 0;
	    if (isNegativeInt)
	        x *= -1;
	    int result = 0;
	    int tmp = x;
	    while (true) {
	        int digit = tmp%10;
	        result = result * 10 + digit;
	        tmp /=10;
	        if (tmp == 0)
	            break;
	    }
	    if (isNegativeInt)
	        result *= -1;
	    return result;
	}
	
}