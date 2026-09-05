// class is created 

public class Student {
    // Attributes

    private int id;
    private int age;
    private String name;
    private int nos;

    // getter and setter
    public int getId(){
        return this.id;
    } 

    public int getAge(){
        return this.age;
    } 

    public String getName(){
        return this.name;
    } 
    
    public int getNos(){
        return this.nos;
    }

    // setter 
    public void setAge(int age){
        if(age >=18 && age <= 100){
            this.age = age;
        }
        return ;
    }

    public void setName(String name){
        this.name = name;
    }


    // parametrized constructor 
   
    Student(int id, int age, String name, int nos){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // 3. Copy Constructor 
    // copy construcor is take object as an parameter s-> datatype -> object

    Student(Student s){
        this.id = s.id;
        this.age = s.age;
        this.name = s.name;
        this.nos = s.nos;
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
