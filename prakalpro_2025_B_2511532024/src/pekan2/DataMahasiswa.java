package pekan2;

public class DataMahasiswa {
	
	public static void main(String[] args) {
		String NIM = "2511532024";
		String Nama = "Annisa Layli Ramadhani";
		int Umur = 18;
		
		String UmurStr = Integer.toString(Umur);
		Long Nimlong = Long.parseLong(NIM);
		Long hasilpenjumlahan = Nimlong + Umur;

		System.out.println(" === DATA MAHASISWA ===");
		System.out.println("NIM	: " + NIM);
		System.out.println("Nama	: " + Nama);
		System.out.println("Umur	: " + Umur + " tahun ");
		
		System.out.println("\nUmur (String)	: " + UmurStr);
		System.out.println("NIM + Umur 	: " + hasilpenjumlahan);

	}

}
