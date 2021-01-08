package Advanced.UzduotysNamuDarbai.uzduotis1;

import org.w3c.dom.ls.LSOutput;

public abstract class Person {

    protected String name;

    public Person (String name) {
        this.name = name;
        System.out.println("Person created.");
    }

    public String getName() {
        return name;
    }

    public String printName (String name) {
        System.out.println("Nice to meet you " + name);
        return name;
    }
}
