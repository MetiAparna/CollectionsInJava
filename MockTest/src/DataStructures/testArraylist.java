package DataStructures;

public class testArraylist 
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		a.add(4,900);
		 System.out.println(a.size());
			for(int i=0;i<a.size();i++)
			{
			System.out.println(a.get(i));
			}
				
      a.remove(2);
      System.out.println(a.size());
		for(int i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		a.add(4,50);
		 System.out.println(a.size());
			for(int i=0;i<a.size();i++)
			{
			System.out.println(a.get(i));
			}
		
	}

}
