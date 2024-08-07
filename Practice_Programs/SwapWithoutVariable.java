/******************************************************************************

Program to swap two numbers without third variable
* @author Nsanj

*******************************************************************************/

public class SwapWithoutVariable
{
	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.print("before swap a="+a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\n after swap a="+a+" b= "+b);
		
		
		
	}
}
