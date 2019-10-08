/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan25ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String namaDepan = input.next();
        System.out.println("");
        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah : ");
        for(int i = 1; i <= namaDepan.length(); i++){
            System.out.println("Huruf Ke-" + i + " : " + namaDepan.substring(i-1,i));
        }
        System.out.println("");
        System.out.println("(Developed by mrakhaf)");
        
    }
    
}
