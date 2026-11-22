class Printer
{
    void display(String s)
    {
        System.out.println(s);
    }
}
interface PrintString
{
    void print(String s);
}
class PRINTER{
    public static void main(String[] args)
    {
        Printer p=new Printer();
        PrintString ps=p::display;
        ps.print("hello java");
        ps.print("method reference example");

    }
}