package JavaProject;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil, sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        yil = inp.nextInt();
        sonuc = yil % 400;
        if (sonuc == 0) {
            System.out.println(yil + " bir artık yıldır ");
        } else {
            System.out.println(yil + " artık bir yıl değildir ");
        }
    }
}