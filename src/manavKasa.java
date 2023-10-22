import java.util.Scanner;
public class manavKasa {
    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int a,e,d,m,p;

        System.out.print("Armut kaç kilo? ");
        a = giris.nextInt();
        System.out.print("Elma kaç kilo? ");
        e = giris.nextInt();
        System.out.print("Domates kaç kilo? ");
        d = giris.nextInt();
        System.out.print("Muz kaç kilo? ");
        m = giris.nextInt();
        System.out.print("Patlıcan kaç kilo? ");
        p = giris.nextInt();

        armut *= a; elma *= e; domates *= d; muz *= m; patlican *= p;

        System.out.println("Armut: "+armut+" TL");
        System.out.println("Elma: "+elma+" TL");
        System.out.println("Domates : "+domates+" TL");
        System.out.println("Muz: "+muz+" TL");
        System.out.println("Patlıcan: "+patlican+" TL");
    }
}