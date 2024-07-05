
package uas;


class Kendaraan {
    // Attributes
    private String namaPelanggan;
    private String platNomor;
    private String merek;
    private String model;

    // Constructor
    public Kendaraan(String namaPelanggan, String platNomor, String merek, String model) {
        this.namaPelanggan = namaPelanggan;
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
    }

    // Accessor methods (getter)
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    // Mutator methods (setter)
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Polymorphic method
    public void perbaiki() {
        System.out.println("Memperbaiki Kendaraan: " + namaPelanggan);
        System.out.println("Plat Nomor: " + platNomor);
    }
}