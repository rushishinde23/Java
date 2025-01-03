package constructors.hierarchical;

class Parent{
    Parent(){
        System.out.println("Inside Parent No Args");
    }
    Parent(int num,String name){
        this();
        System.out.println("Inside Parent 2 Args");
    }
}

class Child1 extends Parent{
    Child1(){
        System.out.println("Inside Child1 No Args");
    }
}

class Child2 extends Parent{
    Child2(){
        super(12,"krishna");
        System.out.println("Inside Child2 No Args");
    }
    Child2(String name,int id){
        this();
        System.out.println("Inside child2 2 args");
    }
}

class Child3 extends Parent{
    Child3(){
        System.out.println("Inside Child3 No Agrs");
    }
}

public class thisAndSuperHierarchicalDemo {
    public static void main(String[] args) {
       // Child3 child3=new Child3();
          Child2 child2=new Child2("Rushi",1234);
    }
}