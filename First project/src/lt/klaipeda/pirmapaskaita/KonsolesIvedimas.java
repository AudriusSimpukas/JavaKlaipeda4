package lt.klaipeda.pirmapaskaita;

import java.util.Scanner;

public class KonsolesIvedimas {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int amzius;
        int ugis;
        int svoris;

        System.out.println("Iveskite savo amziu:");
        amzius = myObj.nextInt();
        System.out.println("Iveskite savo ugi:");
        ugis = myObj.nextInt();
        System.out.println("Iveskite savo svori:");
        svoris = myObj.nextInt();

        boolean arNejaunas;
        arNejaunas = (amzius >= 25);

        boolean arGaliu;
        arGaliu = (ugis >= 150) && (svoris <= 180);

        System.out.println("Ar galiu keliauti karusele? " + (arNejaunas || arGaliu));


    }
}
