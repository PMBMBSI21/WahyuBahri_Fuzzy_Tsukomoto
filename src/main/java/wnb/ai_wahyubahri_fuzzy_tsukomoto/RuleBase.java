/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnb.ai_wahyubahri_fuzzy_tsukomoto;

import Variable.Karyawan;
import Variable.Permintaan;
import Variable.Persediaan;
import Variable.Produksi;

/**
 *
 * @author Nefri_Brm
 */
public class RuleBase {
    
    private static double [] x_produksi = new double [12];
    private static double [] y_produksi = new double [12];
    private static double jumlah;
    
    // rules
    public static void menghitungNilaiX(){
        x_produksi[0] = Math.min(Permintaan.turun(), Persediaan.banyak());
        x_produksi[0] = Math.min(x_produksi[0], Karyawan.sedikit());
        
        x_produksi[1] = Math.min(Permintaan.turun(), Persediaan.banyak());
        x_produksi[1] = Math.min(x_produksi[1], Karyawan.banyak());
        
        x_produksi[2] = Math.min(Permintaan.turun(), Persediaan.sedikit());
        x_produksi[2] = Math.min(x_produksi[2], Karyawan.sedikit());
        
        x_produksi[3] = Math.min(Permintaan.turun(), Persediaan.sedikit());
        x_produksi[3] = Math.min(x_produksi[3], Karyawan.banyak());
        
        x_produksi[4] = Math.min(Permintaan.naik(), Persediaan.banyak());
        x_produksi[4] = Math.min(x_produksi[4], Karyawan.sedikit());
        
        x_produksi[5] = Math.min(Permintaan.naik(), Persediaan.banyak());
        x_produksi[5] = Math.min(x_produksi[5], Karyawan.banyak());
        
        x_produksi[6] = Math.min(Permintaan.naik(), Persediaan.sedikit());
        x_produksi[6] = Math.min(x_produksi[6], Karyawan.sedikit());
        
        x_produksi[7] = Math.min(Permintaan.naik(), Persediaan.sedikit());
        x_produksi[7] = Math.min(x_produksi[7], Karyawan.banyak());
        
      
    }
    
    public static void menghitungNilaiY(){
        y_produksi[0] =Produksi.berkurang(x_produksi[0]);
 
        y_produksi[1] =Produksi.bertambah(x_produksi[1]); 

        y_produksi[2] =Produksi.berkurang(x_produksi[2]);

        y_produksi[3] =Produksi.berkurang(x_produksi[3]);

        y_produksi[4] =Produksi.berkurang(x_produksi[4]);

        y_produksi[5] =Produksi.bertambah(x_produksi[5]);
        
        y_produksi[6] =Produksi.berkurang(x_produksi[6]);
        
        y_produksi[7] =Produksi.berkurang(x_produksi[7]);
          
    }
    
    public static double hasilProduksi() {
        double atas=0, bawah =0;
        
        for (int i = 0; i<12; i++) {
            System.out.println("y_produk ke- " + i + " : " + y_produksi[i]);
            System.out.println("x_produk ke- " + i + " : " + x_produksi[i]);
            atas+=(x_produksi[i]*y_produksi[i]);
            bawah+=x_produksi[i];
        
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
        
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

    
}
