package ch02;

public class B10905001_2 {

	public static void main(String[] args) {
		int a=3,b=2,x=10,y=20,z=30,temp;
		System.out.printf("a+b=%d\n",a+b);
		System.out.printf("a/b=%f\n",(float)a/b);
		System.out.printf("f1=1*2*3*4*5=%d\n",1*2*3*4*5);
		System.out.printf("f2=5*2+1.0/10=%f\n",(float)5*2 +1.0/10);
		System.out.printf("95,74,81的平均值為%f\n",(float)(95+74+81)/3);
		System.out.printf("交換前: a=%d b=%d c=%d\n",x,y,z);
		temp=z;
		z=y;
		y=x;
		x=temp;
		System.out.printf("交換後: a=%d b=%d c=%d\n",x,y,z);
	}

}
