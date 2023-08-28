import javax.sound.sampled.*;

public class MusicPlayer extends Thread {
    @Override
    public void run() {
        System.out.println("Iniciando la reproducción de música...");

        String filePath = "C:/Users/User/Desktop/resources/y2mate.com-Me-Pones-en-Tension.wav";

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000); 

            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Terminando la reproducción de música...");
    }
}




