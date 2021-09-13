/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable;

/**
 *
 * @author Nefri_Brm
 */
public class Persediaan {
    
    //deklarasai variabel persediaan
    private static double sedia;
    
    //nilai grafik
    private static double koordinat1 = 0;
    private static double koordinat2 = 100;
    private static double koordinat3 = 600;
    
    //agar bisa mengambil nilai permintaan 
    public static double getPersediaan() {
        return sedia;
    }
    
    //memberikan nilai berdasarkan inputan
    public static void setPersediaan(double sedia) {
        Persediaan.sedia = sedia;
    }
    
    //grafik  fungsi turun
    public static double sedikit() {
        if (sedia >= koordinat1 && sedia <= koordinat2) {
            return 1;
        }
        else if (sedia > koordinat2 && sedia < koordinat3) {
            return (koordinat3-sedia)/(koordinat3-koordinat2);
        }
        else return 0;
    }
    
    //grafik  fungsi naik
    public static double banyak() {
        if (sedia > koordinat2 && sedia < koordinat3) {
            return (sedia - koordinat2)/(koordinat3-koordinat2);
        }
        else if (sedia >= koordinat3) {
            return 1;
        }
        else return 0;
    }
    

    
}
