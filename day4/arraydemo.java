
import java.util.Scanner;
public class arraydemo {

    public static void main(String[] args) {
        int[][] a1={
            {1,2},
            {4,5},
            {7,8},
        };
        int rowlen=a1.length;
        int collen=a1[0].length;
        int row=3,col=2;
        int [][]a=new int[row][col];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<col;i++)
            {
                for(int j=0;j<col;j++)
                {
                    a[i][j]=sc.nextInt();
                }
                }
for(int i=0;i<row;i++)
{
    for(int j=0;j<col;j++)
    {
        System.out.println(a[i][j]+"");
    }
    System.out.println();






        }
    }
}