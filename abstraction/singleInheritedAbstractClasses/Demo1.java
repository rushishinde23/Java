package abstraction.singleInheritedAbstractClasses;

abstract class Parent{

    public abstract void parentMethod();
}

class Child extends Parent{

    @Override
    public void parentMethod() {
        System.out.println("This is method of parent class");
    }
}


public class Demo1 {

    public static void main(String[] args) {
        Child child=new Child();
        child.parentMethod();
    }


}
