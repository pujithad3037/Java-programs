import java.util.LinkedList;
class ADD_LIST
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("C");
        list.add(1,"B");
        System.out.println("Linkedlist: "+list);
    }
}