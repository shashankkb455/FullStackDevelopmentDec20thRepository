package com.gentech.methodtest;
class MobilePrice{
	static int ShowPrice(int amount) {
		return amount;
	}
}
public class StaticMethodRetrnPriceofobile {

	public static void main(String[] args) {
		int a=MobilePrice.ShowPrice(18000);
		System.out.println("mobile price is "+a);

	}

}
