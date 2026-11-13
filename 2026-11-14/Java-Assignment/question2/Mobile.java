package Batch10.AssignmentNov1st.question2;

public class Mobile {
    String brand;
    int price;

    public static void  main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand="Samsung";
        m1.price=10000;
        m2.brand="Nokia";
        m2.price=5000;
        m3.brand="iPhone";
        m3.price=50000;

        System.out.println(m1.brand+", "+m1.price);
        System.out.println(m2.brand+", "+m2.price);
        System.out.println(m3.brand+", "+m3.price);
    }
}
