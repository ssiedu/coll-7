package collectionexamples;

public class GMultiple<T1,T2> {

public void add(T1 p1, T1 p2){}
public void sub(T2 p1, T2 p2){}
public void mul(T1 p1, T2 p2){}
public void div(T2 p1, T1 p2){}
    
public static void main(String args[]){
    
    //GMultiple<Integer,String> ob=new GMultiple<>();
    //GMultiple<String,Integer> ob=new GMultiple<>();
    GMultiple<String,Object> ob1=new GMultiple<>();
    
    GMultiple ob=new GMultiple();
    ob.add(10, 20);
    ob.sub("aa", "bb");
    ob.mul(10, "aa");
    ob.div("aa", 20);
    ob.add("aa", "bb");
    ob.sub(10,20);
    ob.mul("ab",20);
    ob.div(44, "ab");
    
    
    
    
}    
}
