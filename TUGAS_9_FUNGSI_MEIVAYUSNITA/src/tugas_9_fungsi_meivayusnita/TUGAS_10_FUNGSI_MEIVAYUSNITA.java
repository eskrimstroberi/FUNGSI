package tugas_9_fungsi_meivayusnita;
import java.util.Scanner;
public class TUGAS_10_FUNGSI_MEIVAYUSNITA {
 static Scanner masukkan = new Scanner (System.in);
 
    public static void hitung() {
     int angka=0;
        System.out.println("masukkan angka: ");
        angka = masukkan.nextInt();
        if (angka %2==0){
        System.out.println("bilangan tidak prima");
        }
        else {
        System.out.println("bilangan prima");
}
    }
        public static void main(String[] args) {
        hitung();
    }
}
