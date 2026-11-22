import java.util.Scanner;
class found
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
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                found=true;
                System.out.println("elements found at index " + i);
                break;
            }
        }
        if(!found) System.out.println("element not found");
    }
}