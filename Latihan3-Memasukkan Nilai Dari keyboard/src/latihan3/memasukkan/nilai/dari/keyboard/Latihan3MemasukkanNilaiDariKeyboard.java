/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.memasukkan.nilai.dari.keyboard;

import java.util.Scanner;

/**
 * NAMA  : Heri Firmansah
 * NIM   : A2.1900079
 * Kelas : TI-IC
 * 
 * @author Heri Firmansah
 */
public class Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
                
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}