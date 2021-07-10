package OOP.Abstraction_Polymorphism;

public interface IShape {
    double getArea();

    double getPerimeter();

    static void display() {
        System.out.println("Hello");
    }


}

class Rectangle implements IShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
       double area =  length* width;
       return area;
    }

    @Override
    public double getPerimeter() {
      double perimeter =  (length+width)*2;
      return perimeter;
    }

}
class Circle implements IShape
{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = radius* 3.14 * radius;
        return area;
    }

    @Override
    public double getPerimeter()
    {
        double perimeter =  radius*2*3.14;
        return perimeter;
    }
}
