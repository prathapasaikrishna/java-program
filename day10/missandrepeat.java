

public class missandrepeat {
    public static void main(String[] args) {
        int N=6;
        int a[]={1,2,3,1,5,6};
        findmissandrepeat(a,N);
    }
    public static void findmissandrepeat(int a[],int n) {
        int repeated=1,missing=-1;
        int temp[]=new int[n+1];
        for (int i=0;i<n;i++){
            temp[a[i]]++;
        }
        for (int i=1;i<=n;i++){
            if (temp[i]==0) {
                missing=i;
                
            }
            if (temp[i]==2) {
                repeated=i;
                
            }
        }
        System.out.println("missing number"+missing+"repeated"+repeated);

        
    }

    
}
