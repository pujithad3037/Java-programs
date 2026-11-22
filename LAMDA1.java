interface Square
{
    public int display(int a);
}
class LAMDA1
{
    public static void main(String[] args)
    {
        Square s=(x)->x*x;
        System.out.println(s.display(5));
    }
}