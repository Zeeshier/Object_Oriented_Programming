class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Circle area: " + shape.area()); // Output: 78.5
        shape = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + shape.area()); // Output: 24.0
        shape = new Triangle(3, 8);
        System.out.println("Triangle area: " + shape.area()); // Output: 12.0
    }
}
