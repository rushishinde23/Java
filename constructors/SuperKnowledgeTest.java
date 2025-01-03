package constructors;


class SuperA {
    SuperA(){
        System.out.println("SuperA class no-arg Constructor");
    }
    SuperA(int a){
        System.out.println("SuperA class 1 arg Constructor");
    }
}
class SuperB extends SuperA{
    SuperB(){
        System.out.println("SuperB class no-arg Constructor");
    }
    SuperB(int a, String b){
        System.out.println("SuperB class 2 arg Constructor");
    }
}

public class SuperKnowledgeTest  extends SuperB{
    SuperKnowledgeTest(){
        super(10,"java");
        System.out.println("SuperKnowledgeTest class no-arg Constructor");
    }
    SuperKnowledgeTest(int a, String b, boolean t){
        System.out.println("SuperKnowledgeTest class 3 arg Constructor");
    }

    public static void main(String[] args) {
        //SuperKnowledgeTest child = new SuperKnowledgeTest(1002, "Program", false);
          SuperKnowledgeTest child2=new SuperKnowledgeTest();
    }
}