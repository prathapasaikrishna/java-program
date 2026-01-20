import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<String> studentnames = new ArrayList<>();
        studentnames.add("king");
        studentnames.add("dany");
        studentnames.add("krishna");
        studentnames.add("queen");
       if (studentnames.contains("dany")) {
        System.out.println("Found");
        
       }else{
        System.out.println("Not Found");

       }
        
    }
    
}
