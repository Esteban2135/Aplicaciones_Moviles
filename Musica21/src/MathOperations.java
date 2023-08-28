public class MathOperations extends Thread {
    @Override
    public void run() {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
    }
}
