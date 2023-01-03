package OOP;
public class ClassAndObject {
    public static void main(String[] args) {
        Student student1 = new Student();//this is the object.
        student1.roll=12;
        student1.name="Chayan SD";
        student1.marks=88.4f;
        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println(student1.marks);

    }
}
class Student{
    //this is the class.
    //for every student
    int roll;
    String name;
    float marks;
}
