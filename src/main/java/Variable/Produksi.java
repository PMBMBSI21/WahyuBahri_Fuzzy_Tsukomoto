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
public class Produksi {
    
        //deklarasai variabel produksi
    private static double produk;
    
    //nilai grafik
    private static double koordinat1 = 0;
    private static double koordinat2 = 2000;
    private static double koordinat3 = 7000;
    
    //agar bisa mengambil nilai produksi
    public static double getProduk() {
        return produk;
    }
    
    //memberikan nilai berdasarkan inputan
    public static void setProduk(double produk) {
        Produksi.produk = produk;
    }
    
    //grafik  fungsi turun
    public static double berkurang() {
        if (produk >= koordinat1 && produk <= koordinat2) {
            return 1;
        }
        else if (produk > koordinat2 && produk < koordinat3) {
            return (koordinat3-produk)/(koordinat3-koordinat2);
        }
        else return 0;
    }
    
    //grafik  fungsi naik
    public static double bertambah() {
        if (produk > koordinat2 && produk < koordinat3) {
            return (produk - koordinat2)/(koordinat3-koordinat2);
        }
        else if (produk >= koordinat3) {
            return 1;
        }
        else return 0;
    }
    
    //menghitung jumlah produksi
    public static double berkurang (double in) {
         return (koordinat3-(in *(koordinat3-koordinat2)));
    }
    
    public static double bertambah (double in) {
         return (koordinat2+(in *(koordinat3-koordinat2)));
    }
    

    
}
