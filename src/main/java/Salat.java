import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Salat {
    public static void egg(){
        System.out.println("░░░░░░░░░░▄▄██████▄▄░░░░░░░░░░\n" +
                "░░░░░░░░▄███▀▀▀▀▀▀███▄░░░░░░░░\n" +
                "░░░░░░▄███▀░░░░░░░░▀███▄░░░░░░\n" +
                "░░░░░▄██▀░░░░░░░░░░░░▀██▄░░░░░\n" +
                "░░░░███▀░░░░░░░░░░░░░░▀███░░░░\n" +
                "░░░███░░░░░░░░░░░░░░░░░░███░░░\n" +
                "░░▄███░░░░░▄▄█▄░░░░░▄▄█▄███▄░░\n" +
                "░░██████▄████████▄████▀█████░░\n" +
                "░███░░▀▀█▀▀░░░░▀▀██▀░░░░▀▀███░\n" +
                "░███░░░░░░░▄█▄░░░░░░▄█▄░░░▀██░\n" +
                "███▀░░▄█▄░░▀▀░░░▄█▄░░▀▀░░▄████\n" +
                "███░░░░▀▀░░░░░░░▀▀░░░░░░░▀▀███\n" +
                "████▄▄░░░▄▄███▄▄░░░▄▄███▄▄░███\n" +
                "███▀███████▀▀▀███████▀▀▀██████\n" +
                "░██▄░░▀▀▀░░░░░░░▀▀▀░░░░░░░███░\n" +
                "░▀██▄░░░░░░░░░░░░░░░░░░░░▄██▀░\n" +
                "░░▀██▄░░░░░░░░░░░░░░░░░░▄██▀░░\n" +
                "░░░▀███▄▄░░░░░░░░░░░░▄▄███▀░░░\n" +
                "░░░░░▀▀████▄▄▄▄▄▄▄▄████▀▀░░░░░\n" +
                "░░░░░░░░░▀▀▀██████▀▀░░░░░░░░░░");
        System.out.println("Уменьшите громкость на пк и введите что угодно в консоли");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        FileInputStream stream = null;
        try {
            stream = new FileInputStream("src\\main\\resources\\egg.mp3");
            Player player = null;
            player = new Player(stream);
            System.out.println("" +
                    "(\\__/)\n" +
                    "(='.'=)\n" +
                    "(\")_(\")");
            player.play();
        } catch (JavaLayerException | FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Runtime.getRuntime().exec("cls");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
