package Advanced.UzduotysNamuDarbai.uzduotis1;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, int ageOfExperience) {
        super(name, ageOfExperience);
        System.out.println("Java Developer created.");
    }

    public String printName(String name, String surname) {
        System.out.println("Nice to meet you " + name + " " + surname);
        return name;
    }
}
