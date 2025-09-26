package pekan3;

import java.util.Scanner;

public class TugasAlproPekan3 {

	public static void main(String[] args) {
		double r;
		double volume;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Masukkan jari-jari bola: ");
		r = keyboard.nextDouble();
		keyboard.close();
		volume = (4.0 / 3.0) * 3.14 * r * r * r;
		
		System.out.println();
		System.out.println("Volume bola = " + volume);
		
	}

}
