package abstraction.hierarchicalInheritedAbstrictClass;

abstract class Shape{
    abstract void Parameters();
}

class Triangle extends Shape {

    @Override
    void Parameters() {
        System.out.println("Triangle is having 3 sides");
    }
}

class Rectangle extends Shape{

    @Override
    void Parameters() {
        System.out.println("Rectangle is having 4 Sides");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Shape triangle=new Triangle();
        Shape rectangle=new Rectangle();
        triangle.Parameters();
        rectangle.Parameters();
    }
}
