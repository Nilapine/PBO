import java.util.Scanner;

public class HewanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Hewan singa = new Singa("Mamalia", "Berbulu tebal");
        Hewan elang = new Elang("Burung", "Memiliki sayap lebar");
        Hewan lebah = new Lebah("Serangga", "Memiliki antena dan sengat");
        Hewan paus = new Paus("Mamalia laut", "Berukuran besar");

        while (true) {
            System.out.println("Pilihan Hewan : ");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda [1-5]: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                System.out.println("=========================================");
                    System.out.println("Tentang Singa:");
                    System.out.println("Jenis\t: " + singa.jenis);
                    System.out.println("Ciri\t: " + singa.ciri);
                    singa.suara();
                    singa.berjalan();
                    singa.bernafas();
                    System.out.println("=========================================");
                    System.out.println("\n");
                    break;
                case 2:
                System.out.println("=========================================");
                    System.out.println("Tentang Elang:");
                    System.out.println("Jenis\t: " + elang.jenis);
                    System.out.println("Ciri\t: " + elang.ciri);
                    elang.suara();
                    elang.berjalan();
                    elang.bernafas();
                    System.out.println("=========================================");
                    System.out.println("\n");
                    break;
                case 3:
                System.out.println("=========================================");
                    System.out.println("Tentang Lebah:");
                    System.out.println("Jenis\t: " + lebah.jenis);
                    System.out.println("Ciri\t: " + lebah.ciri);
                    lebah.suara();
                    lebah.berjalan();
                    lebah.bernafas();
                    System.out.println("=========================================");
                    System.out.println("\n");
                    break;
                case 4:
                System.out.println("=========================================");    
                System.out.println("Tentang Paus:");
                    System.out.println("Jenis\t: " + paus.jenis);
                    System.out.println("Ciri\t: " + paus.ciri);
                    paus.suara();
                    paus.berjalan();
                    paus.bernafas();
                    System.out.println("=========================================");
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        }
    }
}