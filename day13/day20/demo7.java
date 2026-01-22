import java.util.*;

public class demo7 {
    public static void main(String[] args) {

        Student student1 = new Student("Ramu", 21);
        Student student2 = new Student("Rahul", 20);
        Student student3 = new Student("dany", 19);
        Student student4 = new Student("Sharma", 24);
        Student student5 = new Student("Rohit", 29);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s);
        }
    }
}