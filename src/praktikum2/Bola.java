package praktikum2;
public class Bola {
    private double jari;
    private double phi;
    private double diameter;
    private double volume;
    private double luasPermukaan;
    
    //method untuk memberi nilai jari jari
    public void setJariJari(double jari) {
        this.jari = jari;
       
    }
    //method menentukan phi
    public void setPhi() {
        if (this.jari % 7 == 0) {
            double a = 22;
            double b = 7;
            this.phi = a/b;
        }
        else {
            this.phi = 3.14;
        }
    }
    //method menghitung diameter
    public void setDiameter() {
        diameter = jari * 2;
    }
    //method menghitung volume
    public void setVolume() {
        double a = 4;
        double b = 3;
        volume = a/b * phi * jari * jari * jari;
    }
    //method menghitung luas permukaan
    public void setLuasPermukaan() {
        luasPermukaan = 4 * phi * jari * jari;
    }
    //method menampilkan diameter
    public void showDiameter() {
        System.out.println("Diameter : "+diameter);
        System.out.println("Phi      : "+phi);
    }
    //method menampilkan volume
    public void showVolume() {
        System.out.println("Volume : "+volume);
    }
    //method menampilkan luas permukaan
    public void showLuasPermukaan() {
        System.out.println("Luas permukaan : "+luasPermukaan);
    }
    
}
