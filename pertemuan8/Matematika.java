public class Matematika {

    float hasil;
    float a, b;

    public Matematika(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Matematika() {
    }

    void pertambahan() {
        hasil = a + b;
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " \t= " + hasil);
    }

    void pengurangan() {
        hasil = a - b;
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " \t= " + hasil);
    }

    void perkalian() {
        hasil = a * b;
        System.out.println("Hasil Perkalian: " + a + " x " + b + " \t= " + hasil);
    }

    void pembagian() {
        hasil = a / b;
        System.out.println("Hasil Pembagian: " + a + " : " + b + " \t= " + hasil);
    }

    double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    double pengurangan(double a, double b, double c) {
        return a - b - c;
    }

    double perkalian(double a, double b, double c) {
        return a * b * c;
    }

    double pembagian(double a, double b, double c) {
        return a / b / c;
    }

}