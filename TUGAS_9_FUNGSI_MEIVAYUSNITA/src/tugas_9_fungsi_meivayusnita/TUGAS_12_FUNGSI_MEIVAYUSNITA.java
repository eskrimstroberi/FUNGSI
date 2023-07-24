package tugas_9_fungsi_meivayusnita;
public class TUGAS_12_FUNGSI_MEIVAYUSNITA {
    public static void main(String[] args) {
   
    int s = 2;
        int p = 20;
        int l = 2;
        int luas = luasBalok(s,p,l);
        
        System.out.println(luas);       
    }
    
    //membuat fungsi luasPersegi()
    static int luasPersegi (int sisi){
        return sisi * sisi;
                
    }
    
    static int luasPersegiPanjang (int panjang, int lebar){
        return panjang * lebar;
    }
    
    //membuat fungsi luasKubus
    static int luasBalok(int sisi, int panjang, int lebar){
        
        
        
        //memanggil fungsi luasPersegi
        return 2 * luasPersegi(sisi)+(4 * luasPersegiPanjang(panjang, lebar));
       
    }    
    }  

