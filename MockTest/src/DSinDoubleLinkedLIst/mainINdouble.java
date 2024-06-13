package DSinDoubleLinkedLIst;

public class mainINdouble 
{
   public static void main(String args[])
   {
	   DoubleLinkedList d=new  DoubleLinkedList();
	   d.add(10);
	   d.add(20);
	   d.add(30);
	   
	   d.add(40);
	   d.add(50);
	   d.add(60);
	   System.out.println("size="+d.size());
	   for(int i=0;i<d.size();i++)
	   {
		   System.out.print(d.get(i)+" ");
	   }
	   System.out.println();
	   d.add(3,300);
	   System.out.println("size="+d.size());
	   for(int i=0;i<d.size();i++)
	   {
		   System.out.print(d.get(i)+" ");
	   }


   }

}
