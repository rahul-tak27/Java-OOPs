public class Car extends Vehicles{
    public int nod;
    public String transmissionType;

    public Car(int nod, String transmissionType, int not, String name, String model){
        super(name, model, not);
        this.nod = nod;
        this.transmissionType = transmissionType;
    }

    public void startAc(){
        System.out.println("AC is started....");
    }

}
