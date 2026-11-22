import java.util.LinkedList;
public static LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> names=new LinkedList<>();
        names.add("puji");
        names.add("gowtham");
        names.add("dindu");
        System.out.println("Linkedlist elements: ");
        for(String name: names)
        {
            System.out.println(name);
        }
        names.addFirst("ravi");
        names.addLast("teja");
        System.out.println("linkedlist elements after modifications:");
        for(String name:names)
        {
            System.out.println(name);
        }
        names.removeFirst();
        names.removeLast();
        System.out.println("linked list")
    }
}
