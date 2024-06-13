package Searchings;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int[] a= {33,4,2,7,9,50};
		System.out.println(search(a,5));
		System.out.println(search(a,7));
		
	}

	private static int search(int[] a, int x) 
	{
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			return i;
		}
		return -1;
		
	}

}
