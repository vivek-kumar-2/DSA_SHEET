public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        sb.setCharAt(0,'d');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2,'o');
        sb.append(1);
        System.out.println(sb);


    }
}
