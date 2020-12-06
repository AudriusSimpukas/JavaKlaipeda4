package lt.klaipeda.pirmapaskaita;

public class Logika {
    public static void main(String[] args) {
        int ugis = 180;
        int svoris = 200;
        int amzius = 22;

        boolean arNejaunas;
        arNejaunas = (amzius >= 25);

        boolean arGaliu;
        arGaliu = (ugis >= 150) && (svoris <= 180);

        System.out.println("Ar galiu keliauti karusele? " + (arNejaunas || arGaliu));


    }
}
