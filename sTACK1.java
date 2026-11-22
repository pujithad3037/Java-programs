import java.util.Scanner;
;
class sTACK1
{
    int top=-1;
    int max=100;
    int[] stack=new int[max];
    void push(int data)
    {
        if(top>=max-1)
        System.out.println("Stack overflow");
        else
        stack[++top]=data;
    }
    void pop()
    {
        if(top<0)
        System.out.println("Stack underflow");
        else
        System.out.println(stack[top--]+"popped");
    }
    void display()
    {
        System.out.println("Stack elements:");
        for(int i=top;i>=0;i--)
        System.out.println(stack[i]);
    }
    public static void main(String[] args)
    {
        sTACK1 s=new sTACK1();
        s.push(10);
        s.push(20);
        s.display();
        s.pop();
        s.display();
    }
}