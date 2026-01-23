package day22;

public class employee {
    private int id;
    private String name;
    private int marks;

    public employee(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){
        return id;

    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        
        return this.id+" "+this.name+" "+this.marks+" ";
        
    }
    
}
