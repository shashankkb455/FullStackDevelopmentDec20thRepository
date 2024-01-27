package com.gentech.methodtest;
class Colour{
	String[] voidshow(String []colors) {
		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i]);
		}
		return colors;
	}
}
public class Return3coloursname {

	public static void main(String[] args) {
		String []colors= {"green","white","blue"};
		Colour c=new Colour();
		c.voidshow(colors);

	}

}
