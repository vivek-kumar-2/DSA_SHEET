//import java.util.*;
public class StringSplit {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        String str;
        str="abc def ghi jkl";
        String []words=str.split(" ");
        for(int i=0; i< words.length; i++){
            System.out.print(words[i]+" ");
        }

    }
}
