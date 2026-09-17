public class question6 {
    static class Shape {
        String shapeName;

        Shape(String shapeName) {
            this.shapeName = shapeName;
        }

        void displayShapeName() {
            System.out.println("Shape: " + shapeName);
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            super("Rectangle");
            this.length = length;
            this.width = width;
        }

        double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 5);

        circle.displayShapeName();
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println();

        rectangle.displayShapeName();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
