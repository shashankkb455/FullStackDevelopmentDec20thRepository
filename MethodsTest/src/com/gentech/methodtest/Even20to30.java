package com.gentech.methodtest;
class EvenNum{
	int showevennum(int num) {
		int a=0;
		for(int i=num;i<=30;i++) {
			if(i%2==0) {
			a=i;	
			}
		}
		return a;
	}
}
public class Even20to30 {

	public static void main(String[] args) {
		EvenNum ev=new EvenNum();
		int b=ev.showevennum(20);
		System.out.println(b);

	}

}
