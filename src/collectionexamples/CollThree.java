package collectionexamples;

import java.util.Arrays;

public class CollThree {
    public static void main(String[] args) {
        int ar[]={15,22,5,7,9,14,100,45,24};
        for(int tmp:ar){
            System.out.println(tmp);
        }
        System.out.println("___________________________");
        Arrays.sort(ar);
        for(int tmp:ar){
            System.out.println(tmp);
        }
        System.out.println("___________________________");
        int idx=Arrays.binarySearch(ar, 55);
        System.out.println("Index : "+idx);
    }
    
}
