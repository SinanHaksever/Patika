import java.util.Scanner;

public class kdvHesapla {
    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);
        int deger;

        System.out.print("Para değerini giriniz: ");
        deger = giris.nextInt();

        int kdv = deger <= 1000 ? 18 : 8;
        System.out.println("KDV oranı: "+kdv);
        System.out.println("KDV'siz para: "+deger);
        double kdvli = ((deger/100)*kdv)+deger;
        System.out.println("KDV'li para: "+kdvli);
        double kdvm = (deger/100)*kdv;
        System.out.println("KDV miktarı: "+kdvm);
    }
}
