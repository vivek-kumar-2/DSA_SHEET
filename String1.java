import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
//        String str1;
//        str1=sc.nextLine();
        str=sc.nextLine();
//        String name="Hello";
//        System.out.println(name+" "+str+" "+str1);
        System.out.println(str.length());
        for(int i=0; i<str.length(); i++)
        System.out.println(str.charAt(i));
        sc.close();
    }
}
