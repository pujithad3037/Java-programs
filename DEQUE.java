import java.util.*;
class Deque{
    public static void main(String[] args)
    {
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");
        System.out.println("Deque: "+dq);
        dq.removeFirst();
        System.out.println("after removefirst: "+dq);
        dq.removelast();
        System.out.println("after removelast:"+dq);
        dq.addFirst("x");
        dq.addlast("y");
        System.out.println("final deque: "+dq);
    }
}