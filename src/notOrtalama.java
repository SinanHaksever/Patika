import java.util.Scanner;
public class notOrtalama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = giris.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = giris.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = giris.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = giris.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = giris.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = giris.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        String sonuc = toplam >= 60 ? "Geçtiniz." : "Kaldınız!";

        System.out.print("Ders Ortalaması: " + toplam + "\n");
        System.out.println(sonuc);

    }
}
