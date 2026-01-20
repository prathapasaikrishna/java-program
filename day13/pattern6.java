import java.util.Arrays;
import java.util.Scanner;

public class pattern6 {
    static void rotate(int[] arr,int k){
       reverse(arr, 0, arr.length-1);
       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length-1);
   }

   static void reverse(int[] arr,int st,int end){
      while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
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
        int k=sc.nextInt();
        rotate(a, k);

        System.out.println(Arrays.toString(a));
    }
}

