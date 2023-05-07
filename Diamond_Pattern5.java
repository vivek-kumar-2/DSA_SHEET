import java.util.*;
public class Diamond_Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int star=1;
        int space =n/2;
        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print("\t");
            }
            for(int j=0; j<star; j++) {
                System.out.print("*\t");
            }
            if(i<n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
            sc.close();
        }
    }
}
