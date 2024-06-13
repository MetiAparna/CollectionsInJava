package StackANDqueue;

public class mainQueue 
{
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
        System.out.println(q.size()+" size is");
		while(!q.isEmpty())
			System.out.println(q.poll());
		System.out.println(q.peek());
	}
}
