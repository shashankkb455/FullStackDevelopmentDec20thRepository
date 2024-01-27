package com.gentech.methodtest;
class Logical{
	boolean showvalue(int a,int b) {
		if(a!=b) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class ReturnLogicalValue {

	public static void main(String[] args) {
		Logical l=new Logical();
		l.showvalue(2,3);
		System.out.println(l.showvalue(2,3));

	}

}
