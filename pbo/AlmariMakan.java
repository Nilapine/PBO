/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author D2A
 */
public class AlmariMakan extends Almari implements Discountable{
    int jmlRoda;
    float diskon;
    public void discount(int harga){
        diskon=0.20f*harga;
    }
    void cetak(){
        System.out.println("Harga       : "+harga);
        System.out.println("Bahan       : "+bahan);
        System.out.println("Jumlah Roda : "+jmlRoda);
        System.out.println("Roda        : "+roda);
        System.out.println("Diskon      : "+diskon);
        System.out.println("Bayar       : "+(harga-diskon));
    }
}

