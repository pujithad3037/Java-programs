import java.util.Scanner;
class fib
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("fibonocci of "+n+":"+fib(n));

    }
    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}