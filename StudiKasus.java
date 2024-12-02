import java.util.Scanner;
public class StudiKasus {
    static final int MAX_PRESTASI = 400; // Kapasitas maksimum data
    static final int KOLOM = 5; // Jumlah kolom (Nama, NIM, Jenis, Tingkat, Tahun)
    static String[][] daftarPrestasi = new String[MAX_PRESTASI][KOLOM];
    static int jumlahPrestasi = 0; // Counter untuk data yang terisi
    static Scanner sc = new Scanner(System.in);

    public static void TambahDataPrestasi() {
        if (jumlahPrestasi >= MAX_PRESTASI) {
            System.out.println("Kapasitas data penuh! Tidak bisa menambah prestasi.");
            return;
        }

        System.out.println("Masukkan Nama Mahasiswa: ");
         String nama = sc.nextLine();
         System.out.println("Masukkan NIM Mahasiswa: ");
         String nim = sc.nextLine();
         System.out.println("Masukkan Jenis Prestasi: ");
         String juara = sc.nextLine();
        System.out.println("Masukkan Tingkat Prestasi(Lokal/Nasional/Internasional): ");
        String tingkat = sc.nextLine();
        int tahun;
         while(true) {
            System.out.println("Masukkan tahun prestasi: ");
            tahun = sc.nextInt();
            if (tahun >= 2010 && tahun <= 2024) {
                daftarPrestasi[jumlahPrestasi][0] = nama;
                daftarPrestasi[jumlahPrestasi][1] = nim;
                daftarPrestasi[jumlahPrestasi][2] = juara;
                daftarPrestasi[jumlahPrestasi][3] = tingkat;
                daftarPrestasi[jumlahPrestasi][4] = String.valueOf(tahun);
                jumlahPrestasi++;
                System.out.println("Data Prestasi Berhasil di tambahkan!");
                break;
            }else {
                System.out.println("Tahun tidak valid. Coba lagi!");
            }

         }
         
    }
    
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tambah Prestasi Mahasiswa");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Berdasarkan Jenis Prestasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    TambahDataPrestasi();
                    break;
                case 2:
                  
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

    }
}