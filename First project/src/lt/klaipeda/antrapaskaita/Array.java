package lt.klaipeda.antrapaskaita;

public class Array {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int[] arrayWithValue = new int[]{5, 8, 7, 9};
        int[] arrNew = {5, 8, 7, 9};

        int lastElementOfArrayWithValues = arrayWithValue[arrayWithValue.length - 1];
        System.out.println(lastElementOfArrayWithValues);

        int[][] multiArray = new int[3][];
        multiArray[0] = arrayWithValue;
        multiArray[1] = arrNew;

        int[] smallArray = {2};
        multiArray[2] = smallArray;
        System.out.println(multiArray[2][0]);
        System.out.println(multiArray[multiArray.length - 1]
                [multiArray[multiArray.length - 1].length - 1]);


    }
}
