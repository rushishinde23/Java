package singleInteritance;

class Vehicle{
    public void drive(){
        System.out.println("inside vehicle");
    }
    public void type(){
        System.out.println("its transportation vehicle");
    }
}

class Car extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Inside Car");
    }

    }



public class Demo1 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
        c1.type();
    }

}
