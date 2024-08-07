import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Determinan {
    int a, b, c;
	long D;
    double x1, x2;
    Scanner key = new Scanner(System.in);

    void inputABC() {
        System.out.println("======= Masukkan Nilai =======");
        System.out.print("Masukkan nilai a : "); a = key.nextInt();
        System.out.print("Masukkan nilai b : "); b = key.nextInt();
        System.out.print("Masukkan nilai c : "); c = key.nextInt();
    }

    void hitungD() {
        D = (b * b)-(4 * a * c);
    }

    void hitungX1X2() {
        if (D > 0) {
            x1 = (-b + Math.sqrt(D) / (2 * a));
            x2 = (-b - Math.sqrt(D) / (2 * a));
            System.out.println("Akar-akar persamaan kuadrat adalah: \n x1 = " + x1 + "\n x2 = " + x2);
        } else if (D == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Akar-akar persamaan kuadrat adalah: x1 = x2" + x1);
        } else {
            x1 = -b / (2 * a) + Math.sqrt(-D) / (2 * a);
            x2 = -b / (2 * a) - Math.sqrt(-D) / (2 * a);
            System.out.println("Akar-akar imajiner yaitu :\nx1 = " + x1 + "i\nx2 = " + x2 + "i");
        }
    }

    void cetakdeterminan() {
        hitungD();
		System.out.println(" ");
        System.out.println("========= Cetak Nilai =========");
        System.out.println("Nilai a : " + a);
        System.out.println("Nilai b : " + b);
        System.out.println("Nilai c : " + c);
        System.out.println("Determinan (D) : " + D );
		System.out.println(" ");
        hitungX1X2();

    }

}