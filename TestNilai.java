public class TestNilai{
	public static void main (String[] a){
		Nilai nilaiku=new Nilai();
		Nilai nilaiDia=new Nilai();
		Nilai nilainya=new Nilai();
		nilaiku.nim="A11.2022.14667";
		nilaiku.nama="Nila";
		nilaiku.nilaiTugas="99";
		nilaiku.nilaiUts="87";
		nilaiku.nilaiUas="98";
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
		
		Nilai nilaimu=new Nilai();
		
		nilaimu.nim="A11.2022.14704";
		nilaiku.nama="Valen";
		nilaiku.nilaiTugas="98";
		nilaiku.nilaiUts="87";
		nilaiku.nilaiUas="99";
		nilaiku.hitungNilai();
		nilaiku.cetakNilai();
		
		
		nilainya.isiData("A11.2022.12345")
		nilainya.hitungNilai();
		nilainya.setNim("A11.2022.12344")
		nilainya.cetakNilai();
		nilaiDia.inputData();
		nilaiDia.hitungNilai();
		nilaiDia.cetakNilai();
	}
}