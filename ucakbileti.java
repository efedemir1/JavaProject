package JavaProject;
import java.util.Scanner;


public class ucakbileti {
    public static void main(String[] args) {

        double km, yas, normalUcret, yasIndirimi, indirimliUcret, ekstraIndirim, gitGelUcret;
            byte yolculukTipi;

            Scanner inp = new Scanner(System.in);

            System.out.println("Mesafeyi km cinsinden giriniz : ");
            km = inp.nextDouble();

            System.out.println("Yaşınızı giriniz : ");
            yas = inp.nextDouble();

            System.out.println("Yolculuk tipini giriniz");
            System.out.println("1 => Tek Yön\n2=> Gidiş Dönüş : ");
            yolculukTipi = inp.nextByte();

            normalUcret = (km) * (0.10);

            gitGelUcret = (km * (0.10)) * 2;

            if ((yas < 0) || (km < 0) || (yolculukTipi != 1) && (yolculukTipi != 2)) {
                System.out.println("Hatalı veri girdiniz: ");
            }
            else
            {
                switch (yolculukTipi) {
                    case 1:
                        if ((0 <= yas) && (yas < 12)) {
                            yasIndirimi = (normalUcret * 0.50);
                            indirimliUcret = normalUcret - (yasIndirimi);
                            System.out.println("Normal ücret : " + normalUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else if ((12 <= yas) && (yas < 24)) {
                            yasIndirimi = (normalUcret * 0.10);
                            indirimliUcret = normalUcret - (yasIndirimi);
                            System.out.println("Normal ücret : " + normalUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else if ((24 <= yas) && (yas <= 65)) {
                            yasIndirimi = (normalUcret * 0);
                            indirimliUcret = normalUcret - (yasIndirimi);
                            System.out.println("Normal ücret : " + normalUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else
                        {
                            yasIndirimi = (normalUcret * 0.30);
                            indirimliUcret = normalUcret - (yasIndirimi);
                            System.out.println("Normal ücret : " + normalUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        break;
                    case 2:
                        if ((0 <= yas) && (yas < 12)) {
                            yasIndirimi = (gitGelUcret * 0.30);
                            ekstraIndirim = (gitGelUcret * 0.20);
                            indirimliUcret = (gitGelUcret - (ekstraIndirim + yasIndirimi));
                            System.out.println("Normal ücret : " + gitGelUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else if ((12 <= yas) && (yas < 24)) {
                            yasIndirimi = (gitGelUcret * 0.10);
                            ekstraIndirim = (gitGelUcret * 0.20);
                            indirimliUcret = (gitGelUcret - (ekstraIndirim + yasIndirimi));
                            System.out.println("Normal ücret : " + gitGelUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else if ((24 <= yas) && (yas <= 65)) {
                            yasIndirimi = (gitGelUcret * 0);
                            ekstraIndirim = (gitGelUcret * 0.20);
                            indirimliUcret = (gitGelUcret - (yasIndirimi + ekstraIndirim));
                            System.out.println("Normal ücret : " + gitGelUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        else
                        {
                            yasIndirimi = (gitGelUcret * 0.30);
                            ekstraIndirim = (gitGelUcret * 0.20);
                            indirimliUcret = (gitGelUcret - (yasIndirimi + ekstraIndirim));
                            System.out.println("Normal ücret : " + gitGelUcret);
                            System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                        }
                        break;

                    default:
                        System.out.println("Hatalı veri girdiniz: ");
                        break;
                }
            }
        }
    }
