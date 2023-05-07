import java.util.*;
public class Count_Pattern_3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0; i<n; i++){
        int icj=1;
        for (int j=0; j<=i; j++){    //0-<=i tak j, i se jyada hai
            System.out.print(icj+"\t");
            int ijp1=icj*(i-j)/(j+1);
            icj=ijp1;
            }
            System.out.println();
            sc.close();
        }
    }
}
