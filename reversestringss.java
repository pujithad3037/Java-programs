import java.util.Scanner;
class reversestringss
{
    static String reverse(String s)

{
    if(s.isEmpty())
    {
        return s;
    }
    return reverse(s.substring(1))+s.charAt(0);
}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a string:");
    String s=sc.nextLine();
    System.out.println("string:"+reverse(s));
}
}