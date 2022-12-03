package JavaProject;
import java.util.Scanner;
public class KuvvetBulma {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz:");
        n = inp.nextInt();
        for (int i = 1; i <=n; i*=4) {
            System.out.println("Girilen sayının dördüncü kuvveti: " + i);
        }
            for (int i = 1; i <=n; i *= 5) {
                System.out.println("Girilen sayının besinci kuvveti: " + i);
            }
        }
    }
