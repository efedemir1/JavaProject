package JavaProject;
import java.util.Scanner;

public class sinifigecme {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muzik,toplam;
    Scanner inp= new Scanner(System.in);

    System.out.println("Matematik notunu giriniz :");
    mat= inp.nextInt();
        if ((mat) < 0 || mat > 100)
            System.out.println("Geçersiz not girdiniz.Lütfen tekrar deneyiniz : ");
    System.out.println("Fizik notunu giriniz :");
    fiz = inp.nextInt();
        if (fiz < 0 || fiz > 100)
            System.out.println("Geçersiz not girdiniz.Lütfen tekrar deneyiniz : ");

        System.out.println("Türkçe notunu giriniz :");
        turk=inp.nextInt();
        if (turk < 0 || turk > 100)
            System.out.println("Geçersiz not girdiniz.Lütfen tekrar deneyiniz : ");

        System.out.println("Kimya notunu giriniz :");
        kim= inp.nextInt();
        if (kim < 0 || kim > 100)
            System.out.println("Geçersiz not girdiniz.Lütfen tekrar deneyiniz : ");

        System.out.println("Müzik notunu giriniz :");
        muzik= inp.nextInt();
        if (muzik < 0 || muzik > 100)
            System.out.println("Geçersiz not girdiniz.Lütfen tekrar deneyiniz : ");

        double ortalama;
    toplam=(mat+fiz+turk+kim+muzik);
    ortalama= (toplam / 5);
    System.out.println(ortalama);
    if (ortalama >= 55) {
        System.out.println("Sınıfı geçtiniz :");

    } else {
        System.out.println("Sınıfta Kaldınız");

    }

    }
}
