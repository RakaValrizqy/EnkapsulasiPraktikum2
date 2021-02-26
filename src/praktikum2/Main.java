package praktikum2;
public class Main {
    public static void main(String[] args) {
        //objek dari class Bola
        Bola bola = new Bola();
        
        bola.setJariJari(14);
        bola.setPhi();
        bola.setDiameter();
        bola.setLuasPermukaan();
        bola.setVolume();
        bola.showDiameter();
        bola.showVolume();
        bola.showLuasPermukaan();
        
        bola.setJariJari(10);
        bola.setPhi();
        bola.setDiameter();
        bola.setVolume();
        bola.showDiameter();
        bola.showVolume();
    }
    
}
