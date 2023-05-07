import java.util.*;
public class Triangle_Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        //this loop work for roe
        for( i=0; i<n; i++){
            //this loop work for space
            for( j=2*(n-i) ; j>=0; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
