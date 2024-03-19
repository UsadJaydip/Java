package com.core;

interface RBI
{
	void roi(double r);
}
interface WorldBank
{
	void requestfunds(String amount);
}
class SBI implements RBI
{
	public void roi(double r)
	{
		System.out.println("Rate of Interest Given By SBI Is : "+r);
	}
	public void requestfunds(String amount) {
		System.out.println("Fund Request By SBI Is : "+amount);

	}
}
class HDFC implements RBI
{
	public void roi(double r) {
		System.out.println("Rate of Interest Given By HDFC Is : "+r);

	}
}


public class InterFace {
	
	public static void main(String[] args) {
		SBI s=new SBI();
		s.roi(6.3);
		s.requestfunds("100cr");
		HDFC h=new HDFC();
		h.roi(6.9);
	}

}
