class Shape {
    double area;

    Shape(double area) {
        this.area = area;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        super(length * width);
        this.length = length;
        this.width = width;
    }
}

class Square extends Rectangle {
    double sideLength;

    Square(double sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4.0);
        System.out.println("Area: " + square.area);
        System.out.println("Length: " + square.length);
        System.out.println("Width: " + square.width);
        System.out.println("Side Length: " + square.sideLength);
    }
}
