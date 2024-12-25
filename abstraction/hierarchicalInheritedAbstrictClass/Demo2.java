package abstraction.hierarchicalInheritedAbstrictClass;

abstract class MathematicalOperation{
    abstract int addition(int a,int b);
    public  boolean isEqual(String s1,String s2){
         return s1.equals(s2);
     }
}

class ArithmeticOperations extends MathematicalOperation {

    @Override
    int addition(int a, int b) {
        return a+b;
    }
    }

class LogicalOperation extends MathematicalOperation{

    @Override
    int addition(int a, int b) {
        return a+b;
    }
}


public class Demo2 {
    public static void main(String[] args) {

        MathematicalOperation mathematicalOperation=new ArithmeticOperations();

        int ans1=mathematicalOperation.addition(12,13);

        System.out.println("ans1:"+ans1);

        MathematicalOperation logicalOperation=new LogicalOperation();
        boolean res1=logicalOperation.isEqual("Rushi","Rushi");

        System.out.println(res1);
    }
}

