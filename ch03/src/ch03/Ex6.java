package ch03;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);        
		  int unicode; 
		  char ch;

		  //Java 程式語言中是使用16位元的 Unicode碼來儲存目前各種語言中的字元
		  //1. 中文字元所對應的Unicode(標準萬國碼)範圍在19968~40622區間內
		  //   (即,十六進位的4E00~9EAE區間內)

                  //2. 英文字元對應的Unicode範圍在[]及[]65-90及97-122區間內
                  //   (即,十六進位的0041~005A及0061~007A區間內)
		 
                  //3. 數字字元對應的Unicode範圍在[]49~57 區間內
   		  //   (即,十六進位的0031~0039區間內)

                  //4. 符號字元對應的Unicode範圍在33-47,58-64,91-96及123-126區間內
                  //   (即,十六進位的0021~002F,003A~0040,005B~0060及007B~007E)
	 	  
                  //5. 空白字元對應的Unicode為32 (即,十六進位的20)

		  System.out.print("輸入unicode碼(十進位):");  
		  unicode=keyin.nextInt();
		  ch= (char)unicode;  
		  System.out.println("unicode碼為" + unicode + "所對應的字元為" + ch);
		  System.out.print("輸入字元:");  
		  ch=keyin.next().charAt(0); //index=0的位子
		  unicode= (int)ch;  
		  System.out.println("字元為" + ch + "所對應的unicode碼為" + unicode);
		  keyin.close();
	}
}
