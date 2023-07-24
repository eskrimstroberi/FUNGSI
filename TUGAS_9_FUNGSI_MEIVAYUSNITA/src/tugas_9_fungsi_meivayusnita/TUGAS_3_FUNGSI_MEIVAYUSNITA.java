package tugas_9_fungsi_meivayusnita;
import java.lang.Math;
import java.util.Scanner;
public class TUGAS_3_FUNGSI_MEIVAYUSNITA {
static Scanner input = new Scanner (System.in);

                public static void max (int a, int b, int c) {
                    int maks;
                    System.out.print("nilai tertinggi :");
                    maks = Math.max(a, b);
                    if (c>maks){
                        maks = c;
                    }
                    System.out.println(maks);  
                }               
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                     int a,b,c;
                    
                    System.out.println("Masukan nilai a : ");
                    a=input.nextInt();
                    
                    System.out.println("Masukan nilai b : ");
                    b = input.nextInt();
                    
                    System.out.println("Masukan nilai c: ");
                    c=input.nextInt();
               
                max (a,b,c);
                    
                    
                    
                }

    }  
