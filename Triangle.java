public class Triangle {
    int len;
    int area;

    // Constructor with dynamic initialization
    public Triangle(int len, int area) {
        this.len = len;
        this.area = area;
    }

    // Method to calculate area
    public int calculateArea() {
        return len * area; // Assuming the area is calculated as length * area, this may need to be adjusted
    }

    // Method to calculate volume (or sum, depending on context)
    public int calculateVolume() {
        return len + area;
    }

    // Method to print the area
    public void printArea() {
        System.out.println("Area: " + calculateArea());
    }

    // Method to print the volume (or sum)
    public void printVolume() {
        System.out.println("Volume (or Sum): " + calculateVolume());
    }

    public static void main(String[] args) {
        // Create an object with specific values
        Triangle triangle = new Triangle(5, 10);

        // Print results
        triangle.printArea();
        triangle.printVolume();
    }
}
