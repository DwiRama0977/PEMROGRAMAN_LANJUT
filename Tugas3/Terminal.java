package Tugas3;

class Mobil {
    protected String nomorPolisi;
    protected int jumlahKursi;

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }
}

class Angkot extends Mobil {
    private DriverAngkot driverAngkot;
    private Penumpang[] daftarPenumpang = new Penumpang[this.jumlahKursi];

    public Angkot(String nomorAngkot, int jumlahKursi) {
        this.nomorPolisi = nomorAngkot;
        this.jumlahKursi = jumlahKursi;
    }

    public void setDriverAngkot(DriverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
    }

    public DriverAngkot getDriverAngkot() {
        return driverAngkot;
    }

    public void tambahPenumpang(Penumpang daftarPenumpang) {
        for (int i = 0; i < this.daftarPenumpang.length; i++) {
            if (this.daftarPenumpang[i] == null) {
                this.daftarPenumpang[i] = daftarPenumpang;
            }
        }
    }

    public void hapusPenumpang(Penumpang daftarPenumpang) {
        for (int i = 0; i < this.daftarPenumpang.length; i++) {
            if (this.daftarPenumpang != null && this.daftarPenumpang[i].getNama() == daftarPenumpang.getNama()) {
                this.daftarPenumpang[i] = null;
            }
        }
    }
}

class Bis extends Mobil {
    DriverBis driverBis;
    Penumpang[] daftarPenumpang = new Penumpang[jumlahKursi];

    public Bis(String nomorBis, int jumlahKursi) {
        this.nomorPolisi = nomorBis;
        this.jumlahKursi = jumlahKursi;
    }

    public void setDriverBis(DriverBis driver) {
        this.driverBis = driver;
    }

    public DriverBis getDriverBis() {
        return driverBis;
    }

    public void tambahPenumpang(Penumpang daftarPenumpang) {
        for (int i = 0; i < this.daftarPenumpang.length; i++) {
            if (this.daftarPenumpang == null) {
                this.daftarPenumpang[i] = daftarPenumpang;
            }
        }
    }

    public void hapusPenumpang(Penumpang daftarPenumpang) {
        for (int i = 0; i < this.daftarPenumpang.length; i++) {
            if (this.daftarPenumpang != null && this.daftarPenumpang[i].getNama() == daftarPenumpang.getNama()) {
                this.daftarPenumpang[i] = null;
            }
        }
    }
}

class Orang {
    protected String nama;
    protected String gender;

    public String getNama() {
        return nama;
    }

    public String getGender() {
        return gender;
    }
}

class DriverAngkot extends Orang {
    private boolean simA;

    DriverAngkot(String nama, String gender, boolean simA) {
        this.nama = nama;
        this.gender = gender;
        this.simA = simA;
    }

    public boolean getSimA() {
        return simA;
    }
}

class DriverBis extends Orang {
    private boolean simB;

    DriverBis(String nama, String gender, boolean simB) {
        this.nama = nama;
        this.gender = gender;
        this.simB = simB;
    }

    public boolean getSimA() {
        return simB;
    }
}

class Penumpang extends Orang {
    public Penumpang(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }

    public void naikAngkot(Angkot mobilAngkot) {
        mobilAngkot.tambahPenumpang(this);
        System.out.println("Penumpang dengan nama " + this.nama + " naik kedalam angkot");
    }

    public void turunAngkot(Angkot mobilAngkot) {
        mobilAngkot.hapusPenumpang(this);
        System.out.println("Penumpang dengan nama " + this.nama + " telah turun dari angkot");
    }

    public void naikBis(Bis mobilBis) {
        mobilBis.tambahPenumpang(this);
        System.out.println("Penumpang dengan nama " + this.nama + " naik kedalam bis");
    }

    public void turunBis(Bis mobilBis) {
        mobilBis.hapusPenumpang(this);
        System.out.println("Penumpang dengan nama " + this.nama + " telah turun dari bis");
    }
}