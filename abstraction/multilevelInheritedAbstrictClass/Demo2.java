package abstraction.multilevelInheritedAbstrictClass;

import org.w3c.dom.ls.LSOutput;

abstract class MathematicalOperations{
    public abstract int addition(int a,int b);
}

abstract class AllOperations extends MathematicalOperations{
    public abstract int substraction(int a,int b);
}

class OperationImpl extends AllOperations{

    @Override
    public int substraction(int a,int b) {
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }

    @Override
    public int addition(int a,int b) {

        return a+b;

    }
}

public class Demo2 {

    public static void main(String[] args) {
        OperationImpl operation=new OperationImpl();

        int add=operation.addition(12,56);
        int sub=operation.substraction(23,67);

        System.out.println("ADD:"+add+" "+"SUB:"+sub);
    }



}
