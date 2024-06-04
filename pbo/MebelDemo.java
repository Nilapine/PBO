/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author D2A
 */
public class MebelDemo {
    public static void main(String[] args) {
        MejaTamu mt=new MejaTamu();
        mt.harga=5000000;
        mt.bahan="Jati Tua";
        mt.jmlKaki=5;
        mt.bentukKaca="Oval";
        mt.discount( mt.harga);
        mt.cetak();
        System.out.println("============================");
        System.out.println("========ALMARI PAKAIAN======");
        AlmariPakaian ap=new AlmariPakaian();
        ap.harga=2500000;
        ap.bahan="Stainless";
        ap.roda=false;
        ap.jmlPintu=4;
        ap.discount( ap.harga);
        ap.cetak();
        System.out.println("============================");
        System.out.println("=========ALMARI MAKAN========");
        AlmariMakan am=new AlmariMakan();
        am.harga=1000000;
        am.bahan="Stainless";
        am.roda=false;
        am.jmlRoda=8;
        am.discount( ap.harga);
        am.cetak();
    }
}
