/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan36.TargetSaldoTabungan;

/**
 *
 * @author
 * Nama     : Abraham Rumayara
 * Kelas    : IF10K
 * NIM      : 10119905
 * Deskripsi Program : Program ini merupakan program Taget saldo tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        Tabungan tabungan = new Tabungan();
        Tampilkan(tabungan);
    }
    
    public static void Tampilkan(Tabungan tabungan)
    {
        int i = 1;
         while(tabungan.saldo <= tabungan.saldoTarget){
            tabungan.hitungPerbulan();
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f\n", i, tabungan.saldo);
            i++;
        }
    }
    
    
}
