import java.util.Scanner;
class countidig
{
    static int countDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return 1+countDigits(n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter an integer:");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("number of digits:1");
        }
        else
        {
            System.out.println("number of digits:"+countDigits(n));
        }
    }
}