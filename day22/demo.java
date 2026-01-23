package day22;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        demo demo=new demo();
        List<employee>employeeList=demo.genarateEmployees();
        List<employee>filterEmployees=new ArrayList<>();
        for(employee emp:employeeList){
            if ((emp.getMarks()>60)) {
                filterEmployee.add(emp);
                
            }
        }
        System.out.println(filterEmployees);
        collection.sort(filterEmployee,(o1,02)->o1.getId()-o2.getId());
        for(employee emp:filterEmployee){
            System.out.println(emp);

        }

        }
        List<employee>generateEmployee(){
            List<employee>list=new ArrayList<>();
            list.add(new employee(1, "jack", 60));
        } 
        }
        
        
    
    

