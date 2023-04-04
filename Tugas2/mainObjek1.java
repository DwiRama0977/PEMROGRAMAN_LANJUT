package Tugas2;

import java.util.Scanner;

public class mainObjek1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("PROGRAM UNTUK MENGHITUNG LUAS DAN TINGGI ROBOT");
        System.out.println("==============================================");

        System.out.println("Masukkan jari-jari kepala : ");
        Lingkaran kepala = new Lingkaran();
        kepala.setJari(input.nextDouble());
        double luasKepala = kepala.luasLingkaran(kepala.getJari());
        double tinggiKepala = kepala.tinggiLingkaran(kepala.getJari());

        System.out.println("Masukkan panjang dan lebar badan : ");
        PersegiPanjang badan = new PersegiPanjang();
        badan.setPanjang(input.nextDouble());
        badan.setLebar(input.nextDouble());
        double luasBadan = badan.luasPersegiPanjang(badan.getPanjang(), badan.getLebar());

        System.out.println("Masukkan panjang dan lebar tangan kiri : ");
        PersegiPanjang tanganKiri = new PersegiPanjang();
        tanganKiri.setPanjang(input.nextDouble());
        tanganKiri.setLebar(input.nextDouble());
        double luasTanganKiri = tanganKiri.luasPersegiPanjang(tanganKiri.getPanjang(), tanganKiri.getLebar());

        System.out.println("Masukkan panjang dan lebar tangan kanan : ");
        PersegiPanjang tanganKanan = new PersegiPanjang();
        tanganKanan.setPanjang(input.nextDouble());
        tanganKanan.setLebar(input.nextDouble());
        double luasTanganKanan = tanganKanan.luasPersegiPanjang(tanganKanan.getPanjang(), tanganKanan.getLebar());

        System.out.println("Masukkan jari-jari telapak tangan kiri");
        Lingkaran telapakTanganKiri = new Lingkaran();
        telapakTanganKiri.setJari(input.nextDouble());
        double luasTelapakTanganKiri = telapakTanganKiri.luasLingkaran(telapakTanganKiri.getJari());

        System.out.println("Masukkan jari-jari telapak tangan kanan");
        Lingkaran telapakTanganKanan = new Lingkaran();
        telapakTanganKanan.setJari(input.nextDouble());
        double luasTelapakTanganKanan = telapakTanganKanan.luasLingkaran(telapakTanganKanan.getJari());

        System.out.println("Masukkan panjang dan lebar kaki kiri : ");
        PersegiPanjang kakiKiri = new PersegiPanjang();
        kakiKiri.setPanjang(input.nextDouble());
        kakiKiri.setLebar(input.nextDouble());
        double luasKakiKiri = kakiKiri.luasPersegiPanjang(kakiKiri.getPanjang(), kakiKiri.getLebar());

        System.out.println("Masukkan panjang dan lebar kaki kanan : ");
        PersegiPanjang kakiKanan = new PersegiPanjang();
        kakiKanan.setPanjang(input.nextDouble());
        kakiKanan.setLebar(input.nextDouble());
        double luasKakiKanan = kakiKanan.luasPersegiPanjang(kakiKanan.getPanjang(), kakiKanan.getLebar());

        System.out.println("Masukkan jari-jari telapak kaki kiri : ");
        Lingkaran telapakKakiKiri = new Lingkaran();
        telapakKakiKiri.setJari(input.nextDouble());
        double luasTelapakKakiKiri = telapakKakiKiri.luasLingkaran(telapakKakiKiri.getJari());
        double tinggiTelapakKakiKiri = telapakKakiKiri.tinggiLingkaran(telapakKakiKiri.getJari());

        System.out.println("Masukkan jari-jari telapak kaki kanan : ");
        Lingkaran telapakKakiKanan = new Lingkaran();
        telapakKakiKanan.setJari(input.nextDouble());
        double luasTelapakKakiKanan = telapakKakiKanan.luasLingkaran(telapakKakiKanan.getJari());
        System.out.println();

        System.out.println("Luasnya robot adalah : " + hitungLuas(luasKepala, luasBadan, luasTanganKiri, luasTanganKanan, luasTelapakTanganKiri, luasTelapakTanganKanan, luasKakiKiri, luasKakiKanan, luasTelapakKakiKiri, luasTelapakKakiKanan));

        System.out.println("Tinggi robot adalah : " + hitungTinggi(tinggiKepala, badan.getPanjang(), kakiKiri.getPanjang(), tinggiTelapakKakiKiri));
    }

    public static double hitungLuas (double kepala, double badan, double tanganKiri, double tanganKanan, double telapakTanganKiri, double telapakTanganKanan, double kakiKiri, double kakiKanan, double telapakKakiKiri, double telapakKakiKanan){
        double luas = kepala + badan + tanganKiri + tanganKanan + telapakKakiKiri + telapakKakiKanan + kakiKiri + kakiKanan + telapakKakiKiri + telapakKakiKanan;
        return luas;
    }

    public static double hitungTinggi (double tinggiKepala, double panjangBadan, double panjangkakiKiri, double tinggitelapakKakiKiri) {
        double tinggi = tinggiKepala + panjangBadan + panjangkakiKiri + tinggitelapakKakiKiri;
        return tinggi;
    }
}
