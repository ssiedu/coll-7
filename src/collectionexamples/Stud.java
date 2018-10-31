package collectionexamples;

public class Stud {
    int rno;
    String name;
    String branch;
    int sem;

    public Stud(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    public void show(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
    
}
