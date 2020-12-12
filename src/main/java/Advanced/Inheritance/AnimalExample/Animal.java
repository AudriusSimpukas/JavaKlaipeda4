package Advanced.Inheritance.AnimalExample;

public abstract class Animal {

    protected boolean mammal;
    private String voice;

    public Animal (boolean mammal, String voice) {
        this.mammal = mammal;
        this.voice = voice;
    }

    public String yeldVoice() {
        return ("My voice: " + voice);
    }
}
