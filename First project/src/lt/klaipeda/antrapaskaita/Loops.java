package lt.klaipeda.antrapaskaita;

public class Loops {
    public static void main(String[] args) {
//        int[] arr = {5, 10, 15};
//
//        for (int element: arr) {
//            System.out.println(element);
//        }

//        for (int i = 0; i <=10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <=10; i = i + 2) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            if (i % 5 == 0) {
//                break;
//            }
//            System.out.println(i);
//        }

//        short age = 1;
//
//        while (age < 18) {
//            age++;
//            System.out.println("You can not vote.");
//        }

        short newAge = 1;
        do {
            System.out.println("You can vote.");
        }
        while (newAge >= 18);

    }
}
