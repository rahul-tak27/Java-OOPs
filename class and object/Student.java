// class is created 

public class Student {
    // Attributes

    public int id;
    public int age;
    public String name;
    public int nos;
    // if we are not defined default values of attribute so default value is NULL and 0

    // constructor
    // constructor name and class name is always same

    // 1. default constructor / zero parameter constructor....................
    // public Student() {
    //     System.out.println("Student default constructor is called");
    // }

    // 2. Parameterzied Constructor...........................................

    Student(int id, int age, String name, int nos){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }



    // methods/behaviours

    public void study() {
        System.out.println(name + " studying........");
    }

    public void sleep() {
        System.out.println(name + " sleeping........");
    }

    public void bunk() {
        System.out.println(name + " bunking........");
    }

}
