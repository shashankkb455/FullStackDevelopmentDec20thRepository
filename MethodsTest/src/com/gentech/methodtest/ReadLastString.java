package com.gentech.methodtest;
class LastString{
	String[] showlast(String []s) {
		for(int i=s.length-1; i>=0;i--) {
			System.out.println(s[i]);
		}
		return s;
	}
}
public class ReadLastString {
	public static void main(String[] args) {
		LastString l=new LastString();
		String s[]= {"one","two","three","four"};
		l.showlast(s);
	}
}
