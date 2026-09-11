public class App {
    public static void main(String[] args) {

        // Method Overloading
        Calculator c1 = new Calculator();

        System.out.println(c1.add(5, 9));

        // Function Overriding

        Circle ci = new Circle();
        ci.draw();

        // Upcasting

        Shape sh = new Circle();
        doDraw(sh);

    }

    // upcasting

    public static void doDraw(Shape s) {
        s.draw();
    }

}
