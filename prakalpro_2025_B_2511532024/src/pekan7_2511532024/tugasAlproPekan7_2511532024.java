package pekan7_2511532024;

import java.util.Scanner;

public class tugasAlproPekan7_2511532024 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== REGISTRASI AKUN BARU ====");
		
		System.out.print("Masukkan Username: ");
		String username = input.nextLine();
		System.out.print("Masukkan Password: ");
		String password = input.nextLine();
		System.out.print("Masukkan Email: ");
		String email = input.nextLine();
		System.out.print("Masukkan PIN (6 digit): ");
		int pin = input.nextInt();
		
		Akun a= new Akun();
		a.setUsername(username);
		a.setPassword(password);
		a.setEmail(email);
		a.setPin(pin);
		
		boolean validPass = a.isPasswordValid();
		boolean validEmail = a.isEmailValid();
		
		if (!validPass && !validEmail) {
			System.out.println("\n --- REGISTRASI GAGAL ---");
			
			if (!validPass) {
				System.out.println("Password Anda \"" + a.getPassword() + "\" tidak valid (minimal 8 karakter)");
				System.out.println("Silahkan coba lagi");
			}
			if (!validEmail) {
				System.out.println("Email Anda \"" + a.getEmail() + "\" tidak valid (harus mengandung '@' dan '.')");
				System.out.println("Silahkan coba lagi");
			}
			return;
		}
		
		System.out.println("\n --- REGISTRASI BERHASIL ---");
		System.out.println("Akun untuk \"" + a.getUsername() + "\" telah berhasil dibuat.");
		
		System.out.println("\n --- Detail Akun ---");
		System.out.println("USername (Lowercase): " + a.getUsername().toLowerCase());
		System.out.println("Email (Uppercase): " + a.getEmail().toUpperCase());
		System.out.println("ID Pengguna (Gabungan): " + a.getUsername().toLowerCase() + a.getPin());
		
		System.out.println("\n --- Uji Tipe Data (PIN Anda: " + a.getPin() + ") ---");
		System.out.println("PIN (int) + 10      = " + (a.getPin() + 10));
		System.out.println("PIN (String) + \"10\" = " + (a.getPin() + "10"));
		
	}

}
