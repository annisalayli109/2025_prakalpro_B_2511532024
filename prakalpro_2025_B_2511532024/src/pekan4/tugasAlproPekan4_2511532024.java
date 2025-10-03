package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532024 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Masukkan Nama Pengirim: ");
		String nama = input.nextLine();
		
		System.out.print("Masukkan Berat Paket (kg): ");
		double berat = input.nextDouble();
		
		System.out.print("Masukkan Jarak Pengiriman (km): ");
		int jarak = input.nextInt();
		
		System.out.println("Pilih Jenis Layanan: ");
		System.out.println("1. Reguler");
		System.out.println("2. Express");
		System.out.println("3. Same Day");
		int layanan = input.nextInt();
		
		System.out.println("Pilih Jenis Paket: ");
		System.out.println("1. Dokumen");
		System.out.println("2. Barang Biasa");
		System.out.println("3. Barang Elektronik");
		int paket = input.nextInt();
		
		double biayadasar = Math.floor ((berat * 6500)/ 500) * 500;
		double biayajarak = jarak * 600;
		double subtotal = biayadasar + biayajarak;
		
		double biayalayanan = 0;
		String namalayanan = "";
		switch (layanan) {
			case 1:
				biayalayanan = 0;
				namalayanan = "Reguler";
				break;
			case 2:
				biayalayanan = subtotal * 0.5;
				namalayanan = "Express";
				break;
			case 3:
				biayalayanan = subtotal * 1.0;
				namalayanan = "Same Day";
				break;
			default:
				System.out.println("Pilihan layanan tidak valid!");
				return;
		}
		
		double biayajenis = 0;
		String namapaket = "";
		switch (paket) {
			case 1:
				biayajenis = 0;
				namapaket = "Dokumen";
				break;
			case 2:
				biayajenis = 5000;
				namapaket = "Barang Biasa";
				break;
			case 3:
				biayajenis = 15000;
				namapaket = "Barang Elektronik";
				break;
			default:
				System.out.println("Pilihan paket tidak valid!");
				return;
		}
		
		double totalsebelumdisc = subtotal + biayalayanan + biayajenis;
		
		double diskon = 0;
		if (berat > 10) {
			diskon = totalsebelumdisc * 0.1;
		}
		
		double totalbayar = totalsebelumdisc - diskon;
		
		// Ouput
		System.out.println("\n===== BIAYA PENGIRIMAN PAKET =====");
		System.out.println("Nama Pengirim        : " + nama);
		System.out.println("Berat Paket          : " + berat + " kg");
		System.out.println("Jarak Pengiriman     : " + jarak + " km");
		System.out.println("Jenis Layanan        : " + namalayanan);
		System.out.println("Jenis Paket          : " + namapaket);
		System.out.println("-----------------------------------------");
		System.out.println("Biaya Dasar          : Rp " + (int)biayadasar);
		System.out.println("Biaya Jarak          : Rp " + (int)biayajarak);
		System.out.println("Subtotal             : Rp " + (int)subtotal);
		System.out.println("Biaya Layanan        : Rp " + (int)biayalayanan);
		System.out.println("Biaya Jenis paket    : Rp " + (int)biayajenis);
		System.out.println("Total Sebelum Disc.  : Rp " + (int)totalsebelumdisc);
		System.out.println("Diskon               : Rp " + (int)diskon);
		System.out.println("------------------------------------------");
		System.out.println("TOTAL BIAYA          : Rp " + (int)totalbayar);
		
		input.close();
	}

}
