import java.util.Scanner;
public class fibbonacciii {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int N=sc.nextInt();
        int n3;
        System.out.println(n1+" "+n2);
        for(int i=0; i<N; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            sc.close();
        }
    }
}
