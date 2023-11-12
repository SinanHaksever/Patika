package hesapla;
import java.util.Scanner;

public class userInput {
    public static void main(String[] Args){
        Scanner giris = new Scanner(System.in);
        
        String un = "patika";
        String pass = "12345";
        String u, p, s, f;
        
        System.out.println("kullanıcı Adı: ");
        u = giris.nextLine();
        System.out.println("parola: ");
        p = giris.nextLine();
        
        if(p != pass){
            System.out.println("şifreniz yanlış! sıfırlamak istermisini? (E - H)");
            s = giris.nextLine();
            if(s.equals("E") || s.equals("e")){
                System.out.println("Yeni şifreyi giriniz..");
                f = giris.nextLine();
                if(f.equals(pass)){
                    System.out.println("Şifre oluşturulamadı! Lütfenbbaşka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşrturuldu");
                }
            }
        } else {
            System.out.println("Giriş başaerılı. Hoşgeldiniz.");
        }
        
    }
}