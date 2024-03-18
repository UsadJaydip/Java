package com.core;

class Box 
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=4;
		depth=5;
	}
	Box(double w,double h, double d)
	{
		System.out.println("parameterized constructor called");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)
	{
		System.out.println("Copy Constructor Called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	double volume()
	{
		return width*height*depth;
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println("Volume : "+b1.volume());
		Box B2=new Box(4,5,6);
		System.out.println("Volume : "+b2.volume());
		Box B3=new Box(b2);
		System.out.println("Volume : "+b3.volume());
		Box B4=new Box(b2);
		System.out.println("Volume : "+b4.volume());


	}
}







