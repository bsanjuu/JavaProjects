/******************************************************************************

Program to copy all the elements of one array into another array.

* @author Nsanj
*******************************************************************************/

public class ArrayCopy
{
	public static void main(String[] args) {
		
		int a[]= new int[]{1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
		    b[i]=a[i];
		}
		
		System.out.println("Array 1");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println("\n Array 2");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(b[i]+" ");
		}
	
		
		
	}
}
