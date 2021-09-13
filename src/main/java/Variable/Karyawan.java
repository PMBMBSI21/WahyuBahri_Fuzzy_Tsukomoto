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
public class Karyawan {
  
     //deklarasai variabel permintaan   
    private static double pegawai;
    
    //nilai grafik
    private static double koordinat1 = 0;
    private static double koordinat2 = 50;
    private static double koordinat3 = 200;
    
    //agar bisa mengambil nilai permintaan 
    public static double getKaryawan() {
        return pegawai;
    }
    
    //memberikan nilai berdasarkan inputan
    public static void setKaryawan(double pegawai) {
       Karyawan.pegawai = pegawai;
    }
    
    //grafik  fungsi turun
    public static double sedikit() {
        if (pegawai >= koordinat1 && pegawai <= koordinat2) {
            return 1;
        }
        else if (pegawai > koordinat2 && pegawai < koordinat3) {
            return (koordinat3-pegawai)/(koordinat3-koordinat2);
        }
        else return 0;
    }
    
    //grafik  fungsi naik
    public static double banyak() {
        if (pegawai > koordinat2 && pegawai < koordinat3) {
            return (pegawai - koordinat2)/(koordinat3-koordinat2);
        }
        else if (pegawai >= koordinat3) {
            return 1;
        }
        else return 0;
    }
  
}
