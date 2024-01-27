package com.gentech.methodtest;
class SampleDemo1{
	int showfact(int num) {
		int fact=1;
		for(int i=fact;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
}
public class FactorialofagivenNum {

	public static void main(String[] args) {
		SampleDemo1 sm=new SampleDemo1();
		int c=sm.showfact(4);
		System.out.println(c);

	}

}
