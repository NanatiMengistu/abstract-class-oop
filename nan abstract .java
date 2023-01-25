package my abstract.com;


abstract class Sunstar {

    abstract void printInfo();
}
 

class Employee extends Sunstar {

    void printInfo() {

        String name = "honaliyat";

        int age = 21;

        float salary = 222.2;
 

        System.out.println(name);

        System.out.println(age);

        System.out.println(salary);
 

    }
 
}
 

class Base {

    public static void main(String args[]) {

        Sunstar s = new Employee();

        s.printInfo();

    }
}
