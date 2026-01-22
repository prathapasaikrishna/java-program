public class student implements Comparable<student> {

   private int regno;
   private String name;
   student(){
    System.out.println("i am student");
   }
   student(int regno,String name){
    this.regno=regno;
    this.name=name;
   }

   public int getRegno(){
    return regno;
   }
   public String getName() {
    return name;
   }
   public void SetRegno(int regno){
    this.regno=regno;
   }
   @Override
   public int compareTo(student o) {
   return this.regno-o.regno;
   }
   @Override
   public String toString(){
    return this.regno+" "+this.name;
   }
   


}
    

