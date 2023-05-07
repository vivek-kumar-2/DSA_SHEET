import java.util.Arrays;

public class testing {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 2, 3, 1, 8};
        float median=0;
        Arrays.sort(arr);
        for(int x: arr)
            System.out.print(x + "\t");
        int len = arr.length;
        if(len % 2 == 0){
            median = ((float)arr[(len/2 - 1)] + (float)arr[(len/2)])/2;
        }
        else {
            median = arr[(len/2)];
        }
        System.out.println(median);

    }
    
}
