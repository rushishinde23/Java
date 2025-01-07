package ExceptionHandling;

public class DefaultExceptionHandlerDemo {
    public static void main(String[] args) {
        System.out.println("main before doStuff");
        doStuff();
        System.out.println("Main after doStuff");
    }
    public static void doStuff(){
        System.out.println("DoStuff before doMoreStuff");
        doMoreStuff();
        System.out.println("DoStuff after doMoreSutfff");
    }
    public static void doMoreStuff(){

        System.out.println("doMoreStuff Before try");
             try{
                 int i=10/0;
             }
             catch (Exception e){
                 System.out.println("Exception occured due to divide by 0");
             }

        System.out.println("doMoreStuff After try");

    }

}
