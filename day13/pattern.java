
import java.util.Arrays;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};

        int size=sc.nextInt();
        int b[]=new int[size];

        for(int i=5;i<b.length;i++)
        {
            a[i]=sc.nextInt();
        
            
        
        }

       
       System.out.println(Arrays.toString(a));


    }
    

    
}
