package input.output;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan kalimat : ");
        String kalimat =keyboard.nextLine();
        String[]A=kalimat.split("[ @?!_,.']+");
        int panjang=A.length;
        System.out.println(panjang);
        for(int i=0;i<panjang;i++){
            System.out.println(A[i]);
        }   
    }
}