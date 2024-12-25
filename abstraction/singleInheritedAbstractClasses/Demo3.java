package abstraction.singleInheritedAbstractClasses;

abstract class Shape{
    abstract void Parameters();
}

class Triangle extends Shape{

    @Override
    void Parameters() {
        System.out.println("Triangle is having 3 sides");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Shape shape=new Triangle();
        shape.Parameters();
    }
}
