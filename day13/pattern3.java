
import java.util.Scanner;

public class pattern3 {
    static int max(int[] arr)
    {
        int maxElement=Integer.MIN_VALUE;//-2147483648
        //System.out.println(maxElement);
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>maxElement)
            {
                maxElement=arr[i];
            }   
        }
        return maxElement;

    }
    static int min(int[] arr)
    {
        int minElement=Integer.MAX_VALUE;//+2147483647
        //System.out.println(maxElement);
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<minElement)
            {
                minElement=arr[i];
            }   
        }
        return minElement;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxElement=max(a);
        System.out.println(maxElement);
        int minElement=min(a);
        System.out.println(minElement);
    }
}

