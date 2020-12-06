package lt.klaipeda.antrapaskaita;

public class ConditionStatemants {
    public static void main(String[] args) {
//         checkAge();

        int randomNumber = 0;
        boolean ifEvenNumber = randomNumber % 2 == 0;
        boolean isRandomNumberZero = randomNumber == 0;

        if (ifEvenNumber && !isRandomNumberZero) {
            System.out.println("Number is even.");
        } else if (isRandomNumberZero) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is odd.");
        }

    }
    private static void checkAge() {
        byte jonasAge = 20;
        byte petrasAge = 30;

        boolean isJonasAgeOlderThenPetras = jonasAge > petrasAge;
        boolean isJonasSameAgeAsPetras = jonasAge == petrasAge;

        if (isJonasAgeOlderThenPetras) {
            System.out.println("Jonas is older then Petras.");
        } else if (isJonasSameAgeAsPetras) {
            System.out.println("Jonas ir Petras are same age.");
        } else {
            System.out.println("Petras is older then Jonas");
        }
    }


}
