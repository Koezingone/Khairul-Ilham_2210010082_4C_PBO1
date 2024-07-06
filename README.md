# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kendaraan untuk perbaikan di bengkel menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data kendaraan seperti nama pelanggan, plat nomor, merek, model, dan detail khusus (jumlah pintu untuk mobil, kapasitas kargo untuk truk), dan memberikan output berupa informasi detail kendaraan tersebut serta status perbaikannya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berbasik objek (PBO) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Mobil`, `Truk`, `BengkelPerbaikan`, dan `Main` adalah contoh dari class.

```bash
public class Kendaraan {
...
}

public class Mobil extends Kendaraan {
 ...
}

public class Truk extends Kendaraan {
...
}

public class BengkelPerbaikan {
...
}

public class Main {
...
}

```

2. **Object** adalah instance dari class. Pada kode ini, `Mobil`, `Truk`, dan `BengkelPerbaikan` adalah contoh pembuatan object.

```bash
 Mobil mobil = new Mobil(...);
Truk truk = new Truk(...);
BengkelPerbaikan bengkel = new BengkelPerbaikan("Bengkel AutoFix");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPelanggan`, `platNomor`, `merek`, `model`, `jumlahPintu`, dan `kapasitasKargo` adalah contoh atribut.

```bash
private String namaPelanggan;
private String platNomor;
private String merek;
private String model;
private int jumlahPintu;
private int kapasitasKargo;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kendaraan`, `Mobil`, `Truk`, dan `BengkelPerbaikan`.

```bash
public Kendaraan(String namaPelanggan, String platNomor, String merek, String model) {
        this.namaPelanggan = namaPelanggan;
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
}

public Mobil(String namaPelanggan, String platNomor, String merek, String model, int jumlahPintu) {
        super(namaPelanggan, platNomor, merek, model);
        this.jumlahPintu = jumlahPintu;
}

public Truk(String namaPelanggan, String platNomor, String merek, String model, int kapasitasKargo) {
        super(namaPelanggan, platNomor, merek, model);
        this.kapasitasKargo = kapasitasKargo;
}

public BengkelPerbaikan(String nama) {
        this.nama = nama;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPelanggan`, `setPlatNomor`, `setMerek`, `setModel`, `setJumlahPintu`, dan `setKapasitasKargo` adalah contoh method mutator.

```bash
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

public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
}

public void setKapasitasKargo(int kapasitasKargo) {
        this.kapasitasKargo = kapasitasKargo;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPelanggan`, `getPlatNomor`, `getMerek`, `getModel`, `getJumlahPintu`, dan `getKapasitasKargo` adalah contoh method accessor.

```bash
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

public int getJumlahPintu() {
        return jumlahPintu;
}

public int getKapasitasKargo() {
        return kapasitasKargo;
}

```

7. **Encapsulation**  adalah pembungkusan data menjadi satu unit. Pada kode ini, atribut dalam class `Kendaraan`, `Mobil`, dan `Truk` dienkapsulasi dengan modifier `private` dan diakses melalui method getter dan setter.

```bash
private String namaPelanggan;
private String platNomor;
private String merek;
private String model;
private int jumlahPintu;
private int kapasitasKargo;
```

8. **Inheritance** adalah konsep pewarisan atribut dan method dari superclass ke subclass. Pada kode ini, class `Mobil` dan `Truk` mewarisi atribut dan method dari class `Kendaraan`.

```bash
public class Mobil extends Kendaraan {
    ...
}

public class Truk extends Kendaraan {
    ...
}
```

9. **Polymorphism** adalah konsep dimana method yang sama dapat memiliki perilaku yang berbeda pada class yang berbeda. Pada kode ini, method `perbaiki` di-overridden di class `Mobil` dan `Truk`.

