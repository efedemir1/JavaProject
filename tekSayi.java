package JavaProject;
import  java.util.Scanner;
public class tekSayi {
    public static void main(String[] args) {
        int sayi, total=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("sayı giriniz: ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                total += sayi;
            }
        } while (sayi % 2 == 0);


        System.out.println("Toplam :"+ total );

    }
}

