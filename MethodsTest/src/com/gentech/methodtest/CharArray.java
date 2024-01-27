package com.gentech.methodtest;
class charArraydemo{
	static char[] showarray(char ch[]) {
	    String str="";
		for(int i=0;i<ch.length;i++) {
			str=str+ch[i];
		}
		return ch;
	}
}
public class CharArray {

	public static void main(String[] args) {
		charArraydemo c=new charArraydemo();
		char ch[]= {'a','b','c','d'};
		System.out.println(c.showarray(ch));

	}

}
