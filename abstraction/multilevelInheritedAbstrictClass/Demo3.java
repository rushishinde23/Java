package abstraction.multilevelInheritedAbstrictClass;

abstract class Shape{
    abstract void Parameters();
}

 abstract class Triangle extends Shape {

  abstract double Area(int base,int height);
}

class TriangleImpl extends Triangle{


    @Override
    void Parameters() {
        System.out.println("Triangle have 3 sides");
    }

    @Override
    double Area(int base, int height) {
        return 0.5*base*height ;
    }
}

public class Demo3 {
    public static void main(String[] args) {

        TriangleImpl triangle=new TriangleImpl();

        triangle.Parameters();
        double area=triangle.Area(5,8);

        System.out.println("Area:"+area);


    }
}
