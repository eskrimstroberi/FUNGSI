package tugas_9_fungsi_meivayusnita;
import java.util.Scanner;
public class TUGAS_7_FUNGSI_MEIVAYUSNITA {
 static Scanner input = new Scanner (System.in);
 
    public static void hitung(int a, int b, int c) {
        System.out.println("hasil = "+(a+b+c));   
    }
    public static void main(String[] args) {
        System.out.println("masukkan bilangan 1: ");
        int bil1 = input.nextInt();
        System.out.println("masukkan bilangan 2: ");
        int bil2 = input.nextInt();
        hitung (bil1, bil2, 100);
    }
}
