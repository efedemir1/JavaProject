package JavaProject;
import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isEror = false;
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz : ");
        month = inp.nextInt();
        System.out.println("Doğduğunuz günü giriniz : ");
        day = inp.nextInt();

        switch (month) {
            case 1:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Oğlak burcu ";
                    } else {
                        burc = "Kova burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 2:
                if ((1 <= day) && (day <= 28)) {
                    if (day < 20) {
                        burc = "Kova burcu";
                    } else {
                        burc = "Balık burcu ";
                    }
                } else {
                    isEror = true;

                }
                break;
            case 3:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 21) {
                        burc = "Balık burcu";
                    } else {
                        burc = "Koç Burcu";
                    }
                } else {
                    isEror = true;
                }

                break;

            case 4:
                if (((1 <= day) && (day <= 30)))
                    if (day < 21) {
                        burc = "Koç Burcu";
                    } else {
                        burc = "Boğa Burcu";
                    }
                else {
                    isEror = true;
                }
                break;
            case 5:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Boğa burcu";
                    } else {
                        burc = "İkizler burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 6:
                if ((1 <= day) && (day <= 30)) {
                    if (day < 23) {
                        burc = "İkizler burcu";
                    } else {
                        burc = "Yengeç burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 7:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Yengeç burcu";
                    } else {
                        burc = "Aslan burcu";
                    }
                } else {
                    isEror = true;
                }

                break;
            case 8:
                if ((1 <= day) && (day <= 30)) {
                    if (day < 23) {
                        burc = "Aslan burcu";
                    } else {
                        burc = "Başak Burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 9:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 23) {
                        burc = "Başak burcu";
                    } else {
                        burc = "Terazi burcu";
                    }
                } else {
                    isEror = true;
                }
                break;

            case 10:
                if ((1 <= day) && (day <= 30)) {
                    if (day < 23) {
                        burc = "Terazi burcu";
                    } else {
                        burc = "Akrep burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 11:
                if ((1 <= day) && (day <= 31)) {
                    if (day < 22) {
                        burc = "Akrep burcu";
                    } else {
                        burc = "Yay burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            case 12:
                if ((1 <= day) && (day <= 30)) {
                    if (day < 22) {
                        burc = "Yay burcu";
                    } else {
                        burc = "Oğlak burcu";
                    }
                } else {
                    isEror = true;
                }
                break;
            default:
                System.out.println("Hatalı Bir Ay Girdiniz...");
        }
                if (isEror) {
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz : " + isEror);

                } else {
                    System.out.println("Merhaba,burcunuz : " + burc);
                }
        }
    }

