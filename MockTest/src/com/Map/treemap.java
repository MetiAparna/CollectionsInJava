package com.Map;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap 
{
		public static void main(String[] args) 
		{
			Map m=new TreeMap();
			m.put("telugu",90);
			m.put("english",56);
			m.put("maths",70);
			m.put("c",89);
			m.put("java",99);
			m.put("sql",80);
			
			Set s=m.keySet();
			Iterator i=s.iterator();
			while(i.hasNext())
			{
				Object key=i.next();
				Object value=m.get(key);
				System.out.println(key+" ------ "+value);
			}
			}

	}
