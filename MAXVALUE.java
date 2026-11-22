import java.util.*;
class maxvalue
{
    public static void main(String[] args)
    {
        Scannersc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.print("enter number of elements:");
        int n=sc.nextInt();
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            stack.push(sc.nextInt());
        }
        int max=Integer.MIN_VALUE;
        for(int val:stack)
        {
            if(val>max)
            {
                max=val;
            }
        }
        System.out.println("largest element: "+max);
    }
}