public class App {
    public static void main(String[] args) {

        // student object create (real entity of student)

        // 1. Default constructor ---------------------------------

        // create a empty object of student 
        // Student s1 = new Student();

        // fill values in empty object 

        // s1.id = 110;
        // s1.name = "Rahul";
        // s1.nos = 5;
        // s1.age = 22;

        // 2. Parameterzied Constructor ................................

        Student s1 = new Student(101, 22, "Rahul Tak", 6);

        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.nos);
        System.out.println(s1.age);

        s1.bunk();

        // 3. Copy constructor 

        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.id);
        System.out.println(s2.nos);

        s2.sleep();
    }
}
