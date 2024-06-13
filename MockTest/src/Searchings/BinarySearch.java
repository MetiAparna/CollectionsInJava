package Searchings;

public class BinarySearch 
{
	public static void main(String[] args) {
		
	
	int[] a= {34,2,6,8,21,9};
	 System.out.println(search(a,6,0,a.length-1));
	 System.out.println(search(a,21,0,a.length-1));

	 System.out.println(search(a,7,0,a.length-1));

	}

	public static int search(int[] a, int x, int i, int j)
	{
	    if(i>j)return -1;
	   
	    int mid=(i+j)/2;
	    if(x==a[mid]) return mid;
	    else if(x<a[mid])
	    	return search(a,x,i,mid-1);
	    else
		return search(a,x,mid+1,j);
		
	}
}
