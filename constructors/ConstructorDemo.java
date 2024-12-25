package constructors;

class DefaultValues{

    byte byte1=0;
    byte byte2=120;

    short short1;
    short short2=320;

    int int1;
    int int2=100;

    long long1;
    long long2=278734780000007L;

    float f1;
    float f2=13.456f;

    Double double1=0.0;
    Double double2=34233.984494;

    Character ch1;
    Character ch2='v';

    boolean boolean1;
    boolean boolean2=true;

    String s1;
    String s2="RUSHI";

    int [] arr1=new int[8];
    int[] arr2={1,2,5,6,3,7};

    public DefaultValues(){

    }

}

public class ConstructorDemo {
    public static void main(String[] args) {
        DefaultValues defaultValues=new DefaultValues();

        System.out.println("byte1:"+defaultValues.byte1);
        System.out.println("byte2:"+defaultValues.byte2);

        System.out.println("short1:"+defaultValues.short1);
        System.out.println("short2:"+defaultValues.short2);

        System.out.println("int1:"+defaultValues.int1);
        System.out.println("int2:"+defaultValues.int2);

        System.out.println("long1:"+defaultValues.long1);
        System.out.println("long2:"+defaultValues.long2);

        System.out.println("float1:"+defaultValues.f1);
        System.out.println("float2:"+defaultValues.f2);

        System.out.println("double1:"+defaultValues.double1);
        System.out.println("double2:"+defaultValues.double2);

        System.out.println("character1:"+defaultValues.ch1);
        System.out.println("character2:"+defaultValues.ch2);

        System.out.println("boolean1:"+defaultValues.boolean1);
        System.out.println("boolean2:"+defaultValues.boolean2);

        System.out.println("string1:"+defaultValues.s1);
        System.out.println("string2:"+defaultValues.s2);

        System.out.println("arr1:"+defaultValues.arr1);
        System.out.println("arr2:"+defaultValues.arr2);

        for(int i=0;i<defaultValues.arr1.length;i++){
            System.out.print(defaultValues.arr1[i]);
        }

        System.out.println();

        for(int i=0;i<defaultValues.arr2.length;i++){
            System.out.print(defaultValues.arr2[i]);
        }

    }
}
