import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Возведение в степень");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = add(a, b);
                System.out.println("Результат сложения: " + result);
                break;
            case 2:
                result = subtract(a, b);
                System.out.println("Результат вычитания: " + result);
                break;
            case 3:
                result = multiply(a, b);
                System.out.println("Результат умножения: " + result);
                break;
            case 4:
                result = divide(a, b);
                System.out.println("Результат деления: " + result);
                break;
            case 5:
                result = power(a, b);
                System.out.println("Результат возведения в степень: " + result);
                break;
            default:
                System.out.println("Некорректный выбор операции.");
                break;
        }
    }

    public static int add(int a, int b) {
        checkArguments(a, b);
        return a + b;
    }

    public static int subtract(int a, int b) {
        checkArguments(a, b);
        return a - b;
    }

    public static int multiply(int a, int b) {
        checkArguments(a, b);
        return a * b;
    }

    public static double divide(int a, int b) {
        checkArguments(a, b);
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        return (double) a / b;
    }

    public static double power(int base, int exponent) {
        checkArguments(base, exponent);
        return Math.pow(base, exponent);
    }

    private static void checkArguments(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Аргументы должны быть положительными числами.");
        }
    }
}
