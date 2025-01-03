package constructors.multiLevel;

class Parent{
    Parent(){
        System.out.println("Inside Parent no args constructor");
    }
    Parent(int num,int num2,String name){
        this();
        System.out.println("Inside Parent 3 args constructor");
    }
}

class Child extends Parent{
    Child(){
        super(12,14,"TDIT");
        System.out.println("Inside Child  no args constructor");
    }

    Child(int num,String name,int num2){
        this();
        System.out.println("Inside Child 3 args constructor");
    }

}

class GrandChild extends Child{
    GrandChild(){
        super(10,"java",61);
        System.out.println("Inside GrandChild  no args constructor");
    }
    GrandChild(int num,String name){
        this();
        System.out.println("Inside GrandChild 2 args constructor");
    }

}

public class thisAndSuperDemo {
    public static void main(String[] args) {

       GrandChild grandChild=new GrandChild(23,"RUSHI");

    }
}
