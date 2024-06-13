package com.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashmap 
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		
		Map m=new IdentityHashMap();/**
		
		*o/p==false
		*      null
		**/
		m.put(s1, 1);
		System.out.println(m.get(s2));
		
		
      Map m1=new HashMap();/**
		
		*o/p==false
		*      1
		**/
		m1.put(s1, 1);
		System.out.println(m1.get(s2));
		
	}

}
