package Batch10.AssignmentNov1st.question1;

public class Student {
    String name;
    int age;
    String course;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name="Jack";
        student1.age=18;
        student1.course="Selenium";
        student2.name="John";
        student2.age=19;
        student2.course="Playwright";

        System.out.println(student1.name+", "+student1.age+", "+student1.course);
        System.out.println(student2.name+", "+student2.age+", "+student2.course);

    }
}
