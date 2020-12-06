package lt.klaipeda.treciapaskaita;

import java.awt.*;
import java.util.Scanner;

public class LearningString {
    public static void main(String[] args) {
//        String manoVardas = new String("Audrius");
//        String draugoVardas = "Audrius";
//
//        if (manoVardas == draugoVardas) {
//            System.out.println("Vardai lygus");
//        }
//        else {
//            System.out.println("Vardai nelygus");
//        }

        Scanner ivedimas = new Scanner(System.in);

        String vardas = ivedimas.nextLine();
        long metai = ivedimas.nextLong();
        double skaicius = ivedimas.nextDouble();
        float kitasSkaicius = ivedimas.nextFloat();

        System.out.println(vardas);
        System.out.println(metai);
        System.out.println(skaicius);
        System.out.println(kitasSkaicius);

    }
}
