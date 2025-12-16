import java.util.Arrays;

public class sortzeroonetwo {
    public static void main(String[] args) {
        int a[]={0,2,1,2,0,1};
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++){
         if(a[i]==0){
            c0++;
         }else if(a[i]==1){
            c1++;
         }else  {
            
         }{
          c2++;
         }
         for(int j=c0;j<c0;j++) {
            a[j]=0;

         }for(int n=c0;n<c0+c1;n++){
            a[n]=1;

            
         }for(int k=c0+c1;k<a.length;k++){
            a[k]=2;
         }
         }
        System.out.println(Arrays.toString(a));
    }
    
}
