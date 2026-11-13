package Batch10.AssignmentNov1st.question6;

public class Transportation {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();
        car.start();
        car.stop();
    }
}
