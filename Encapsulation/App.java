public class App {
    public static void main(String[] args) {

        Student s1 = new Student(101, 22, "Rahul Tak", 6);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getNos());
        System.out.println(s1.getId());

        s1.setAge(19);
        s1.setName("Ramdyal");

        System.out.println("new updated name and age");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}
                    