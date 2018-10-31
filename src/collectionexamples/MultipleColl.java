package collectionexamples;

import java.util.ArrayList;

public class MultipleColl {
    public static void main(String[] args) {
        ArrayList<String> cs=new ArrayList<>();
        ArrayList<String> it=new ArrayList<>();
        cs.add("A"); cs.add("B"); cs.add("C");
        it.add("X"); it.add("Y"); it.add("Z");
        
        System.out.println(cs);
        System.out.println(it);
        System.out.println("____________________________________________");
        
        ArrayList<String> all=new ArrayList<>();
        all.addAll(cs);
        all.addAll(it);
        System.out.println(all);
        //all.removeAll(cs);
        all.retainAll(cs);
        System.out.println(all);
        all.clear();
        System.out.println(all);
        
    }
    
}
