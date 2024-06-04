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
    }
}
