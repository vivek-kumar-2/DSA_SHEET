import java.util.*;
public class Triangle_Pattern_Space_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        for(int i=0; i<n; i++){
            System.out.print(space+" , "+star);
            space--;
            star++;
            System.out.println();
            sc.close();
        }
        
    }
}
