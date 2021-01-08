package Advanced.UzduotysNamuDarbai.uzduotis1;

public class UzduotisMain {
    public static void main(String[] args) {

        JavaDeveloper javaDeveloper = new JavaDeveloper("Audrius", 2);

        javaDeveloper.printNameAndAge(javaDeveloper.getName(), javaDeveloper.ageOfExperience);
        javaDeveloper.printName(javaDeveloper.getName());

        javaDeveloper.printName(javaDeveloper.getName(), "Simpukas");
        javaDeveloper.printName("Jonas", "Jonaitis");
    }
}
