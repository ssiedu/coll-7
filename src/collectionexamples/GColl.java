package collectionexamples;

import java.util.Stack;

public class GColl {
public static void main(String args[]){
    
    Stack<String> stk1=new Stack<>();
    stk1.push("one"); stk1.push("two");
    //stk1.push(10); stk1.push(20);
    String r1=stk1.pop();
    
    Stack<Integer> stk2=new Stack<>();
    stk2.push(10); stk2.push(20);
    //stk2.push("one"); stk2.push("two");
    Integer r2=stk2.pop();
    
    
    Stack stk3=new Stack();
    stk3.push(10); stk3.push(20);
    stk3.push("one"); stk3.push("two");
    
    String r3=(String)stk3.pop();
    
    
    
}    
}
