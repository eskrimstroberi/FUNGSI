package tugas_9_fungsi_meivayusnita;
public class TUGAS_9_FUNGSI_MEIVAYUSNITA {
   public static void salam() {
        System.out.println("selamat pagi");
    }
    public static int penjumlahan (int a, int b) {
        int hasil = a+b;
        return hasil;
    }
    public static String BMI(int berat, double tinggi){
        double bmi = berat / (tinggi*tinggi);
        String hasil = "";
        if (bmi <18.5){
            System.out.println("hasil kekurangan berat badan");
        }
        else if (bmi <24.9){
            System.out.println("berat badan normal ideal");
        }
        else if (bmi <29.9){
            System.out.println("hasil kelebihan berat badan");
        }
        else {
            hasil = "obesitas";
        }
        return hasil;
    }
    public static void main(String[] args) {
        salam ();
        System.out.println(penjumlahan (5, 4));
        System.out.println(BMI (50, 1.6));
    }
} 

