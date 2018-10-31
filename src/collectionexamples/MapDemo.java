package collectionexamples;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Stud s1=new Stud(111, "AAA", "CS", 4);
        Stud s2=new Stud(112, "BBB", "IT", 3);
        Stud s3=new Stud(113, "CCC", "CS", 2);
        Stud s4=new Stud(114, "DDD", "Mech", 1);
        Stud s5=new Stud(115, "EEE", "Civil", 5);
        
        HashMap<String,Stud> map=new HashMap<>();
        
        map.put("111",s1);
        map.put("112",s2);
        map.put("113",s3);
        map.put("114",s4);
        map.put("115",s5);
        
        
        Stud s=map.get("114");
        s.show();
        
        
        
        
        
    }
    
}
