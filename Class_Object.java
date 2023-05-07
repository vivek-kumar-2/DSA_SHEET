public class Class_Object {
   public static class Person{
       int age;
       String name;
       void SayHi(){
           System.out.println(name+" "+" "+age);
       }
   }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Vivek";
        p1.age=24;
        p1.SayHi();
        Person p2=new Person();
        p2.name="Vishal";
        p2.age=21;
        p2.SayHi();

    }
}
