public class CalculatorTest {
    public static void main(String[] args) {
        testСложение();
        testВычитание();
        testУмножение();
        testДеление();
        testВозведениеВСтепень();
    }

    public static void testСложение() {
        int результат = Calculator.add(2, 3);
        assert результат == 5 : "Тест сложения не пройден";
        System.out.println("Тест сложения пройден успешно");
    }

    public static void testВычитание() {
        int результат = Calculator.subtract(5, 2);
        assert результат == 3 : "Тест вычитания не пройден";
        System.out.println("Тест вычитания пройден успешно");
    }

    public static void testУмножение() {
        int результат = Calculator.multiply(4, 3);
        assert результат == 12 : "Тест умножения не пройден";
        System.out.println("Тест умножения пройден успешно");
    }

    public static void testДеление() {
        double результат = Calculator.divide(10, 2);
        assert результат == 5.0 : "Тест деления не пройден";
        System.out.println("Тест деления пройден успешно");

        try {
            Calculator.divide(10, 0);
            assert false : "Тест деления на ноль не пройден";
        } catch (IllegalArgumentException e) {
            // Деление на ноль ожидается, поэтому тест считается пройденным
            System.out.println("Тест деления на ноль пройден успешно");
        }
    }

    public static void testВозведениеВСтепень() {
        double результат = Calculator.power(2, 3);
        assert результат == 8.0 : "Тест возведения в степень не пройден";
        System.out.println("Тест возведения в степень пройден успешно");
    }
}
