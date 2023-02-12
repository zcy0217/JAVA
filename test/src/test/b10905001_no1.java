package test;

import java.util.Scanner;
import java.util.Random;

public class b10905001_no1 {

//我贏的方法:石頭-剪刀=1,布-石頭=1,剪刀-布=-2 其他都輸	
	
	public static void main(String[] args) {
		int man,computer;
		Scanner keyin = new Scanner(System.in); 
		outerfor:
		while(true)
		{
			System.out.printf("您出什麼?(0:剪刀 1:石頭 2:布 3:結束)");
			man=keyin.nextInt();
			String[] play = new String[] {"剪刀","石頭","布"};
			Random rd = new Random();
			long r = System.currentTimeMillis();
			rd.setSeed(r);
			computer=rd.nextInt(3);
			switch(man)
			{
				case 3:
					System.out.printf("遊戲結束");
					break outerfor;
				case 0,1,2:
					System.out.printf("你出:%s，電腦出:%s\n",play[man],play[computer]);
					if(man-computer==1||man-computer==-2)
						System.out.printf("你贏了\n\n");
					else if(man-computer==0)
						System.out.printf("平手\n\n");
					else
						System.out.printf("你輸了\n\n");
					break;
				default:
					System.out.printf("輸入錯誤\n\n");
			}
		}

	}

}
