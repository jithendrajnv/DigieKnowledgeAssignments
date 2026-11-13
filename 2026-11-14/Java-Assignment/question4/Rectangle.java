package Batch10.AssignmentNov1st.question4;


public class Rectangle {
    double width;
    double length;

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.width = 6;

        double area = r.calculateArea();
        System.out.println("Area of rectangle is " + area);

        double perimeter = r.calculatePerimeter();
        System.out.println("Perimeter of rectangle is " + perimeter);
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
