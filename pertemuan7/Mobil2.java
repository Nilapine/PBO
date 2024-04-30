public class Mobil2 {
	int roda = 4;
	int body = 1;
	static int mesin = 1;
	String nama;

	static void maju() {
		System.out.println("Maju.....");
	}

	void mundur() {
		System.out.println("Mundur.....");
	}

	void belok() {
		System.out.println("Belok.....");
	}

	void hidupkanMobil() {
		System.out.println("Hidupkan Mobil \t: "+nama);
	}

	void matikanMobil() {
		System.out.println("Matikan Mobil \t: " + nama);
	}

	void ubahGigi() {
		System.out.println("Ubah Gigi \t: " + nama);
	}
}