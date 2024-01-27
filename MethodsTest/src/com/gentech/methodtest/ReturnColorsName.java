package com.gentech.methodtest;
class Colors{
	String[] voidshow(String str[]) {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		return str;
	}
}
public class ReturnColorsName {

	public static void main(String[] args) {
		Colors c=new Colors();
		String str[]= {"blue","white","green"};
		c.voidshow(str);

	}

}
