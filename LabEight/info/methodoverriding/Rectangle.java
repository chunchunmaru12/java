public class Rectangle extends Shape {
    public double length;
    public double breadth;
    public Rectangle(double l,double b){
        this.length = l;
        this.breadth=b;
    }
   
    @Override
    public double calculateArea(){
        double area = this.length*this.breadth;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 2*(this.length+this.breadth);
        return perimeter;
    }

}
