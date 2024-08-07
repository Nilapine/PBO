import java.io.*;
import java.text.DecimalFormat;

public class KaryawanDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
        Karyawan kar = new Karyawan();
        KaryawanTetap tetap = new KaryawanTetap();
        KaryawanKontrak kontrak = new KaryawanKontrak();

        kar.inputKar();
        if (kar.sts_peg == 1) {
            tetap.inputTetap();
            System.out.println("Gaji Diterima   : " + df.format(tetap.totalGaji()));
        } else {
            kontrak.inputKontrak();
            System.err.println("Upah Diterima \t: " + df.format(kontrak.totalUpah()));
        }
    }
}