import java.util.Scanner;
public class logical
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("AND = "+(a<b && a<c));
        System.out.println("OR = "+(a<b || a<c));
        System.out.println("NOT = "+ !(a<b && a<c));
    }
}
