import java.util.*;
public class Count_Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n1+"\t"); //n1 print because he travel all sequence
                int n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println();
            sc.close();
        }
    }
}
