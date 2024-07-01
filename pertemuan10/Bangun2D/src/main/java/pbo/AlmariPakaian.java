/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author Nila
 */
public class AlmariPakaian extends Almari implements Discountable{
    int jmlPintu;
    float diskon;
    public void discount(int harga){
        diskon=0.15f*harga;
    }
    void cetak(){
        System.out.println("Harga       : "+harga);
        System.out.println("Bahan       : "+bahan);
        System.out.println("Jumlah Pintu : "+jmlPintu);
        System.out.println("Roda        : "+roda);
        System.out.println("Diskon      : "+diskon);
        System.out.println("Bayar       : "+(harga-diskon));
    }
}
