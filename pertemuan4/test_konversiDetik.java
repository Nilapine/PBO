import java.util.Scanner;

public class test_konversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi;

        do {
            konversi_detik hitung = new konversi_detik();

            hitung.inputDetik();
            hitung.hari();
            hitung.jam();
            hitung.menit();
            hitung.detik();

            System.out.println("Input data lagi (y/t)? ");
            inputLagi = input.nextLine();

        } while (inputLagi.equalsIgnoreCase("y"));

        input.close();
    }
}