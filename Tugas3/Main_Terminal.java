package Tugas3;

public class Main_Terminal {
    public static void main(String[] args) {
        Angkot angkot1 = new Angkot("N 1234 OK", 10);
        Bis bis1 = new Bis("N 4321 LK", 20);

        DriverAngkot driverAngkot1 = new DriverAngkot("Joko","Laki-laki", true);
        DriverBis driverBis1 = new DriverBis("Samsudin", "Laki-laki", true);

        angkot1.setDriverAngkot(driverAngkot1);
        bis1.setDriverBis(driverBis1);

        Penumpang penumpang1= new Penumpang("Rama", "Laki-laki");
        Penumpang penumpang2= new Penumpang("Eka", "Perempuan");
        Penumpang penumpang3= new Penumpang("Amar", "Laki-laki");
        Penumpang penumpang4= new Penumpang("Dwi", "Laki-laki");
        Penumpang penumpang5= new Penumpang("Sri", "Perempuan");


        System.out.println("Angkot dengan nomor "+angkot1.nomorPolisi+" berkapasitas "+angkot1.jumlahKursi+" penumpang dikendarai oleh driver bernama "+angkot1.getDriverAngkot().getNama());
        penumpang1.naikAngkot(angkot1);
        penumpang2.naikAngkot(angkot1);
        System.out.println();

        System.out.println("Bis dengan nomor "+bis1.nomorPolisi+" berkapasitas "+bis1.jumlahKursi+" penumpang dikendarai oleh driver bernama "+bis1.getDriverBis().getNama());
        penumpang3.naikBis(bis1);
        penumpang4.naikBis(bis1);
        penumpang5.naikBis(bis1);

        System.out.println();
        penumpang2.turunAngkot(angkot1);
        penumpang5.turunBis(bis1);
    }
}
