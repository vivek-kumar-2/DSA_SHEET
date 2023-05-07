import java.util.*;
public class Diagonal_Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int i,j;
          int star=n;
          for( i=0; i<n; i++){
              for( j=0; j<star; j++) {
                  if (i == j) {
                      System.out.print("*\t");
                  } else {
                      System.out.print("\t");
                  }
              }
              System.out.println();

          }
    }
}
