package lt.klaipeda.treciapaskaita;

public class ArraysTaskExecutor {
    private static int[] array = {1, 7, 3, 10, 9};

    public void execute1Task() {
        int array1Sum = 0;

        for (int i = 0; i < array.length; i++) {
            array1Sum += array[i];
        }
        System.out.println(array1Sum);
    }

    public void execute2Task() {
        int array2Sum = 0;

        for (int i = 0; i < array.length; i++) {
            array2Sum += array[i];
        }
        int array2AverageValue = array2Sum / array.length;
        System.out.println(array2AverageValue);
    }

    public void execute3Task() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print("");
            }
        }
    }

    public void execute4Task() {
        int array4Max = array[0];
        int array4Min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array4Max) {
                array4Max = array[i];
            } else if (array[i] < array4Min) {
                array4Min = array[i];
            }
        }
        System.out.println("Min = " + array4Min + "; " + "Max = " + array4Max);
    }

    public void execute5Task() {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void execute6Task() {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("Odd = " + odd + "; " + "Even = " + even);
    }
}