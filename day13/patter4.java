import java.util.Scanner;

public class patter4 {
    static int secondMax(int arr[]) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }else if(a[i]>second){
                second=arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int secondMax = secondMax(a);
        System.out.println(secondMax);
    }
}


