public class Constructor1 {
    public static class Person{
        String name;
        int age;
        void SayHi(){
            System.out.println(name+" "+" "+age);
        }
        //Default Constructor
        Person(){

        }
        //Parameterized Constructor
        Person(int age, String name){
//    lf we can't write this. keyword if not pass print value null
 //         age=age;- given error therefore we use this
            this.age=age;
            this.name=name;

        }
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Bittu";
        p1.age=24;
        p1.SayHi();

       // this object for parameterized
        Person p2=new Person(20, "B");
        p2.SayHi();

    }
}
