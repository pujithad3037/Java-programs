import java.util.Scanner;
import java.util.Arrays;
class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elemnets:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ypu entered array:");
        for(int i=0;i<arr.length;i++)
        {
System.out.println(arr[i]);

        }
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println("reverse array:");
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }
    }
}