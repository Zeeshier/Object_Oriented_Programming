import java.util.Scanner;

public class Polymorphism {
    protected int height, width;

    public void draw(int h, int w) {
        height = h;
        width = w;
    }
    public static class Rec extends Polymorphism {
        @Override
        public void draw(int h, int w) {
         width = w; height =h;
            System.out.println("Area of Rectangle: " + (height * width));
        }
    }
    public static class Tri extends Polymorphism {
        @Override
        public void draw(int h, int w) {
         width = w; height =h;
            System.out.println("Area of Triangle: " + (height * width) / 2);
        }
    }
    public static void main(String[] args) {
        Rec obj = new Rec();
        Tri obj1 = new Tri();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Height and Width");
        int h = in.nextInt();
        int w = in.nextInt();
        obj.draw(h, w);
        obj1.draw(h, w); 
    }
}
