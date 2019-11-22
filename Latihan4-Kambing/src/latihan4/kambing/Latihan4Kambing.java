/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.kambing;

/**
 * NAMA  : Heri Firmansah
 * NIM   : A2.1900079
 * Kelas : TI-IC
 * 
 * @author Heri Firmansah
 */
public class Latihan4Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambahkan: " + jumlahKambing);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Latihan4Kambing kambingJantan =  new Latihan4Kambing ();
        kambingJantan.tambahKambing();
        // TODO code application logic here
    }
    
}