package ch05;

public class Ex7 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) 
		 {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			System.out.println();
		 }
	}
}
