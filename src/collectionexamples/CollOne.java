package collectionexamples;

import java.util.Stack;

public class CollOne {
public static void main(String args[]){
    
    String e1="one", e2="two", e3="three", e4="four", e5="five";
    
    Stack stk=new Stack();
    stk.push(e1); stk.push(e2); stk.push(e3);
    stk.push(5);
    Integer i1=(Integer)stk.pop();
    System.out.println(i1.intValue()+3);
    System.out.println(i1+3);
}    
}
