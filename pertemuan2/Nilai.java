import java.util.Scanner;
public class Nilai {
	String nim, nama, nHuruf, predikat ;
	float nilaiUts, nilaiTugas, nilaiUas,pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;
	Scanner myObj = new Scanner(System.in);
	void isiData(String nim, String nama, float nilaiUts, float nilaiTugas, float nilaiUas)
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
		pNilaiUts=.20f*nilaiUts;
		pNilaiTugas=.35f*nilaiUas;
		pNilaiUas=.45f*nilaiUas;
		nilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
	}
	void cetakNilai(){
		System.out.println("NIM \t\t: "+nim);
		System.out.println("Nama \t\t: "+nama);
		System.out.println("Nilai Tugas \t: "+nilaiTugas+" * 30% : "+pNilaiTugas);
		System.out.println("Nilai UTS \t: "+nilaiUts+" * 30% : "+pNilaiUts);
		System.out.println("Nilai UAS \t: "+nilaiUas+" * 30% : "+pNilaiUas);
		System.out.println("Nilai Ahir \t: "+nilaiAkhir);
		System.out.print ("\n");
		System.out.print ("========================================\n");

	}
}