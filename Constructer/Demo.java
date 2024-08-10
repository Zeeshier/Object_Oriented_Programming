
package constructer;
public class Constructer {
    private int a,b;
    public void set(int x, int y){
    a =x; b=y;
}
    public void show(){
        System.out.println("value of a = "+ a);
        System.out.println("value of b = "+ b);
    }
    public void sum(){
        System.out.println("sum = "+ (a+b));
    }
    Constructer(){
        a =b=0;
        System.out.println("No argument constructer");
    }
    Constructer(int x , int y){
        a =x ; b=y;
            System.out.println("2 argument constructer");

    }
    public static void main(String[] args) {
        Constructer obj = new Constructer();
        Constructer obj2 = new Constructer(10,20);
        obj2.sum();
        obj.set(20, 50);
        obj.show();
        obj2.show();
    }
}
