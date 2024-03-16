/* If Condition 

1. Simple IF 

if(condition)
{
	Statement
}

2. if/else
	
	if(condition)
	{
		Statement
	}
	else
	{
		Statement
	}

3.Nested If
if(condition)
{
	if(condition)
	{
		Statement
	}
	else
	{
		Statement
	}
}
else
{
	Statement
}

4. Ladder If  

if(condition)
{
	Statement
}
else if(condition)
{
	Statement
}
else if(condition)
{
	Statement
}
else
{
	Statement
}

*/


package com.core;

import java.util.Scanner;

public class IfCondition {
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
		b=sc.nextInt();
		System.out.print("Enter C :");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
		    {
			System.out.println("A is Max Number");
		}
		else
		{
			System.out.println("C Is Max Number");
		}
	}
		else
		{
			if(b>c)
			{
				System.out.println("B Is Max Number");
			}
			else
			{
				System.out.println("C Is Max Number");
			}
		}
	}
}
