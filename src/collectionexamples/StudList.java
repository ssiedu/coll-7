package collectionexamples;

import java.util.ArrayList;

public class StudList {
    public static void main(String[] args) {
        Stud s1=new Stud(111, "AAA", "CS", 4);
        Stud s2=new Stud(112, "BBB", "IT", 3);
        Stud s3=new Stud(113, "CCC", "CS", 2);
        Stud s4=new Stud(114, "DDD", "Mech", 1);
        Stud s5=new Stud(115, "EEE", "Civil", 5);
        

        ArrayList<Stud> list=new ArrayList<>();
        list.add(s1); list.add(s2);
        list.add(s3); list.add(s4); list.add(s5);
        
        for(Stud s:list){
            
            if(s.rno==115){
            s.show();
            }
        }
        
        
        
        
        
        
        

        
    }
    
}
