import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] Args) {
        int s1, s2, secim;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz");
        s1 = input.nextInt();
        System.out.println("İkinci sayıy giriniz");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = input.nextInt();
        if (secim == 1) {
            System.out.println("işlem: Toplama \nSonuc= " + (s1+s2));
        } else if (secim == 2) {
            System.out.println("İşlem: Çıkarma \nSonuc= " + (s1-s2));
        } else if (secim == 3) {
            System.out.println("İşlem: Çarpma \nSonuç= " + (s1*s2));
        } else if (secim == 4) {
            if (s1 != 0) {
                if (s2 != 0) {
                    System.out.println("İşlem: Bölme \nSonuç= " + (s1 / s2));
                }
            }
            } else {
                    System.out.println("Yanlış seçim yaptınız");
                }
        }
    }

