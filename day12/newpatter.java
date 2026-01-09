
import java.util.Scanner;

public class newpatter {
    public static void main(String[] args) {
        int row=5;
        for (int i=1;i<=row;i++) {
            for (int danny=1;danny<=row-i;danny++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
