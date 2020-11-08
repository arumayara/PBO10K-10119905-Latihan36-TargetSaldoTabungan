/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan36.TargetSaldoTabungan;

/**
 *
 * @author aruma
 */
public class Tabungan {
    public float saldo = 3500000;
    public float bunga = 8/100f;
    public float saldoTarget = 6000000;
        
    public void hitungPerbulan (){
        saldo += saldo * bunga;
    }
                
}
