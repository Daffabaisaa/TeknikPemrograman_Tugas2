package inputoutput2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class InputOutput2 {
    public static void main(String[] args) {
        String[] kata = new String [3];
        double[] angka = new double[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan karakter dana angka sebanyak 3 kali");
        for (int i = 0; i < 3; i++) {
            kata[i] = keyboard.next();
            angka[i] = keyboard.nextDouble();
            if (angka[i]>999 || angka[i] < 0){
                System.out.println("Melewati range angka (0-999)");
                System.exit(i);
            }
        }
        DecimalFormat ft = new DecimalFormat("000");
        System.out.println("==============================");
        for (int i = 0; i < 3; i++){
            System.out.println(String.format("%-9s", kata[i]) + String.format( "%9s", ft.format(angka[i])));
        }
        System.out.println("==============================");
     }
    
}
