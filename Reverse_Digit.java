import java.util.Scanner;
class isPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
            while(number>0) {
                int digit = number % 10;
                number = number / 10;
                System.out.println(digit);
                sc.close();
            }
    }
}