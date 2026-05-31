import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int operate = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        }.operate(9, 6);
        System.out.println(operate);

        StringManipulator upperCaseManipulator = (s) -> s.toUpperCase();
        String upperedCase = upperCaseManipulator.manipulate("чепуха");
        System.out.println(upperedCase);

        StringManipulator lowerCaseManipulator = String::toLowerCase;
        String loweredCase = lowerCaseManipulator.manipulate("ЧЕПУХА");
        System.out.println(loweredCase);

        Function<String, Integer> function = StringListProcessor::countUppercase;
        Integer countUpperCase = function.apply("ЧеПуХа");
        System.out.println(countUpperCase);

        Integer randomNumber = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return RandomNumberGenerator.generateRandomNumber(1, 100);
            }
        }.get();
        System.out.println(randomNumber);


    }
}