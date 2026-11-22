interface Hello
{
    public void say();
}
class LAMDA
{
    public static void main(String[] args)
    {
       Hello h=()->System.out.println("Hello");
       h.say();
    }
}