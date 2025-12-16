import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int a[]={2,3,1,4,7,5,8};
        Arrays.sort(a);
        boolean isfound=false;
        int k=3;
        int low=0,high=a.length-1;
        while(low<=high){
int mid=low+(high-low/2);
if(a[mid]==k)
{
    isfound=true;
}
else if(a[mid]<k)
{
    low=mid+1;

    }
    else{
        high=mid-1;
    }
}
if(isfound)
{
    System.out.println("search elements is found");
}
}

}
