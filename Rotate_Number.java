import java.util.*;
public class Rotate_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        //nod find
        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        k=k%nod;
        // negative rotation
        if(k<0){
            k=k+nod;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if(i<=k){
                div=div*10;
            }
            else{
                mult=mult*10;
            }
        }
        int q=num/div;
        int r=num%div;

         int rotation = r*mult +q;
        System.out.println(rotation);
        sc.close();
    }
}
