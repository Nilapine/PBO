import java.util.Scanner;
public class TestPenjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();
        String inputLagi;

        do {
            System.out.println("Masukkan kode barang:");
            String kode = scanner.next();
            System.out.println("Masukkan nama barang:");
            String nama = scanner.next();
            System.out.println("Masukkan harga satuan:");
            float harga = scanner.nextFloat();
            System.out.println("Masukkan jumlah:");
            int jumlah = scanner.nextInt();

            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.println("Input data lagi [Y/T] ?");
            inputLagi = scanner.next();
        } while (inputLagi.equalsIgnoreCase("Y"));

        scanner.close();
    }
}
