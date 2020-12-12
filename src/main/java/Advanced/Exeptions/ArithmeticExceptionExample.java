package Advanced.Exeptions;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        int firstNum = 10;
        int secondNUm = 2;

        try {
            System.out.println(firstNum / secondNUm);
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide " + firstNum + " by " + secondNUm);
        } finally {
            System.out.println("Executing finally block");
        }
    }
}
