package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        for(String s:list){
            System.out.println(s);
        }
        
/*        
        Iterator it=list.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
  */      
        
    }
}
