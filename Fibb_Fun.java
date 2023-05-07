import java.util.Scanner;
public class Fibb_Fun {
    public static void fibb(int n1, int n2, int N) {
        for (int i = 0; i < N; i++) {
            int n3 = n1 + n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        fibb(n1,n2,N);
        sc.close();
    }
}
