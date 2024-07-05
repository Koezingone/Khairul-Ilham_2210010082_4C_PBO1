
package uas;

class BengkelPerbaikan {
    // Attributes
    private final String nama;
    private Kendaraan kendaraan;

    // Constructor
    public BengkelPerbaikan(String nama) {
        this.nama = nama;
    }

    // Method to add a vehicle for repair (mutator)
    public void tambahKendaraanUntukPerbaikan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        System.out.println("Kendaraan ditambahkan untuk perbaikan: " + kendaraan.getPlatNomor());
    }

    // Method to remove a vehicle after repair (mutator)
    public void hapusKendaraanSetelahPerbaikan() {
        if (kendaraan != null) {
            System.out.println("Kendaraan dihapus setelah perbaikan: " + kendaraan.getPlatNomor());
            kendaraan = null;
        } else {
            System.out.println("Tidak ada kendaraan yang diperbaiki.");
        }
    }

    // Method to list all vehicles under repair (accessor)
    public void daftarKendaraanDalamPerbaikan() {
        if (kendaraan != null) {
            System.out.println("Kendaraan yang sedang diperbaiki di " + nama + ":");
            System.out.println("Plat Nomor: " + kendaraan.getPlatNomor() + ", Merek: " + kendaraan.getMerek() + ", Model: " + kendaraan.getModel());
            kendaraan.perbaiki();
        } else {
            System.out.println("Tidak ada kendaraan yang sedang diperbaiki.");
        }
    }

    // Method for selective repair (accessor)
    public void lakukanPerbaikanSelektif(String tipe) {
        if (kendaraan != null) {
            System.out.println("Melakukan perbaikan selektif untuk " + tipe + " di " + nama + ":");
            if ((tipe.equals("Mobil") && kendaraan instanceof Mobil) || (tipe.equals("Truk") && kendaraan instanceof Truk)) {
                // Polymorphic method call
                kendaraan.perbaiki();
            } else {
                System.out.println("Tidak ada kendaraan yang sesuai untuk perbaikan selektif.");
            }
        } else {
            System.out.println("Tidak ada kendaraan yang sedang diperbaiki.");
        }
    }
}
