import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int st=sc.nextInt();
      int end=sc.nextInt();

      for(int i=st;i<=end;i++)
      {
          if(prime(i)){
             System.out.print(i+" ");
          }
      }

    }

    static boolean prime(int n)
    {
       
       int div=2;
       for(int i=div;i<=n/2;i++)
       {
          if(n%i==0)
          {
            return false;
          }
       }
       return true;
    }
}