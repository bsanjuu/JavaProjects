
import java.util.Scanner;

class Arrayss
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array2:\n");
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array1 elements are:\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Array2 elements are:\n");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }




    }
}