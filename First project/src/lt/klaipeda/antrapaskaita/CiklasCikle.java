package lt.klaipeda.antrapaskaita;

public class CiklasCikle {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = {9, 10, 11};
        int[][] arr = new int[3][];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k] + ",");
            }
        }
    }
}
