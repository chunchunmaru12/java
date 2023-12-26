import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

class ExerciseOne {
    public static void main(String[] args) {
        double area;
        double radius;
        double pi;
        pi = 3.141;
        radius = 10;
        area = pi * radius * radius;
        System.out.println("area of circle = " + area);
        System.out.println("");
        int length = 10, breadth = 10;
        area = length * breadth;
        System.out.println("area of rectangle = " + area);
        System.out.println("");
        double l = 1, w = 1, h = 1;
        area = 2 * l * w + 2 * l * h + 2 * h * w;
        System.out.println("area of cuboid is " + area);
        System.out.println("");
        double leng = 10;
        area = 6 * leng * leng;
        System.out.println("area of cube is " + area);
        System.out.println("");

        double base = 10, height = 100;
        area = base * height;
        System.out.println("area of rhombus is " + area);
        System.out.println("");
        System.out.println("");
        double peri;
        double r = 7;
        peri = 2 * pi * r;
        System.out.println("perimeter of circle " + peri);
        System.out.println("");
        double le = 10, be = 9;
        peri = 2 * (le + be);
        System.out.println("perimeter of rectangle is " + peri);
        System.out.println("");
        double lengt = 10, bread = 10, heigh = 5;
        peri = 4 * (lengt + heigh + bread);
        System.out.println("perimeter of cuboid is " + peri);
        System.out.println("");
        double a = 10;
        peri = 12 * a;
        System.out.println("perimeter of cube is " + peri);
        System.out.println("");
        a = 5;
        peri = 4 * a;
        System.out.println("perimeter of rhombus is " + peri);
        System.out.println("");
        double leg = 10;
        double b = 10;
        double he = 10;
        double vol;
        vol = leg * b * he;
        System.out.println("volume of cuboid is " + vol);
        System.out.println("");
        vol = leg * leg * leg;
        System.out.println("volume of cube is " + vol);
        System.out.println("");

    }
}