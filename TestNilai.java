import java.util.Scanner;
import java.io.*;
public class TestNilai{
 
	public static void main (String[] a){
		String jawab="";
		Scanner input = new Scanner(System.in);
		Nilai nilaiku=new Nilai();
		nilaiku.nim="A11202214667";
		nilaiku.nama="Nila";
		nilaiku.nilaiTugas=99;
		nilaiku.nilaiUts=87;
		nilaiku.nilaiUas=98;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
		
		Nilai nilaimu=new Nilai();
		
		nilaimu.nim="A11202214704";
		nilaiku.nama="Valen";
		nilaiku.nilaiTugas=98;
		nilaiku.nilaiUts=87;
		nilaiku.nilaiUas=99;
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();

		do{
        Nilai nilaiDia = new Nilai();
        nilaiDia.inputData();
        nilaiDia.hitungNilai();
        nilaiDia.cetakNilai();

        System.out.println("Input data lagi [Y/T]? ");
		jawab=input.nextLine();
        } while(jawab.equalsIgnoreCase("Y"));
	}
}