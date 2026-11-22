import java.util.Scanner;
import java.util.Arrays;
class binary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter key value:");
        int key=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("array is sorted:"+arr[i]);
        }
        int index=Arrays.binarySearch(arr,key);
        System.out.println("Element found at index:"+index);
    }
}