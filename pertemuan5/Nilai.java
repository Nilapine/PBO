import java.util.Scanner;
public class Nilai {
	String nim, nama, nHuruf, predikat ;
	float nilaiUts, nilaiTugas, nilaiUas,pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;
	Scanner myObj = new Scanner(System.in);
	void isiData(String nim, String nama, float nilaiUts, float nilaTugas, float nilaiUas)
	{
		this.nim=nim;
		this.nama=nama;
		this.nilaiTugas=nilaiTugas;
		this.nilaiUts=nilaiUts;
		this.nilaiUas=nilaiUas;
	}
	void setNim(String nim){
		this.nim=nim;
	}
	String getNim(){
		return nim;
	}
	void inputData(){
		System.out.print ("Nim \t\t: ");nim=myObj.nextLine();
		System.out.print ("Nama \t\t: ");nama=myObj.nextLine();
		System.out.print ("Nilai Tugas \t: ");nilaiTugas=myObj.nextFloat();
		System.out.print ("Nilai UTS \t: ");nilaiUts=myObj.nextFloat();
		System.out.print ("Nilai UAS \t: ");nilaiUas=myObj.nextFloat();
		System.out.print ("\n");
		System.out.print ("========================================\n");
	}
	void hitungNilai(){
		pNilaiUts=.35f*nilaiUts;
		pNilaiTugas=.35f*nilaiUas;
		pNilaiUas=.35f*nilaiUas;
		nilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
	}
	void cetakNilai(){
		System.out.println("NIM \t\t: "+nim);
		System.out.println("Nama \t\t: "+nama);
		System.out.println("Nilai Tugas \t: "+nilaiTugas+" * 30% : "+pNilaiTugas);
		System.out.println("Nilai UTS \t: "+nilaiUts+" * 30% : "+pNilaiUts);
		System.out.println("Nilai UAS \t: "+nilaiUas+" * 30% : "+pNilaiUas);
		System.out.println("Nilai Ahir \t: "+nilaiAkhir);
		System.out.println("Nilai Huruf \t: "+getNilHuruf(nilaiAkhir));
		System.out.println("Predikat \t: "+getPredikat(nHuruf));
		System.out.print ("\n");
		System.out.print ("========================================\n");

	}
	
	String getNilHuruf(float nilai)
	{
		if (nilai >= 85)
            nHuruf = "A";
		else if (nilai >= 80 && nilai < 85)
			nHuruf = "AB";
        else if (nilai >= 70 && nilai < 80)
            nHuruf = "B";
		else if (nilai >= 65 && nilai < 70)
            nHuruf = "BC";
        else if (nilai >= 60 && nilai < 65)
            nHuruf = "C";
        else if (nilai >= 40 && nilai < 60)
            nHuruf = "D";
        else
            nHuruf = "E";
        return nHuruf;
		
	}
	String getPredikat(String huruf) {
        switch (huruf) {
            case "A":
                predikat = "Apik";
                break;
			case "AB":
                predikat = "Apik Baik";
                break;
            case "B":
                predikat = "Baik";
                break;
			case "BC":
                predikat = "Baik Cukup";
                break;
            case "C":
                predikat = "Cukup";
                break;
            case "D":
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }
        return predikat;
    }

    void cetakNilai2() {
        hitungNilai();
        System.out.println("-----------------------------------------------------------");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai UTS   : " + nilaiUts + " 20%   : " + pNilaiUts);
        System.out.println("Nilai Tugas : " + nilaiTugas + " 35%   : " + pNilaiTugas);
        System.out.println("Nilai UAS   : " + nilaiUas + " 45%   : " + pNilaiUas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat    : " + getPredikat(nHuruf));
    }

    void judul(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Daftar Nilai PBO");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nim\t\tNama\tN.Tugas\tN.Uts\tN.Uas\tN.Akkhir"+"\tN.Huruf\tPredikat");
    }

    void daftarNilai(){
        System.out.println(nim+"\t"+nama+"\t"+nilaiTugas+"\t"+nilaiUts+"\t"+nilaiUas+"\t"+nilaiAkhir+"\t\t"+nHuruf+"\t"+predikat);
    }
}