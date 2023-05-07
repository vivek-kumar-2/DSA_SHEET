import java.util.*;
public class Hollow_diamond_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Outer_Space=n/2;
        int Inner_Space=-1;
        for(int i=1; i<=n; i++){
            System.out.println(Outer_Space+" , "+Inner_Space);
            if(i<=n/2){
                Outer_Space--;
                Inner_Space+=2;
            }
            else{
                Outer_Space++;
                Inner_Space-=2;
                sc.close();
            }

        }
    }

}
