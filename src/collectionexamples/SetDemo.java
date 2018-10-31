package collectionexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //HashSet<String> set=new HashSet<>();
        //LinkedHashSet<String> set=new LinkedHashSet<>();
        TreeSet<String> set=new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("two");
        System.out.println(set);
        //System.out.println(set.size());
        set.remove("two");
        System.out.println(set);
        //boolean res=set.contains("six");
        //System.out.println(res);
        
        
        
        
    }
}
