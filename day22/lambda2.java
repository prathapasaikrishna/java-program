package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class lambda2 {
    public static void main(String[] args) {
        Function<Integer,Integer>f= num->num*num;
        Integer resul= f.apply(2);
        System.out.println(result);
        predicate<String>p= str->str.length()>=5;
        System.out.println(p.test("hello"));

        Consumer<String>c= str-> System.out.println(str);
        c.accept("java");
        List<Integer>list=new ArrayList<>();S
    }
    
}
