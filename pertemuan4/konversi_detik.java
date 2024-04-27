import java.util.Scanner;

public class konversi_detik {
    int detik;
    int hasil;

    Scanner key = new Scanner(System.in);

    public konversi_detik(int detik){
        this.detik = detik;
    }

    public konversi_detik(){}

    void inputDetik(){
        System.out.print("Masukkan detik	: "); detik = key.nextInt();
    }

    void hari(){
        hasil = detik/86400;
        System.out.println("Hari	: " + hasil); 
    }
    void jam(){
        hasil = (detik%86400)/3600;
        System.out.println("Jam	: " + hasil); 
    }
    void menit(){
        hasil = ((detik%86400)%3600)/60;
        System.out.println("Menit	: " + hasil); 
    }
    void detik(){
        hasil = ((detik%86400)%3600)%60;
        System.out.println("Detik	: " + hasil); 
    }


}