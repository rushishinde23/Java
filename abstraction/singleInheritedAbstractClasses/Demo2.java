package abstraction.singleInheritedAbstractClasses;

abstract class MathematicalOperation{
    abstract int addition(int a,int b);
    abstract int addition(int a,int b,int c);
}

class ArithmeticOperations extends MathematicalOperation{

    @Override
    int addition(int a, int b) {
        return a+b;
    }

    @Override
    int addition(int a, int b, int c) {
        return a+b+c;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MathematicalOperation mathematicalOperation=new ArithmeticOperations();

        int ans1=mathematicalOperation.addition(12,13);
        int ans2=mathematicalOperation.addition(12,13,25);

        System.out.println("ans1:"+ans1+" "+"ans2:"+ans2);
    }
}
