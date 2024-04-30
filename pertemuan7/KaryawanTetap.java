import java.io.*;

public class KaryawanTetap extends Karyawan {
    double gapok;
    int jml_anak;

    void inputTetap() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--Karyawan Tetap--");
        System.out.println("Gaji Pokok \t: ");
        gapok = Double.parseDouble(keyboard.readLine());
        System.out.print("Jumlah Anak\t: ");
        jml_anak = Integer.parseInt(keyboard.readLine());
    }

    double totalGaji() {
        return gapok + (jml_anak * (0.1 * gapok));
    }
}
