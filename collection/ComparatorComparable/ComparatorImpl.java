package collection.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  StudentComparator {
    String firstName;
    String lastName;
    int age;
    int fees;

    public StudentComparator(String firstName, String lastName,int age, int fees ) {
        this.fees = fees;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", fees=" + fees +
                '}';
    }

}

class FirstNameComparator implements Comparator<StudentComparator> {

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}

class AgeComparator implements Comparator<StudentComparator> {

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.age-o2.age;
    }
}



public class ComparatorImpl {
    public static void main(String[] args) {
        StudentComparator s1=new StudentComparator("Rushi","Shinde",23,2500);
        StudentComparator s2=new StudentComparator("Ashish","Kate",25,3500);
        StudentComparator s3=new StudentComparator("Tejas","Shikare",19,1500);
        StudentComparator s4=new StudentComparator("Krishna","Dudhate",29,5500);
        StudentComparator s5=new StudentComparator("Shreyash","Solanke",26,3000);

        List<StudentComparator> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("Before Sorting:");
        System.out.println(studentList);

       /* System.out.println("After Sorting by firstName  Comparator:");
        FirstNameComparator firstNameComparator=new FirstNameComparator();

        Collections.sort(studentList,firstNameComparator);
        for(StudentComparator s:studentList){
            System.out.println(s);
        }

        System.out.println("After Sorting by Age Comparator:");
        AgeComparator ageComparator=new AgeComparator();

        Collections.sort(studentList,ageComparator);
        for(StudentComparator s:studentList){
            System.out.println(s);
        }

        */
//        Comparator<StudentComparator> feesComparator= new Comparator<StudentComparator>() {
//            @Override
//            public int compare(StudentComparator o1, StudentComparator o2) {
//                return o1.fees-o2.fees;
//            }
//        };

        Comparator<StudentComparator> feesComparator=(StudentComparator o1,StudentComparator o2)->{
            return o1.fees-o2.fees;
        };

        Collections.sort(studentList,feesComparator);
        for(StudentComparator s:studentList){
            System.out.println(s);
        }

    }
}
