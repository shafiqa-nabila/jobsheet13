import java.util.Scanner;
public class StudiKasus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
    }
}