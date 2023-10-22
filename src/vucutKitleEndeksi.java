import java.util.Scanner;
public class vucutKitleEndeksi {
    public static  void main(String[] Args){
        Scanner giris = new Scanner(System.in);

        double kg, boy, indeks;

        System.out.println("Boyunuzu metre olarak giriniz: ");
        boy = giris.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kg = giris.nextDouble();

        indeks = kg / (boy*boy);
        System.out.println("Vucut kitle endeksiniz: "+indeks);
    }
}
