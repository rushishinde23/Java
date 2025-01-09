package ExceptionHandling;

public class ThrowDemo extends RuntimeException {
    static ArithmeticException e=new ArithmeticException();
    public static void main(String[] args) {
        //throw new ArithmeticException("/ by zero explicitly");
        //System.out.println(10/0);
        //throw e;
        //System.out.println("hello");

        throw new ThrowDemo();
    }
}
