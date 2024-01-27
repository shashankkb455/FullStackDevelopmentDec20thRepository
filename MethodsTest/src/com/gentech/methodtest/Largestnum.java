package com.gentech.methodtest;
class Largest{
	int voidshow(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
}
public class Largestnum {
	public static void main(String[] args) {
		Largest l=new Largest();
		System.out.println("average num is "+l.voidshow(3,7));
	}
}
