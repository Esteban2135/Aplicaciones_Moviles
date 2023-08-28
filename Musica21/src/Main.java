public class Main {
    public static void main(String[] args) {
        MusicPlayer musicThread = new MusicPlayer();
        MathOperations mathThread = new MathOperations();

        musicThread.start();
        mathThread.start();

        try {
            musicThread.join();
            mathThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas han terminado.");
    }
}
