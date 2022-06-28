package ch02;

public class p73 {

	public static void main(String[] args) { //氣泡排序法
		int a=1,b=2,temp;
		System.out.printf("交換前:a=%d,b=%d\n",a,b);
		temp=b;
		b=a;
		a=temp;
		System.out.printf("交換後:a=%d,b=%d",a,b);
	}
}