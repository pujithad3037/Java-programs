import java.util.*;
class HASH_MAP
{
    public static void main(String[] args)
    {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"Apple");
        hashMap.put(2,"Banana");
        System.out.println("HashMap: "+hashMap);
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        treeMap.put(3,"Orange");
        treeMap.put(1,"graphs");
        System.out.println("treemap: "+treeMap);
    }
}