package telran.Calculator;

public class CalculatorAppl {
    public static void main(String[] args) {
        System.out.println("Calculator: ");


        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int result = number1 / number2;


            System.out.println("number1 / number2 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cann't division of 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 0");
        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (NumberFormatException e) {
            System.out.println("Args not number");
        } catch (Exception e) {
            System.out.println("All exceptions");
        }
        System.out.println("End program");
        System.out.println();

        System.out.println("Calculator: ");

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int result = number1 * number2;
            System.out.println("number1 * number2 = " + result);


    } catch (ArithmeticException e) {
        System.out.println("Cann't multiplication of 0");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index 0");
    } catch (NullPointerException e) {
        System.out.println("null");
    } catch (NumberFormatException e) {
        System.out.println("Args not number.");
    } catch (Exception e) {
        System.out.println("All exceptions");
    }
        System.out.println("End program");

        System.out.println();

        System.out.println("Calculator: ");

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int result = number1 + number2;
            System.out.println("number1 + number2 = " + result);

        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (NumberFormatException e) {
            System.out.println("Args not number!");
        } catch (Exception e) {
            System.out.println("All exceptions");
        }
        System.out.println("End program");


        System.out.println();

        System.out.println("Calculator: ");

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int result = number1 - number2;
            System.out.println("number1 - number2 = " + result);

        } catch (NullPointerException e) {
            System.out.println("null");
        } catch (NumberFormatException e) {
            System.out.println("Args not number!");
        } catch (Exception e) {
            System.out.println("All exceptions");
        }
        System.out.println("End program");

    }



}