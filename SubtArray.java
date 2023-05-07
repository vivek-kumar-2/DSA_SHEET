import java.util.Scanner;

public class SubtArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Sub = 0;
        for (int i = 0; i < n; i++) {
            Sub = arr[n - 2] - arr[0];
        }
        System.out.println(Sub);
        sc.close();
    }
}
