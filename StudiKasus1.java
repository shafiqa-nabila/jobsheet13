import java.util.Scanner;
public class StudiKasus1 {
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
         System.out.println("Masukkan Jenis Prestasi(Juara 1,Juara 2,Juara Harapan, dll): ");
         String juara = sc.nextLine();
        System.out.println("Masukkan Tingkat Prestasi(Lokal/Nasional/Internasional): ");
        String tingkat = sc.nextLine();
        while (!(tingkat.equalsIgnoreCase("Lokal") || tingkat.equalsIgnoreCase("Nasional") || tingkat.equalsIgnoreCase("Internasional"))) {
            System.out.println("Tingkatan tidak valid. Mohon diisi Ulang!");
            System.out.println("Masukkan Tingkat Prestasi(Lokal/Nasional/Internasional): ");
            tingkat = sc.nextLine();
            
        }
         while(true) {
            System.out.println("Masukkan tahun prestasi( 2010 - 2024 ): ");
           int tahun = sc.nextInt();
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
                continue;
            }

         }
         
    }
    private static void tampilkanSemuaPrestasi() {
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }

        System.out.println("\n=== DAFTAR SEMUA PRESTASI ===");
        for (int i = 0; i < jumlahPrestasi; i++) {
            System.out.println("Nama: " + daftarPrestasi[i][0] +
                               " | NIM: " + daftarPrestasi[i][1] +
                               " | Jenis: " + daftarPrestasi[i][2] +
                               " | Tingkat: " + daftarPrestasi[i][3] +
                               " | Tahun: " + daftarPrestasi[i][4]);
        }
    }
    private static void analisisPrestasi() {
        if (jumlahPrestasi == 0) {
            System.out.println("Tidak ada data prestasi untuk dianalisis.");
            return;
        }

        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        String key = sc.nextLine();
        boolean ditemukan = false;

        System.out.println("\n=== ANALISIS PRESTASI ===");
        for (int i = 0; i < jumlahPrestasi; i++) {
            if (daftarPrestasi[i][2].equalsIgnoreCase(key)) {
                System.out.println(
                    "Nama: " + daftarPrestasi[i][0] +
                    " | NIM: " + daftarPrestasi[i][1] +
                    " | Tingkat: " + daftarPrestasi[i][3] +
                    " | Tahun: " + daftarPrestasi[i][4]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data dengan jenis prestasi: " + key);
        }
    }
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== PENCACATAN PRESTASI MAHASISWA ===");
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
                    tampilkanSemuaPrestasi();
                    break;
                case 3:
                    analisisPrestasi();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

    }
}