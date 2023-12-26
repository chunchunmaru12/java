public class Circle extends Shape{
    public double radius;
    public final static double PI=3.1428;
    public Circle(double r){
        this.radius =r;
    }
    @Override
    public double calculateArea(){
        double area = PI*this.radius*this.radius;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 2*PI*this.radius;
        return perimeter;
    }
}
