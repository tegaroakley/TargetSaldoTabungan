/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        int i = 1;
        while (saldo < 6000000){
           saldo = saldo + (int)((float) saldo*0.08F);
            System.out.println("Saldo di bulan ke-"+ i+" Rp. "+ saldo);
            i++;
           
        }
           
    }
    
}
