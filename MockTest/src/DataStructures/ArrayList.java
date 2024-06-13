package DataStructures;

import java.util.Arrays;

public class ArrayList 
{
     private Object[] a=new Object[5];
     private int pos=0;
      public void add(Object e)
      {
    	  if(pos>a.length) increase();
    	  a[pos]=e;
    	  pos++;
      }
	private void increase() 
	{
		Object[] t=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			t[i]=a[i];
		}
		a=t;
	}
	public int size()
	{
		return pos;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>size())
			throw new ArrayIndexOutOfBoundsException();
		return a[index];
		
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>size())
			throw new IndexOutOfBoundsException();
		if(pos>=a.length) increase();
		for(int i=size()-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		pos++;
		
	}
	public void remove(int index)
	{
		if(index<=-1 || index>size())
			throw new ArrayIndexOutOfBoundsException();
		for(int i=index+1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
	}
	@Override
	public String toString() {
		return "ArrayList [a=" + Arrays.toString(a) + ", pos=" + pos + "]";
	}
	
}
