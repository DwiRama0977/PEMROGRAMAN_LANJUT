package Tugas2;

class Lingkaran {
    private double jari;

    public void setJari (double jari){
        this.jari = jari;
    }
    public double getJari (){
        return this.jari;
    }

    public double luasLingkaran (double jari){
        double luas = getJari()*2*Math.PI;
        return luas;
    }

    public double tinggiLingkaran (double jari) {
        double tinggi = getJari()*2;
        return tinggi;
    }
}
class PersegiPanjang {
    private double panjang;
    private double lebar;

    public void setPanjang (double panjang) {
        this.panjang = panjang;
    }
    public void setLebar (double lebar) {
        this.lebar = lebar;
    }
    public double getPanjang (){
        return this.panjang;
    }
    public double getLebar (){
        return this.lebar;
    }

    public double luasPersegiPanjang (double panjang, double lebar){
        double luas = getPanjang()*getLebar();
        return luas;
    }
}
