package lt.klaipeda.antrapaskaita;

public class SwichStatement {
    public static void main(String[] args) {


        int dayOfWeekToday = 7;

        switch (dayOfWeekToday) {
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Non of a day");

        }
//        String name = "Ingrida";
//        switch (name) {
//            case "Petras":
//                System.out.println(name);
//            default:
//                System.out.println(name);
//            case "Jonas":
//                System.out.println(name);
//        }
    }
}
