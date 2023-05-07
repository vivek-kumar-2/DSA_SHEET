import java.util.*;
public class Hollow_Pattern_Count6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n/2+1;
        int space=1;
        for(int i=0; i<n; i++){
            System.out.println(star+" , "+space+" , "+star);
            if(i<n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
                sc.close();
            }
        }
    }
}
