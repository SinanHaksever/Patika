
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);

        int km;
        double perkm = 2.20, ucret;
        System.out.print("Mesafeyi kilometre cinsinden giriniz: ");
        km = giris.nextInt();
        ucret = (perkm*km);
        ucret = ucret < 20 ? 20 : ucret;
        System.out.println("Toplam Tutar: "+ucret);
    }
}
