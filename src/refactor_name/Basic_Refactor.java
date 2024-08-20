package refactor_name;

public class Basic_Refactor {

    public static final int TEN = 10;
    public static final int FIVE = 5;

    public int sum(int numberOne, int numberTwo){
        numberOne = getNumberOne(numberOne);
        numberTwo = getNumberTwo(numberTwo);
        return numberOne+numberTwo;
    }

    private int getNumberTwo(int numberTwo) {
        numberTwo = numberTwo + TEN;
        return numberTwo;
    }

    private static int getNumberOne(int numberOne) {
        numberOne = numberOne + FIVE;
        return numberOne;
    }
}
