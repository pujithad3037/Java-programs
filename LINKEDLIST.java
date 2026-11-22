import java.util.*;
class LINKEDLIST
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedListStack
{
    Node top;
    void push(int val)
    {
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;
    }
    int pop()
    {
        if(top==null)
        {
            System.out.println("stack underflow");
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
    }
    void display()
    {
        Node temp=top;
        System.out.print("stack elements:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        LinkedListStack stack=new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("popped: "+stack.pop());
        stack.display();
    }
}