import java.util.Scanner;
class interesr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        double p=sc.nextDouble();
         double t=sc.nextDouble();
         double r=sc.nextDouble();
         double s=(p*t*r)/100;
        System.out.println("interest="+s); 
    }
}