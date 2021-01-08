package Advanced.UzduotysNamuDarbai.uzduotis8;

import java.util.Random;

public class LoadGame {

    public enum PasleptiZodziai {

        GUBERNATORIUS,
        RESPUBLIKA,
        KOLORADAS,
        AFROAMERIKIETIS,
        KOMEDIANTAS,
        TRAMVAJUS,
        ATSPINDYS,
        PROGRAMUOTOJAS,
        BRANGAKMENIS

    }

    public static String generateWordToGuess() {
        PasleptiZodziai[] zodis = PasleptiZodziai.values();
        int wordLength = zodis.length;
        int randomIndex = new Random().nextInt(wordLength);
        String generatedWord = zodis[randomIndex].toString();
        return generatedWord;
    }
}
