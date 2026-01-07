
public class sixthpattern {
    public static void main(String[] args) {
        int row = 5;
        int n = 1;
        for (int i = 0; i < row; i++) {
            int start = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
               System.out.print(((start+j) %2) + " ");
            }
            System.out.println();

        }
    }

}
