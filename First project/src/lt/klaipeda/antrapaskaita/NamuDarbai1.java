package lt.klaipeda.antrapaskaita;

import java.util.Scanner;

public class NamuDarbai1 {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//
//        int inputNumber;
//        System.out.print("Write a number: ");
//        inputNumber = number.nextInt();
//
//        if ((inputNumber % 3 == 0 && inputNumber % 5 == 0) && inputNumber != 0)
//            System.out.println("FizzBuzz");
//        else if (inputNumber % 3 == 0 && inputNumber != 0)
//            System.out.println("Fizz");
//        else if (inputNumber % 5 == 0 && inputNumber != 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(".....");

//        String continentName = "Antarctica";
//
//        switch (continentName) {
//            case "Asia":
//                System.out.println(continentName + " is" + " 44,579,000 km2" + " large.");
//                break;
//            case "Europe":
//                System.out.println(continentName + " is" + " 10,180,000 km2" + " large.");
//                break;
//            case "Africa":
//                System.out.println(continentName + " is" + " 30,370,000 km2" + " large.");
//                break;
//            case "North America":
//                System.out.println(continentName + " is" + " 24,709,000 km2" + " large.");
//                break;
//            case "South America":
//                System.out.println(continentName + " is" + " 17,840,000 km2" + " large.");
//                break;
//            case "Australia":
//                System.out.println(continentName + " is" + " 8,600,000 km2" + " large.");
//                break;
//            case "Antarctica":
//                System.out.println(continentName + " is" + " 14,200,000 km2" + " large.");
//                break;
//            default:
//                System.out.println("The region does not exist.");
//        }

        // Pirma uzduotis:

//        int[] arr1 = {3, 7, 4, 2, 5};
//        int arr1Sum = 0;
//        int arr1MaxElement = arr1[0];
//        int arr1MinElement = arr1[0];
//
//        // 1a:
//        for (int i = 0; i < arr1.length; i++) {
//            arr1Sum += arr1[i];
//        }
//        System.out.println(arr1Sum);
//
//        // 1b:
//        for (int j = 1; j < arr1.length; j++) {
//            if (arr1[j] > arr1MaxElement) {
//                arr1MaxElement = arr1[j];
//            }
//        }
//        System.out.println(arr1MaxElement);
//
//        // 1c:
//        for (int k = 1; k < arr1.length; k++) {
//            if (arr1[k] < arr1MinElement) {
//                arr1MinElement = arr1[k];
//            }
//        }
//        System.out.println(arr1MinElement);

        // Antra uzduotis:

//        int[] arr2 = {5, 5, 8, 14, 3, 3, 14};
//        int arr2MinElement = arr2[0];
//        int arr2MaxElement = arr2[0];
//        int arr2IndexOfMinElement = 0;
//        int arr2IndexOfMaxElement = 0;
//
//        // 2a:
//
//        for (int i = 1; i < arr2.length; i++) {
//            if (arr2[i] < arr2MinElement || arr2[i] == arr2MinElement) {
//                arr2MinElement = arr2[i];
//                arr2IndexOfMinElement = i;
//            }
//        }
//        System.out.println("Smalest element is " + arr2MinElement + " with index of " + arr2IndexOfMinElement);
//
//        // 2b:
//
//        for (int j = 1; j < arr2.length; j++) {
//            if (arr2[j] > arr2MaxElement || arr2[j] == arr2MaxElement) {
//                arr2MaxElement = arr2[j];
//                arr2IndexOfMaxElement = j;
//            }
//        }
//        System.out.println("Largest element is " + arr2MaxElement + " with index of " + arr2IndexOfMaxElement);

        // Trecia uzduotis:

        int[] arr3 = {2, 7, 4};
        int[] arr4 = {1, 8, 5};
//        int[] arr5 = {2, 5, 3};
        int[][] multiarray = new int[2][];
        multiarray[0] = arr3;
        multiarray[1] = arr4;
//        multiarray[2] = arr5;

        // 3a:

        int multiarraySum = 0;

        for (int i = 0; i < arr3.length; i++) {
            multiarraySum += arr3[i] + arr4[i];
        }
        System.out.println("Sum of multiarray elements is: " + multiarraySum);
        System.out.println();

//        // 3b pirmas variantas (jei reikia surasti atskira didziausia elementa):
//
//        int multiarrayMaxElement = Integer.MIN_VALUE;
//        int multiarrayMaxElementIndexRow = 0;
//        int multiarrayMaxElementIndexColumnar = 0;
//        int multiarrayMinElement = Integer.MAX_VALUE;
//        int multiarrayMinElementIndexRow = 0;
//        int multiarrayMinElementIndexColumnar = 0;
//
//        for (int j = 0; j < multiarray.length; j++) {
//            for (int k = 0; k < multiarray[j].length; k++) {
//                if (multiarray[j][k] > multiarrayMaxElement || multiarray[j][k] == multiarrayMaxElement) {
//                    multiarrayMaxElement = multiarray[j][k];
//                    multiarrayMaxElementIndexRow = j;
//                    multiarrayMaxElementIndexColumnar = k;
//                }
//            }
//        }
//        System.out.println("Highest element is: " + multiarrayMaxElement);
//        System.out.println("Index of highest value in multiarray is: " +
//                "[" + multiarrayMaxElementIndexRow + "]" +
//                "[" + multiarrayMaxElementIndexColumnar + "]");
//        System.out.println();
//
//        for (int r = 0; r < multiarray.length; r++) {
//            for (int t = 0; t < multiarray[r].length; t++) {
//                if (multiarray[r][t] < multiarrayMinElement || multiarray[r][t] == multiarrayMinElement) {
//                    multiarrayMinElement = multiarray[r][t];
//                    multiarrayMinElementIndexRow = r;
//                    multiarrayMinElementIndexColumnar = t;
//                }
//            }
//        }
//        System.out.println("Lowest element is: " + multiarrayMinElement);
//        System.out.println("Index of lowest value in multiarray is: " +
//                "[" + multiarrayMinElementIndexRow + "]" +
//                "[" + multiarrayMinElementIndexColumnar + "]");

        // 3b antras variantas (jei reikia surasti didziausia suma turinti array):

        int multiarrayMaxArrSum = Integer.MIN_VALUE;
        int multiarrayMaxArrIndex = 0;
        int multiarrayMinArrSum = Integer.MAX_VALUE;
        int multiarrayMinArrIndex = 0;

        for (int g = 0; g < multiarray.length; g++) {
            int arraySum = 0;

            for (int h = 0; h < multiarray[g].length; h++) {
                arraySum += multiarray[g][h];
            }
            if (arraySum >= multiarrayMaxArrSum) {
                multiarrayMaxArrSum = arraySum;
                multiarrayMaxArrIndex = g;
            }
            if (arraySum < multiarrayMaxArrSum && arraySum <= multiarrayMinArrSum) {
                multiarrayMinArrSum = arraySum;
                multiarrayMinArrIndex = g;
            }


        }
        System.out.println("Multiarray's highest value by index is: "
                + multiarrayMaxArrSum + ", with index [" + multiarrayMaxArrIndex + "]");
        System.out.println("Multiarray's lowest value by index is: "
                + multiarrayMinArrSum + ", with index [" + multiarrayMinArrIndex + "]");


    }
}

