package berhitung;
import java.util.Scanner;
public class Berhitung {
  public static void main(String[] args) {
    int A,B;
    char operator;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Inputkan angka beserta operasinya dengan format \"A operasi B\" dengan range 1-1000");
    System.out.print("Inputkan operasi hitung : ");
    A = keyboard.nextInt();
    operator = keyboard.next().charAt(0);
    B = keyboard.nextInt();
    if ((A >= 1 && A <= 1000)&&(B >= 1 && B <= 1000)){
        if (operator == '+'){
            System.out.println(A + B);
        } else if (operator == '-'){
            System.out.println(A - B);
        } else if (operator == '*'){
            System.out.println(A * B);
        } else if (operator == '/'){
            System.out.println(A / B);
        } else if (operator == '%'){
            System.out.println(A % B);
        } else
            System.out.println("operator tidak tepat");
    } else
        System.out.println("angka diluar range");
  }   
}
