package com.gentech.methodtest;
class Concat{
	String showconcat(String s1,String s2) {
		return s1+s2;
	}
}
public class ConcatTwoString {

	public static void main(String[] args) {
		Concat c=new Concat();
		String s1="hii",s2="hello";
		System.out.println(c.showconcat(s1, s2)	);

	}

}
