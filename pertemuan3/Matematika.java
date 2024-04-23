public class Matematika {
    public void pertambahan(int x, int y) {
        System.out.println("Pertambahan: " + x + " + " + y + " = " + (x + y));
    }

    public void pengurangan(int x, int y) {
        System.out.println("Pengurangan: " + x + " - " + y + " = " + (x - y));
    }

    public void perkalian(int x, int y) {
        System.out.println("Perkalian: " + x + " x " + y + " = " + (x * y));
    }

    public void pembagian(int x, int y) {
        if (y != 0) {
            System.out.println("Pembagian: " + x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan");
        }
    }

}