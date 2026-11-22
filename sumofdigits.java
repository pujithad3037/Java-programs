import java.util.Scanner;
class sumofdigits
{
    static int sumDigits(int n)

{
    if(n==0)
    return 0;
    return (n%10)+sumDigits(n/10);
}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number:");
    int n=sc.nextInt();
    System.out.println("sum of digit="+sumDigits(n));
}
}