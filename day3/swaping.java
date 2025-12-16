public class swaping {
    public static void main(String[]args) {
        int a=20, b=30;
        System.out.println(a +""+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+""+b);


        a=a+b;
        b=a-b;
        a=a-b;
    }

}
