import java.util.Scanner;
public class hipotenus{

    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu girin: ");
        int kenar1 = giris.nextInt();
        System.out.print("İkinci kenar uzunluğunu girin: ");
        int kenar2 = giris.nextInt();
        double hipo = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs: "+hipo);

        double u, alan;

        u=(kenar1+kenar2+hipo)/2;
        alan = u * (u - kenar1)* (u - kenar2) * (u - hipo);

        System.out.println("Alan: " + alan);
        }

}
