package Batch10.AssignmentNov1st.question11;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("JK");
        studentNames.add("Jeevan");
        studentNames.add("Rohan");
        studentNames.add("Raju");
        studentNames.add("Satish");

        System.out.println(studentNames);
        //Adding a new name to the list
        studentNames.add("Karan");
        System.out.println(studentNames);
        //Removing the 3rd index element
        studentNames.remove(3);
        System.out.println(studentNames);
        System.out.println(studentNames.size());
        System.out.println(studentNames.get(1));
        studentNames.set(2,"Vikas");
        System.out.println(studentNames);
        for (String names: studentNames) {
            System.out.println(names);
        }







    }
}
