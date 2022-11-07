package JavaProject;
import java.util.Scanner;

public class giris {
    public static void main(String[] args) {

        String userName,password;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        userName=inp.nextLine();
        System.out.print("Şifreniz : ");
password=inp.nextLine();

        if (userName.equals("patika :") && (password.equals(" patika123 : "))) {
            System.out.println("Giriş Başarılı : ");
        } else {
            String vStr= "Şifreniz hatalı";
            System.out.println(vStr);
            int select;

            System.out.println("Şifrenizi sıfırlamak ister misiniz?\nSıfırlamak için\n1-Evet 2-Hayir seciniz");
            select = inp.nextByte();
            switch (select) {
                case 1:
                    String yeniSifre;
                    Scanner src = new Scanner(System.in);
                        System.out.print("Yeni sifre giriniz:");
                        yeniSifre = src.nextLine();
                        if (yeniSifre.equals(password)) {
                            System.out.println("Yeni sifre eskisi ile ayni olamaz");
                        } else {
                            System.out.println("Sifre basariyla olusturuldu..");
                        }
                        break;
                    case 2:
                        System.out.println("Sifre sifirlama islemi gerceklesmedi..");
                        break;
                }

            }

        }
    }


