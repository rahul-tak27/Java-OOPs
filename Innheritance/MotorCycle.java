public class MotorCycle extends Vehicles {
    public String handleBarStyle;
    public String suspensionType;

    public MotorCycle(String handleBarStyle, String suspensionType, int not, String name, String model){
        super(name, model, not);

        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheel(){
        System.out.println("wheeling is started....");
    }
    
}
