package pekan5;

public class tugasAlproPekan5_2511532024 {

	public static void main(String[] args) {
		int tinggi = 8;
        int lebar = 16;

        // Garis atas
        for (int i = 0; i < 18; i++) {
            if (i == 0 || i == 17) {
                System.out.print("#");
            } else {
                System.out.print("=");
            }
        }
        System.out.println();

        // Isi kotak
        for (int i = 0; i < tinggi; i++) {
            System.out.print("|");

            int titik;
            if (i < tinggi / 2) {
                titik = i * 4;
            } else {
                titik = (tinggi - 1 - i) * 4;
            }

            int isi = titik + 4;
            int spasi = (lebar - isi) / 2;

            // Spasi kiri
            for (int s = 0; s < spasi; s++) {
                System.out.print(" ");
            }

            // Isi pola
            if (i == 0 || i == tinggi - 1) {
                System.out.print("<><>");
            } else {
                System.out.print("<>");
                for (int j = 0; j < titik; j++) {
                    System.out.print(".");
                }
                System.out.print("<>");
            }

            // Spasi kanan
            for (int s = 0; s < spasi; s++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        // Garis bawah
        for (int i = 0; i < 18; i++) {
            if (i == 0 || i == 17) {
                System.out.print("#");
            } else {
                System.out.print("=");
            }
        }
        System.out.println();
    }
}