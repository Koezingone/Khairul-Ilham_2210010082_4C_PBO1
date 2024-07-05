
package uas;


class Mobil extends Kendaraan {
    // Attributes
    private int jumlahPintu;

    // Constructor
    public Mobil(String namaPelanggan, String platNomor, String merek, String model, int jumlahPintu) {
        super(namaPelanggan, platNomor, merek, model);
        this.jumlahPintu = jumlahPintu;
    }

    // Accessor methods (getter)
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    // Mutator methods (setter)
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Overridden polymorphic method
    @Override
    public void perbaiki() {
        System.out.println("Memperbaiki mobil: " + getPlatNomor() + " dengan " + jumlahPintu + " pintu.");
    }
}
