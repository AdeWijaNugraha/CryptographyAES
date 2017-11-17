/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kriptografiaes;
import java.util.*;
/**
 *
 * @author adewijanugraha
 */
public class KriptografiAES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Plaintext = ");
        String plainText=a.next() ;
        String chiperText = AESenc.encrypt(plainText);
        System.out.println("Hasil Enkripsi = "+chiperText);
        
        plainText = AESenc.decrypt(chiperText);
        System.out.println("Hasil dekripsi = "+plainText);
        
    }
}
