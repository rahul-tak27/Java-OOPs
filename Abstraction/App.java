abstract class Bird{
    abstract void fly();
    abstract void eat();

}

class sparrow extends Bird{
    void fly(){
        System.out.println("sparrow is flying");
    }

    void eat(){
        System.out.println("sparrow is eating");
    }
}

class parrot extends Bird{
    void fly(){
        System.out.println("parrot is flying alg way");
    }

    void eat(){
        System.out.println("parrot is eating");
    }
}

public class App {
    public static void main(String[] args) {

        // so here Bird is interface 
        // we are not create here parror or sparrow object - we create Bird object that is act like as an interfaces b1.eat()----> parrot;

        // Bird b1 = new parrot();
        // b1.eat();
        // b1.fly();

        // Bird b2 = new sparrow();
        // b2.fly();
        // b2.eat();

        Bird b1 = new parrot();
        Bird b2 = new sparrow();

        birdDOStuff(b1);
        birdDOStuff(b2);     
    }

    public static void birdDOStuff(Bird b){
        b.fly();
        b.eat();
    }
}
