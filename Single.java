class Shape {
    int area;
}

class Triangle extends Shape {
    int len;

    // Constructor to initialize len and area
    Triangle() {
        len = 5;
        area = 10;
    }

    // Method to calculate and print the area
    void calculateAndPrintArea() {
        System.out.println("Result: " + (len * area));
    }
    void calculateAndPrintvolume() {
        System.out.println("Result: " + (len + area));
    }
}

public class Single {
    public static void main(String[] args) {
        // Create an object of Triangle
        Triangle triangle = new Triangle();

        // Call the method to calculate and print the area
        triangle.calculateAndPrintArea();
        triangle.calculateAndPrintvolume();
    }
}
