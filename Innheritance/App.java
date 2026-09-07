public class App {

    public static void main(String[] args) {
        MotorCycle m1 = new MotorCycle("good", "excellent", 2, "Splendra", "m24");

        System.out.println(m1.name);
        System.out.println(m1.not);
        System.out.println(m1.model);
        System.out.println(m1.handleBarStyle);

        m1.startEngine();
        m1.wheel();
        m1.stopEngine();
    }
}
