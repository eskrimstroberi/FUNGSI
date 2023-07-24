package tugas_9_fungsi_meivayusnita;
import java.util.Scanner;
public class TUGAS_6_FUNGSI_MEIVAYUSNITA {
 static Scanner input = new Scanner (System.in);
    public static void hitung(int a, int b) {
        System.out.println("hasil ="+(a+b));   
    }
    public static void main(String[] args) {
        System.out.println("masukkan bilangan 1 : ");
        int bil1 = input.nextInt();
        System.out.println("masukkan bilngan 2 : ");
        int bil2 = input.nextInt();
        
        hitung (bil1, bil2);
    }
}
