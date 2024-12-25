package abstraction.multilevelInheritedAbstrictClass;

abstract class Parent{
    public abstract void parentMethod();
}
abstract class Child extends Parent{
    abstract void childMethod();

}

class GrandChild extends Child{

    @Override
    void childMethod() {
        System.out.println("Child method in grandchild");
    }

    @Override
    public void parentMethod() {
        System.out.println("Parent Method in GrandChild");
    }
}


public class Demo1 {
    public static void main(String[] args) {
         GrandChild grandChild=new GrandChild();

         grandChild.parentMethod();
         grandChild.childMethod();
    }
}
