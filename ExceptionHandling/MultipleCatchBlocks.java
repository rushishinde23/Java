package ExceptionHandling;


public class MultipleCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Stmt 1");
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);

        }

        System.out.println("Stmt 2");
    }
}
