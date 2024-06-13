package com.Hashset;

import java.util.Set;

public class Studentmain
{
	public static void main(String[] args) 
	{
		Student s1=new Student("raj",68);
		Student s2=new Student("raj",68);
		System.out.println("hashcode of s1="+s1.hashcode());
		System.out.println("hascode of s2="+s2.hashcode());
	    Hashset h=new Hashset();
		System.out.println(h.add(s1));
		System.out.println(h.add(s1));
		
	}

}
