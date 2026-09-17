class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class question8 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

        System.out.println("Dynamic method dispatch using Shape references:");

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
