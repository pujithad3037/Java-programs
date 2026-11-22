interface Add
{
    public int add(int a, int b);
}
class LAMDA2
{
    public static void main(String[] args)
    {
        Add sum=(a,b)->a+b;
        System.out.println(sum.add(5,10));
    }
}