
import java.util.Scanner;

public class pattern2 {
    static void reverse(int a[]) {
        int st = 0;
        int end = a.length - 1;
        while (st < end) {
            int temp = a[st];
            a[st] = a[end];
            a[end] = temp;
            st++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        reverse(a);
        for (int i = 0; i<n ;i++) {
            System.out.print(a[i] + " ");
        }
        //System.out.println(a[0]);

    }
}

