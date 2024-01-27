package com.gentech.methodtest;
class Elements
{
	int [] Elements1()
	{
		
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}
		int a[]= new int[count];
		int k=0;
		int res[]= new int[count];
		for(int j=20;j<=40;j++)
		{
			if(res[j]%5==0)
			{
				a[k]=res[j];
			}
		}
		return a;
	}
}

public class CountofNumbw20to40Divisibleby5 {

	public static void main(String[] args) {
		Elements e= new Elements();
		int result[]= e.Elements1();
		for(int i=0;i<result.length;i++)
		{
			System.out.println();
		}
	
	}

}
