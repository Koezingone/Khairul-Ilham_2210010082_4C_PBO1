
package uas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat bengkel perbaikan
        BengkelPerbaikan bengkel = new BengkelPerbaikan("Bengkel AutoFix");
        Kendaraan[] kendaraanArray = new Kendaraan[10];
        int jumlahKendaraan = 0;

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Tambah kendaraan");
            System.out.println("2. Daftar kendaraan");
            System.out.println("3. Perbaiki kendaraan");
            System.out.println("4. Perbaikan selektif");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Membersihkan newline dari input buffer
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine();  // Membersihkan input buffer
                continue;
            }

            switch (pilihan) {
                case 1 -> {
                    if (jumlahKendaraan >= kendaraanArray.length) {
                        System.out.println("Bengkel penuh. Tidak dapat menambah kendaraan lagi.");
                        break;
                    }
                    try {
                        System.out.println("Masukkan tipe kendaraan (1. Mobil, 2. Truk):");
                        int tipeKendaraan = scanner.nextInt();
                        scanner.nextLine();  // Membersihkan newline dari input buffer

                        System.out.println("Masukkan Nama Pelanggan:");
                        String namaPelanggan = scanner.nextLine();

                        System.out.println("Masukkan plat nomor:");
                        String platNomor = scanner.nextLine();

                        System.out.println("Masukkan merek:");
                        String merek = scanner.nextLine();

                        System.out.println("Masukkan model:");
                        String model = scanner.nextLine();

                        switch (tipeKendaraan) {
                            case 1 -> {
                                System.out.println("Masukkan jumlah pintu:");
                                int jumlahPintu = scanner.nextInt();
                                scanner.nextLine();  // Membersihkan newline dari input buffer
                                Mobil mobil = new Mobil(namaPelanggan, platNomor, merek, model, jumlahPintu);
                                kendaraanArray[jumlahKendaraan++] = mobil;
                                bengkel.tambahKendaraanUntukPerbaikan(mobil);
                            }
                            case 2 -> {
                                System.out.println("Masukkan kapasitas kargo:");
                                int kapasitasKargo = scanner.nextInt();
                                scanner.nextLine();  // Membersihkan newline dari input buffer
                                Truk truk = new Truk(namaPelanggan, platNomor, merek, model, kapasitasKargo);
                                kendaraanArray[jumlahKendaraan++] = truk;
                                bengkel.tambahKendaraanUntukPerbaikan(truk);
                            }
                            default -> System.out.println("Tipe kendaraan tidak valid.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid. Silakan coba lagi.");
                        scanner.nextLine();  // Membersihkan input buffer
                    }
                }
                case 2 -> bengkel.daftarKendaraanDalamPerbaikan();
                case 3 -> bengkel.daftarKendaraanDalamPerbaikan();
                case 4 -> {
                    System.out.println("Masukkan tipe kendaraan untuk perbaikan selektif (1. Mobil, 2. Truk):");
                    int tipePerbaikan;
                    try {
                        tipePerbaikan = scanner.nextInt();
                        scanner.nextLine();  // Membersihkan newline dari input buffer
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid. Silakan masukkan angka.");
                        scanner.nextLine();  // Membersihkan input buffer
                        break;
                    }

                switch (tipePerbaikan) {
                    case 1 -> bengkel.lakukanPerbaikanSelektif("Mobil");
                    case 2 -> bengkel.lakukanPerbaikanSelektif("Truk");
                    default -> System.out.println("Tipe kendaraan tidak valid.");
                }
                }
                case 5 -> {
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

