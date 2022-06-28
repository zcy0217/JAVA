package ch02;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("位元組整數所佔的記憶體空間:" + Byte.SIZE/8+"byte.");
		System.out.println("位元組整數的範圍:" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		
		System.out.println("短整數所佔的記憶體空間:" + Short.SIZE/8+"bytes.");
		System.out.println("短整數的範圍:" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		
		System.out.println("整數所佔的記憶體空間:" + Integer.SIZE/8+"bytes.");
		System.out.println("整數的範圍:" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println("長整數所佔的記憶體空間:" + Long.SIZE/8+"bytes.");
		System.out.println("長整數的範圍:" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		
		System.out.println("單精確浮點數所佔的記憶體空間:" + Float.SIZE/8+"bytes.");
		System.out.println("單精確浮點數的範圍:" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		
		System.out.println("倍精確浮點數所佔的記憶體空間:" + Double.SIZE/8+"bytes.");
		System.out.println("倍精確浮點數的範圍:" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
	}

}
