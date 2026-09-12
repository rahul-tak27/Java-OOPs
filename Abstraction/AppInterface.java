interface Animal {
    void sound();
}

class Dog implements Animal{
    public void sound() {
        System.out.println("Dog barks....!");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Cat is miyau...!!");
    }
}

public class AppInterface {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        // a1.sound();

        Animal a2 = new Cat();
        // a2.sound();

        doBird(a1);
        doBird(a2);
    }

    public static  void doBird(Animal a){
        a.sound();
    }
}

