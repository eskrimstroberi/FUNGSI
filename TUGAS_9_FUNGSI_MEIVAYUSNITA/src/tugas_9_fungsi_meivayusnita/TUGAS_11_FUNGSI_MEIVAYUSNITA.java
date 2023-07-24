package tugas_9_fungsi_meivayusnita;
public class TUGAS_11_FUNGSI_MEIVAYUSNITA {
    public class bangunRuang {
    
    public static void main(String[] args) {
       int s= 12;
       int luas= luasKubus (s);
       
       System.out.println(luas);
    }
  // fungsi luas persegi
static int luasPersegi (int sisi){
    return sisi * sisi;
}
static int luasKubus (int sisi){
    //memanggil luas persegi
    return 6*luasPersegi (sisi);
}
}
}
