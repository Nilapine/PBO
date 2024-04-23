public class suhu {

    float hasil;
    int Celcius;

    public suhu(int Celcius){
        this.Celcius = Celcius;
    }

    public suhu(){}


    void hitungKelvin (int Celcius){
        System.out.println("PROGRAM KONVERSI SUHU");
        System.out.println("=====================");
        hasil = Celcius + 273.15f;
        System.out.println("Konversi suhu Celcius ke Kelvin\t\t : "+ Celcius +" C adalah " + hasil + " K");
    }
    void hitungFarhenheit (int Celcius){
        hasil = Celcius * 1.8f + 32;
        System.out.println("Konversi suhu Celcius ke Farhenheit\t : "+ Celcius +" C adalah " + hasil + " F");
    }
    void hitungRankine (int Celcius){
        hasil = Celcius * 1.8f + 491.67f;
        System.out.println("Konversi suhu Celcius ke Rankine\t : "+ Celcius +" C adalah " + hasil + " Ra");
    }
    void hitungDalisle (int Celcius){
        hasil = (100 - Celcius) * 1.5f;
        System.out.println("Konversi suhu Celcius ke Dalisle\t : "+ Celcius +" C adalah " + hasil + " De");
    }
    void hitungNewton (int Celcius){
        hasil = Celcius * 33/100;
        System.out.println("Konversi suhu Celcius ke Newton\t\t : "+ Celcius +" C adalah " + hasil + " N");
    }
    void hitungReaumur (int Celcius){
        hasil = Celcius * 0.8f;
        System.out.println("Konversi suhu Celcius ke Reaumur\t : "+ Celcius +" C adalah " + hasil + " R");
    }
    void hitungRomer(int Celcius){
        hasil = Celcius * 21/40 + 7.5f;
        System.out.println("Konversi suhu Celcius ke Romer\t\t : "+ Celcius +" C adalah " + hasil + " Ro");
    }
}