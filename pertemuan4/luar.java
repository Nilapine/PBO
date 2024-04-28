public class luar {
    void cetakluar(){
        System.out.println("Cetak Luar........");
        //CetakTengah();
    }
    class tengah{
        void cetaktengah(){
            cetakluar();
            System.out.println("Cetak Tengah........");
            // CetakDalam();
        }
        class dalam{
            void cetakdalam(){
                cetakluar();
                cetaktengah();
                System.out.println("Cetak dalam........");
            }
        }
    }
}
