class Person{
    int age;
    String name;
    void saysHey(){
        System.out.println(name+" "+age+" "+"saysHey");
    }
public static void main(String[] args){
        Person p1=new Person();
        p1.age=24;
        p1.name="Vivek";
        p1.saysHey();
        Person p2=new Person();
        p2.name="Vishal";
        p2.age=19;
        p2.saysHey();
        p1.age=30;
        p1.saysHey();
        p1.saysHey();


        }
}
