package collectionexamples;

import java.util.LinkedList;

public class CollTwo {
public static void main(String args[]){
    
    String e1="one", e2="two", e3="three", e4="four", e5="five";
    
    LinkedList list=new LinkedList();
    list.add(e1); list.add(e2); list.add(e3);
    System.out.println(list);
    list.addFirst(e4);
    System.out.println(list);
    list.add(1, e5);
    System.out.println(list);
    list.removeFirst();
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    
}        
}
