package Advanced.Classes.AnonimusClases;

public class AnonymusClassExample {
    public static void main(String[] args) {

        AbstractPlantClass abstractPlantClass = new AbstractPlantClass() {

            @Override
            public String getPlantName() {
                return "Klevas";
            }
        };

        System.out.println(abstractPlantClass.getPlantName());
    }
}