```bash
public void perbaiki() {
        System.out.println("Memperbaiki Kendaraan: " + namaPelanggan);
        System.out.println("Plat Nomor: " + platNomor);
}

 @Override
    public void perbaiki() {
        System.out.println("Memperbaiki mobil: " + getPlatNomor() + " dengan " + jumlahPintu + " pintu.");
}

@Override
    public void perbaiki() {
        System.out.println("Memperbaiki truk: " + getPlatNomor() + " dengan kapasitas kargo " + kapasitasKargo + " kg.");
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan. Pada kode ini, digunakan seleksi `if-else` dan `switch-case` untuk menentukan jenis kendaraan dan operasi yang dilakukan.

```bash
if (tipeKendaraan == 1) {
    // Penanganan untuk tipe Mobil
} else if (tipeKendaraan == 2) {
    // Penanganan untuk tipe Truk
} else {
    System.out.println("Tipe kendaraan tidak valid.");
}

switch (pilihan) {
    case 1:
        // Tambah kendaraan
        break;
    case 2:
        // Daftar kendaraan
        break;
    case 3:
        // Perbaiki kendaraan
        break;
    case 4:
        // Perbaikan selektif
        break;
    case 5:
        // Keluar
        break;
    default:
        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        break;
}

switch (tipePerbaikan) {
    case 1:
        bengkel.lakukanPerbaikanSelektif("Mobil");
        break;
    case 2:
        bengkel.lakukanPerbaikanSelektif("Truk");
        break;
    default:
        System.out.println("Tipe kendaraan tidak valid.");
        break;
}

if (kendaraan != null) {
    // Operasi jika ada kendaraan
} else {
    System.out.println("Tidak ada kendaraan yang sedang diperbaiki.");
}

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk menampilkan menu pilihan dan memproses input pengguna.

```bash
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
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan Nama Pelanggan:");
String namaPelanggan = scanner.nextLine();

System.out.println("Masukkan plat nomor:");
String platNomor = scanner.nextLine();

System.out.println("Masukkan merek:");
String merek = scanner.nextLine();

System.out.println("Masukkan model:");
String model = scanner.nextLine();

System.out.println("Masukkan jumlah pintu:");
int jumlahPintu = scanner.nextInt();

System.out.println("Masukkan jumlah pintu:");
int jumlahPintu = scanner.nextInt();

System.out.println("Masukkan kapasitas kargo:");
int kapasitasKargo = scanner.nextInt();

System.out.println("Pilih opsi:");
System.out.println("1. Tambah kendaraan");
System.out.println("2. Daftar kendaraan");
System.out.println("3. Perbaiki kendaraan");
System.out.println("4. Perbaikan selektif");
System.out.println("5. Keluar");
System.out.println("Tipe kendaraan tidak valid.");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Kendaraan[] kendaraanArray = new Kendaraan[10];` adalah contoh penggunaan array.

```bash
 Kendaraan[] kendaraanArray = new Kendaraan[10];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    pilihan = scanner.nextInt();
    scanner.nextLine();  // Membersihkan newline dari input buffer
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan masukkan angka.");
    scanner.nextLine();  // Membersihkan input buffer
    continue;
}

try {
    int tipeKendaraan = scanner.nextInt();
    scanner.nextLine();  // Membersihkan newline dari input buffer
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan coba lagi.");
    scanner.nextLine();  // Membersihkan input buffer
}

try {
    System.out.println("Masukkan jumlah pintu:");
    int jumlahPintu = scanner.nextInt();
    scanner.nextLine();  // Membersihkan newline dari input buffer
    Mobil mobil = new Mobil(namaPelanggan, platNomor, merek, model, jumlahPintu);
    kendaraanArray[jumlahKendaraan++] = mobil;
    bengkel.tambahKendaraanUntukPerbaikan(mobil);
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan coba lagi.");
    scanner.nextLine();  // Membersihkan input buffer
}
try {
    System.out.println("Masukkan kapasitas kargo:");
    int kapasitasKargo = scanner.nextInt();
    scanner.nextLine();  // Membersihkan newline dari input buffer
    Truk truk = new Truk(namaPelanggan, platNomor, merek, model, kapasitasKargo);
    kendaraanArray[jumlahKendaraan++] = truk;
    bengkel.tambahKendaraanUntukPerbaikan(truk);
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan coba lagi.");
    scanner.nextLine();  // Membersihkan input buffer
}

try {
    tipePerbaikan = scanner.nextInt();
    scanner.nextLine();  // Membersihkan newline dari input buffer
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan masukkan angka.");
    scanner.nextLine();  // Membersihkan input buffer
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Khairul Ilham
NPM: 2210010082
