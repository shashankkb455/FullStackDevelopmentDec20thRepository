package com.gentech.methodtest;
class Equals{
	boolean voidshow(String s1,String s2) {
		
		if(s1.equals(s2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class ReturnEqualsValue {

	public static void main(String[] args) {
		Equals e=new Equals();
		System.out.println(e.voidshow("ram","ram"));

	}

}
