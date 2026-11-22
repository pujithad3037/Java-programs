import java.util.Scanner;
class userinput {
    public static void main(String[] args)
    {
        int a,bs;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("add="+(a+b));
        System.out.println("Sub="+(a-b));
        System.out.println("Mul="+a*b);
        System.out.println("div="+a/b);
        System.out.println("mod="+ a%b);
    }
}