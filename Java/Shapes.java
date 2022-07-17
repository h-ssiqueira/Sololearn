import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }

    //your code goes here
    public class Square{
        private int w;
        Square(int x){
            this.w=x;
        }

        public void area(){
            System.out.println(this.w*this.w);
        }
    }

    public class Circle{
        private int w;
        Circle(int x){
            this.w=x;
        }

        public void area(){
            double d=Math.PI*this.w*this.w;
            System.out.println(d);
        }
    }
}