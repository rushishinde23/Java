package ExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);
    }
}

class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}

public class CustomizedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();

        if(age<18){
            throw new TooYoungException("you are too young please wait some more years.");
        }
        else if(age>60){
            throw new TooOldException("your age is more than 60. there are no chances to match your profile.");
        }
        else{
            System.out.println("we will get back to you via email!!");
        }
    }
}
