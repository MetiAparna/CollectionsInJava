package DataStructures;

public class testINLinkedList 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		System.out.println("size="+l.size());
		l.add(900);
		System.out.println("size="+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		//-------------------------------------
		System.out.println();
		l.add(3,300);
		l.add(7,700);
		System.out.println("size="+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
			
		}
		System.out.println();
          l.remove(3);
          System.out.println("remove Method");
          System.out.println("size="+l.size());
  		for(int i=0;i<l.size();i++)
  		{
  			System.out.print(l.get(i)+" ");
  			
  		}
  		System.out.println();
  		l.reverse();//--------------
        System.out.println("reverse linkedlist----------------");
        System.out.println("size="+l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
			
		}
		
	}


}
