import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+":"+fact(n));

    }
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
}