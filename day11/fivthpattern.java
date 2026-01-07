
public class fivthpattern{
    public static void main(String[] args) {
        int row=5;
         int n=1;
        for(int i=1;i<=row;i++){
           int temp=n+i-1;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
               temp--;
            }
            System.out.println();
            n=n+i;

        }
    }
    
}
