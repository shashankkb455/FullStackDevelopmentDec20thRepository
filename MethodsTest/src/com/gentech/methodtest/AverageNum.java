package com.gentech.methodtest;
class Average{
	int voidshow(int x,int y) {
		return (x+y)/2;
	}
}
public class AverageNum {

	public static void main(String[] args) {
		Average a=new Average();
		System.out.println("average is "+a.voidshow(20, 30));

	}

}
