import java.util.Scanner;
public class daireAlan{
    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);

        double pi = 3.14;
        int r, a;
        double alan, cevre, dilim;

        System.out.print("Daire Yarıçapını giriniz: ");
        r = giris.nextInt();

        alan = pi * (r * r);

        cevre = 2*(pi*r);

        System.out.print("Merkez açı değerini giriniz: ");
        a = giris.nextInt();

        dilim = pi*((r*r)*a)/360;

        System.out.print("Alan: "+alan);
        System.out.println("Çevre: "+cevre);

        System.out.println("Dilim Alan: "+dilim);
    }
}

