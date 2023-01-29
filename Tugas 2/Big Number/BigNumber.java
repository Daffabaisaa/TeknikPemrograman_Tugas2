package bignumber;
import java.math.BigInteger;
import java.util.Scanner;
public class BigNumber {
    public static void main(String[] args) {
        BigInteger A,B;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        A = keyboard.nextBigInteger();
        System.out.print("Masukkan angka 2 : ");
        B = keyboard.nextBigInteger();
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}