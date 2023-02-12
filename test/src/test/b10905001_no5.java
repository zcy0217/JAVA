package test;

public class b10905001_no5 {

	public static void main(String[] args) {
		int i;
		String temp;
		float temp2;
		System.out.println("排序前資料:");
		System.out.println("姓名\t打擊率");
		String[] name = new String[]{"一朗","柯南","邏輯林","大雄","魯夫"};
		float[] score = new float[]{(float)0.315,(float)0.298,(float)0.301,(float)0.25,(float)0.278};
		for(i=0;i<=score.length-1;i++)
		{
			System.out.println(name[i]+"\t"+score[i]);
		}
		for(i=0;i<=score.length-2;i++)
		{	
			if(score[i]<score[i+1])
			{
				temp=name[i];
				name[i]=name[i+1];
				name[i+1]=temp;
				temp2=score[i];
				score[i]=score[i+1];
				score[i+1]=temp2;
			}
		}
		System.out.println();
		System.out.println("排序後的資料:");
		System.out.println("姓名\t打擊率\t名次");
		for(i=0;i<=score.length-1;i++)
		{
			System.out.println(name[i]+"\t"+score[i]+"\t"+(i+1));
		}
	}

}
