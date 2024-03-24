import java.util.Scanner;
public class Nilai {
	String nim, nama;
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
		System.out.print ("Nim : ");nim=myObj.nextLine();
		System.out.print ("Nama : ");nama=myObj.nextLine();
		System.out.print ("Nilai Tugas : ");nilaiTugas=myObj.nextLine();
		System.out.print ("Nilai UTS : ");nilaiUts=myObj.nextLine();
		System.out.print ("Nilai UAS : ");nilaiUas=myObj.nextLine();
	}
	void hitungNilai(){
		pNilaiUts=.35f*nilaiUts;
		pNilaiTugas=.35f*nilaiUas;
		pNilaiUas=.35f*nilaiUas;
		pNilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
	}
	void cetakNilai(){
		System.out.println("NIM : "+nim);
		System.out.println("Nama : "+nama);
		System.out.println("Nilai Tugas : "+nilaiTugas+"30% : "+pNilaiTugas);
		System.out.println("Nilai UTS : "+nilaiUts+"30% : "+pNilaiUts);
		System.out.println("Nilai UAS : "+nilaiUas+"30% : "+pNilaiUas);
		System.out.println("Nilai Akhir : "+nilaiAkhir);
	}
}