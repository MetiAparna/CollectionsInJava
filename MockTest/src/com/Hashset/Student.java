package com.Hashset;

public class Student 
{
	String name;
	int marks;
	public Student(String n,int m)
	{
		name=n;
		marks=m;
	}
	public String toString()
	{
		return "[student(name="+name+" , marks="+marks+"]";
	}
	public int hashcode()
	{
		return marks;
	}
	public boolean equals(Object a)
	{
		if(!(a instanceof Student))return false;
		Student s=(Student)a;
		return name.equals(s.name)&& marks==s.marks;
	}

}
