import java.io.*;

public class Karyawan {
    String nip, nama;
    int sts_peg;

    void inputKar() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Data Karyawan");
        System.out.println("NIP \t\t: ");
        nip = keyboard.readLine();
        System.out.print("Nama \t\t:");
        nama = keyboard.readLine();
        System.out.print("Status Pegawai \t: ");
        sts_peg = Integer.parseInt(keyboard.readLine());
        System.out.print("\n ");
    }
}
