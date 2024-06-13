package com.sree;

public class Demo 
{
	public static void main(String[] args) 
	{
		
				A a=new A();
				a.add(10);
				a.add(20);
				a.add(30);
				a.add(40);
				a.add(50);
				System.out.println("size="+a.size());
				System.out.println(a);
				a.remove(2);
				System.out.println("size="+a.size());
				System.out.println(a);
				a.add(1,100);
				System.out.println("size="+a.size());
//				int i=(Integer)a.get(2);
//				System.out.println(i);
				System.out.println(a);
			}



		
		
	

}
