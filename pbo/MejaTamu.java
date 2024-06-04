/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author D2A
 */
public class MejaTamu extends Meja implements Discountable{
    public String bentukKaca;
    float diskon;
    public void discount(int harga){
        diskon=0.1f*harga;
    }
    void cetak(){
        System.out.println("Harga   : "+harga);
        System.out.println("Bahan   : "+bahan);
        System.out.println("Jumlah Kaki :"+jmlKaki);
        System.out.println("Kaca    :"+bentukKaca);
        System.out.println("Diskon  : "+diskon);
        System.out.println("Bayar   : "+(harga-diskon));
    }
}
