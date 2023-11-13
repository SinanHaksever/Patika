import java.util.Scanner;

public class sicaklik {
    static public void main(String[] Args){
        Scanner giris = new Scanner(System.in);
        
        int heat;
        
        System.out.println("Bugün hava kaç derece?");
        heat = giris.nextInt();
        
        if(heat < 5){
            System.out.println("Kayak yapabilirsin.");
        } else if(heat > 25){
            System.out.println("Hava çok güzel. Yüzmeye gidebilirsin.");
        if(heat >= 5 && heat <= 15){
            System.out.println("Tam sinema havası var.");
        } else if(heat >= 15 && heat <= 25){
            System.out.println("Bu havada piknik çok iyi olur.");
        }
    }
    }
    
}