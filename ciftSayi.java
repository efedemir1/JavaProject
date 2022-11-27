package JavaProject;
import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        k = input.nextInt();
        int ortalama = 0;
        int sayiAdedi =0;
        for (int i = 0; i < k; i++) {
            if(i % 3 == 0 & i % 4 == 0){
                ortalama += i;
                sayiAdedi++;
            }
        }
        int result = ortalama / (sayiAdedi - 1);
        System.out.println("Sayıların Ortalaması :" + result);
    }
}
