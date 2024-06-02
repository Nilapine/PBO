public class Elang extends Hewan {
    Elang(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void suara() {
        System.out.println("Suara\t: Yaakkkk... Waaiiikkkkk");
    }

    @Override
    public void berjalan() {
        System.out.println("Elang berjalan dengan dua kaki");
    }

    @Override
    public void bernafas() {
        System.out.println("Elang bernafas menggunakan paru-paru");
    }
}