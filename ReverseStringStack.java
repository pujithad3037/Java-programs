import java.util.*;
class ReverseStringStack
{
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.print("enter string:");
String str=sc.nextLine();
Stack<Character>stack=new Stack<>();
for(char c:str.toCharArray()) stack.push(c);
System.out.print("reversed string:");
while(!stack.isEmpty()) 
System.out.print(stack.pop());
}
}