package gajiagent;
import java.util.Scanner;
public class GajiAgent {
    public static void main(String[] args) {
         int item, gaji;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Jumlah item yang terjual : ");
        item = keyboard.nextInt();
        if (item > 80){
            gaji = item * 50000 * 35 / 100 + 500000;
        } else if (item >= 40) {
            gaji = item * 50000 * 25 / 100 + 500000;
        } else if (item >= 15){
            gaji = item * 50000 * 10 / 100 + 500000;
        } else {
           gaji = 500000 - ((15 - item) * 50000 * 15 / 100); 
        }
        System.out.println("Gaji yang diterima : " +gaji);
    }
}
