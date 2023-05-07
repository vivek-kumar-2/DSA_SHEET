import java.util.*;
public class Hollow_Diamond_Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Outer_Space = n / 2;
        int Inner_Space = -1;    //let because InnerSpace 2 se increase or decrease
        for (int i = 1; i <= n; i++) {
        //loop for  outer space
            for(int j=1; j<=Outer_Space; j++) {
                System.out.print("\t");
            }
            //one star after Outer_Space
            System.out.print("*\t");

            for(int j=1; j<=Inner_Space; j++) {
                System.out.print("\t");
            }
            //this condition for except of one star
               if(i>1 && i<n) {
                   System.out.print("*\t");
               }

                if(i<=n/2){
                  Outer_Space--;
                  Inner_Space+=2;
                }
                else{
                    Outer_Space++;
                    Inner_Space-=2;
                }
            System.out.println();
            sc.close();
        }
    }
}