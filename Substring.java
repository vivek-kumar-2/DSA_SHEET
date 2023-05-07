import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
//        str.substring(0,3);
//        String A=str.substring(0,3);
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.print(str.substring(i,j));
                System.out.println();
                sc.close();
            }
        }
    }
}
