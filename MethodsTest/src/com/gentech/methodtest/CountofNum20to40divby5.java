package com.gentech.methodtest;
class Count{
	int voidshow() {
		int c=0;
		for(int i=20;i<=40;i++) {
			if(i%5==0) {
				c++;
			}
		}
		return c;
	}
}
public class CountofNum20to40divby5 {

	public static void main(String[] args) {
		Count cnt=new Count();
		System.out.println(cnt.voidshow());

	}

}
