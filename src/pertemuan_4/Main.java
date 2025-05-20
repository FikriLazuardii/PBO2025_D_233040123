package pertemuan_4;

public class Main {
	public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Fikri Lazuardi", 233040123);

        // Membuat objek Dosen
        Dosen dsn1 = new Dosen("Dr. Adjat Sudradjat", "123456789");

        // Menampilkan informasi mahasiswa dan dosen
        mhs1.tampilkanInfo();
        System.out.println();
        dsn1.tampilkanInfo();
    }
}
