package test;

public class b10905001_no4 {

	public static void main(String[] args) {
		int i,j,count=0;
		int[][]num=new int[][] {{0,0,1,0,2},{0,0,0,0,0},{0,0,0,0,1}};
		outerfor:
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=4;j++)
			{
				if (num[i][j]!=0)
					continue outerfor;
			}
			count++;
		}
		System.out.printf("共有%d列的資料列全為0",count);
	}

}
