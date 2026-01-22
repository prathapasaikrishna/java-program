
import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        //raw type
       Map map=new HashMap<>();
       
        Map<Integer,String> Map= new HashMap<>();
        map.put(1,"kohli");
        map.put(2, "dhoni");
        map.put(3, "rohit");
        System.out.println(map.get(2));
        System.out.println(map.get(5));
        System.out.println(map.getOrDefault(5,"unknow name"));

        Map<Integer,String>map1= new HashMap<>();
        map1.put(4, "dany");
        map1.put(5, "krishna");
        map.putAll( map1);
        System.out.println(map);

        // Map<Integer,String>map2= Map.Of(1,"kohli",2,"dany");
        // System.out.println(map2);

        Set<Integer> keys =map.keySet();
        for(Integer key :keys) {
            System.out.println(map.get(keys));
        }
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String>entry:entries){
            System.out.println(entry.getKey()+""+entry.getValue());
        }

    }
    
}
