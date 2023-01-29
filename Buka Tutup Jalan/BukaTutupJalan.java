package bukatutupjalan;
import java.math.BigInteger;
import java.util.Scanner;
public class BukaTutupJalan {
    public static void main(String[] args) {
        int[] plat = new int[4];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan 4 Plat Nomor : ");
        for (int i = 0; i < 4; i++){
            plat[i] = keyboard.nextInt();
        }
        
        String plat1 = Integer.toString(plat[0]);
        String plat2 = Integer.toString(plat[1]);
        String plat3 = Integer.toString(plat[2]);
        String plat4 = Integer.toString(plat[3]);
        String x = plat1 + plat2 + plat3 + plat4;
        Long tot = Long.parseLong(x);
        Long hasil = (tot - 999999) % 5;
        if (hasil == 0){
            System.out.println("jalan");
        } else 
            System.out.println("berhenti");
    }
}