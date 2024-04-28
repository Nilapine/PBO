public class test_luar {
    public static void main(String[] args) {
        luar l = new luar();
        luar.tengah t = l.new tengah();
        luar.tengah.dalam d = t.new dalam();
        l.cetakluar();
        t.cetaktengah();
        d.cetakdalam();
    }
} 
