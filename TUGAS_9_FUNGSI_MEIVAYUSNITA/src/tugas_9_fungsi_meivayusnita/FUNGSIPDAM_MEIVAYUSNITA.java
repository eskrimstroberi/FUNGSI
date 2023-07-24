package tugas_9_fungsi_meivayusnita;
import java.util.Scanner;
public class FUNGSIPDAM_MEIVAYUSNITA {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        String nama [] = {"Ali","Budi","Dani","Edi","Umar","Bakri"};
        
        System.out.print("masukkan id : ");
        int id = input.nextInt();
        
        if (id<1 || id>nama.length){
            System.out.println("SALAH INPUT");
            System.exit (0); 
        }
        else{
        System.out.print("masukkan pemakaian air(m3) : ");
        int air = input.nextInt();
        
        int tagihan = hitung (air);
        
        System.out.print("nama pelanggan = "+nama[id-1]);
        System.out.print("Penggunaan air = "+air+"m3");
        System.out.println("Totakl tagihan = Rp. ");
            }
    }
  static int hitung (int air) {
         int admin = 10000;
         int tagihan = 0;
      
      if(air>30){
          tagihan = 50000+admin; 
      }
      else if(air>20){
           tagihan = 40000+admin;
      }
      else if(air>10){
           tagihan = 30000+admin;
      }
      else if(air>0){
           tagihan = 20000+admin;
      }  
      return tagihan;
  }   
  }

