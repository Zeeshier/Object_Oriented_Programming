public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
    }
}

// Circle
public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

//Rectangle
public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
