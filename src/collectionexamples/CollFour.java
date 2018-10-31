package collectionexamples;

public class CollFour {

public static void square(int p){
    System.out.println("SQUARE : "+(p*p));
}
public static void show(Object p){
    System.out.println(p);
}    
    
    
public static void main(String args[]){
    //show(10);
    //show(new Integer(10));
    
    square(5);
    
    Integer ob=new Integer(3);
    square(ob.intValue());
    square(ob);
    
}

    
}
