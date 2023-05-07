import java.util.Scanner;
public class Inverse_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int inverse=0;
        int orig_pos=1;
        while (number!=0){
            int orig_digit=number%10;
            int inv_digit=orig_pos;
            int inv_place=orig_digit;
//        make change inv using inv_pos,inv_digit
        inverse=inverse +inv_digit*(int)Math.pow(10, inv_place-1);

             number=number/10;      //number chhota ho raha hai
             orig_pos++;
        }
        System.out.println(inverse);
    }
}
