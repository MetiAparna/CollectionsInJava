package com.Map;

import java.util.HashMap;
import java.util.Map;

public class demo 
{
	public static void main(String[] args) 
	{
		Map m= new HashMap();
		System.out.println(m.put("a",10));
		System.out.println(m.put("b",20));
		System.out.println(m.put("c",30));
		System.out.println(m.put("d",40));
		System.out.println(m.put("a",50));
		
		System.out.println(m.size());
		System.out.println(m.get("a"));
		System.out.println(m.get("d"));

		
	}

}
