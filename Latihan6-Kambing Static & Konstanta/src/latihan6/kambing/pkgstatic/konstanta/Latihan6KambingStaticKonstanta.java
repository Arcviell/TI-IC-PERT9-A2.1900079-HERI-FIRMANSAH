/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.kambing.pkgstatic.konstanta;

class Mamalia  {
    // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;

}


/**
 * NAMA  : Heri Firmansah
 * NIM   : A2.1900079
 * Kelas : TI-IC
 * 
 * @author Heri Firmansah
 */
public class Latihan6KambingStaticKonstanta {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "UDIN";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
