import java.util.*;
public class QueueFinal {
    public static <integer> void main(String[] args) {
        Queue<Integer> que=new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.remove();
        que.peek();
        System.out.println(que);
        que.remove();
        que.remove();
        System.out.println(que+" "+que.size());

    }
}
