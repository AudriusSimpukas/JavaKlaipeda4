package Advanced.UzduotysNamuDarbai.uzduotis1;

public class Developer extends Person {

    protected int ageOfExperience;

    public Developer (String name, int ageOfExperience) {
        super(name);
        this.ageOfExperience = ageOfExperience;
        System.out.println("Developer created.");
    }

    public void printNameAndAge (String name, int age) {
        System.out.println(name + " " + age);
    }

}
