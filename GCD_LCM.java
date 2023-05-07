import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int orig_n1=num1;
        int orig_n2=num2;
        while(num1 % num2!=0){
            int reminder=num1%num2;
             num2=reminder;
             num1=num2;
        }
        int gcd=num2;
        int lcm=(orig_n1*orig_n2) / gcd;
        System.out.println(gcd+" "+lcm);
        sc.close();
    }
}
