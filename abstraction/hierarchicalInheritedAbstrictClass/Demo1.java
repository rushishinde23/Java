package abstraction.hierarchicalInheritedAbstrictClass;

abstract class Parent{
    abstract void parentMethod();
}

class Child1 extends Parent{

    @Override
    void parentMethod() {
        System.out.println("Parent method implementation in child1");
    }

    void child1Method(){
        System.out.println("child 1");
    }
}

class Child2 extends Parent{

    @Override
    void parentMethod() {
        System.out.println("Parent method implementation in child2");
    }
}

class Child3 extends Parent{

    @Override
    void parentMethod() {
        System.out.println("Parent method implementation in child3");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Parent child1=new Child1();
        Parent child2=new Child2();
        Parent child3=new Child3();
        child1.parentMethod();
        child2.parentMethod();
        child3.parentMethod();

    }
}
