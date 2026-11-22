import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scanner.nextInt();
        int originalnum=num;
        int sum=0;
        int reminder;
        int numofdigits=String.valueOf(num).length();
        do
        {
            reminder=num%10;
            sum+=Math.pow(reminder,numofdigits);
            num/=10;
        }
        while(num!=0);
        if(sum==originalnum)
        {
            System.out.println(originalnum+"is an armstrong number.");
        }
        else{
            System.out.println(originalnum+"is not armstrong number."); 
        }
    }
}