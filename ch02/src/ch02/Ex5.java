package ch02;

public class Ex5 {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		c = --a + b; // 先處理a--;，然後再處理c=a＋b;
		System.out.printf("a=" + a + " , c=" + c);
	}
}