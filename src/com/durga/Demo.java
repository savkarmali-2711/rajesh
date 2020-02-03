package com.durga;

 
public class Demo
{
	static int id;
	
	public Demo(int id)
	{
		this.id=id;
		System.out.println("Constructor called");
	}
	
	public  Demo m1(int id) 
	{
		return new Demo(id);
	}
	
	public static void main(String[] args) 
	{
	//	Demo obj=new Demo(id);
		Demo obj = null;
		obj.m1(id);
	}

	
}