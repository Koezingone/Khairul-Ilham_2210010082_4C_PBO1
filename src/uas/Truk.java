
package uas;

class Truk extends Kendaraan {
    // Attributes
    private int kapasitasKargo;

    // Constructor
    public Truk(String namaPelanggan, String platNomor, String merek, String model, int kapasitasKargo) {
        super(namaPelanggan, platNomor, merek, model);
        this.kapasitasKargo = kapasitasKargo;
    }

    // Accessor methods (getter)
    public int getKapasitasKargo() {
        return kapasitasKargo;
    }

    // Mutator methods (setter)
    public void setKapasitasKargo(int kapasitasKargo) {
        this.kapasitasKargo = kapasitasKargo;
    }

    // Overridden polymorphic method
    @Override
    public void perbaiki() {
        System.out.println("Memperbaiki truk: " + getPlatNomor() + " dengan kapasitas kargo " + kapasitasKargo + " kg.");
    }
}

