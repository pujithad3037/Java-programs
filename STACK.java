import java.util.*;
class STACK
{
    public static void main(String[] args)
    {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: "+stack.peek());
        System.out.println("popped: "+stack.pop());
        System.out.println("now top: "+stack.peek());
    }
}