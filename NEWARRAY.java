import java.util.ArrayList;
public class NEWARRAY{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));
        numbers.remove(2);
    System.out.println("Elements after removal:");
    for(int number : numbers){
        System.out.println("Size of the ArrayList: " + numbers.size());
        System.out.println(" Is ArrayList empty? " + numbers.isEmpty());

    }

    }
}