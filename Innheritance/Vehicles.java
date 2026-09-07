public class Vehicles {
    public String name;
    public String model;
    public int not;

    public Vehicles(String name, String model, int not){
        this.name = name;
        this.model = model;
        this.not = not;
    }

    public void startEngine(){
        System.out.println("engine is started....");
    }

    public void stopEngine(){
        System.out.println("engine is stoped...");
    }
}
