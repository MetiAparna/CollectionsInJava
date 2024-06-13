package StackANDqueue;

public class Queue 
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
		last=last.next;
		count++;
	}
	public Object poll()
	{
		if(isEmpty()) return null;
		Object ele=first.ele;
		first=first.next;
		count--;
		if(isEmpty())last=null;
		return ele;
	}
	public Object peek()
	{
		if(isEmpty()) return null;
		return first.ele;
	}
	public boolean isEmpty()
	{
		if(size()==0) return true;
		return false;
	}
	public int size()
	{
		return count;
	}
	
}
