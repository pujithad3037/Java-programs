import java.util.*;
class ARRAY_STACK
{
    static int top=-1;
    static int maxSize=100;
    static int[] stack=new int[maxSize];
    public static void main(int val)
    {
        if(top>=maxSize-1)
        System.out.println("stack overflow");
        else stack[++top]=val;
    }
    public static int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else return stack[top--];
    }

public static void display()
{
    if(top<0)
    System.out.print("stack is empty:");
    else{
       System.out.print("stack element: ");
    for(int i=0;i<=top;i++)
    System.out.print(stack[i]+" ");
    System.out.println();
}
}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    push(10);
    push(20);
    push(30);
    display();
    System.out.println("popped: "+pop());
    display();
}
}
