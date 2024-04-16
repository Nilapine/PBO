import java.util.Scanner;
public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    Scanner key = new Scanner (System.in);

    public Penjualan(){};
    // Method untuk mengatur data penjualan
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Method untuk menghitung total pembelian
    public float getTotalPembelian() {
        return harga * jumlah;
        //System.out.println("Total harga : " + total);
    }

    // Method untuk menentukan bonus
    public String getBonus() {
        String bonus = "Tidak ada bonus";

        if (getTotalPembelian() >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (getTotalPembelian() >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (getTotalPembelian() >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        }

        return bonus;
    }

    // Method untuk mencetak nota
    void cetakNota() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Satuan: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }
}
