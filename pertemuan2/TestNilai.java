import java.util.Scanner;
import java.io.*;
public class TestNilai{
 
	public static void main (String[] args){
		String jawab="";
		Scanner input = new Scanner(System.in);
		Nilai nilaiku=new Nilai();
		nilaiku.nim="A11202214667";
		nilaiku.nama="Nila";
		nilaiku.nilaiTugas=99;
		nilaiku.nilaiUts=89;
		nilaiku.nilaiUas=98;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
		
		Nilai nilaimu=new Nilai();
		
		nilaiku.nim="A11202214701";
		nilaiku.nama="Adi";
		nilaiku.nilaiTugas=98;
		nilaiku.nilaiUts=87;
		nilaiku.nilaiUas=99;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
	}
}