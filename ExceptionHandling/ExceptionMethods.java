package ExceptionHandling;

public class ExceptionMethods {
    public static void main(String[] args) {
        System.out.println("statement 1");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            //e.printStackTrace();
            //System.out.println(e.toString());
            //System.out.println(e.getMessage());
        }
        System.out.println("statement 2");

    }
}
