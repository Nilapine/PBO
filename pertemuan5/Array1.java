import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int j;
        int[] data;
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Data: ");
        j = input.nextInt();
        data = new int[j];

        for (int i = 0; i < j; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        for (int i = 0; i < j; i++) {
            System.out.println("Hasil Nilai [" + i + "]: " + data[i]);
        }
    }
}