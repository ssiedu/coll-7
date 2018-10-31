package collectionexamples;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("two");
        System.out.println(list);
        //System.out.println(list.size());
        list.remove("two");
        System.out.println(list);
        list.remove("two");
        System.out.println(list);
        
        
        
        
    }
    
}
