import java.util.Scanner;

public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println();
        System.out.println("//Калькулятор комплексных чисел//\n");
        System.out.println("МЕНЮ:");
        System.out.println("1. Сложение");
        System.out.println("2. Деление");
        System.out.println("3. Умножение");
        System.out.println("4. Выход");
    }

    public int getMenuChoice() {
        System.out.print("Выберите операцию: ");
        return sc.nextInt();
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Введите действительную часть комплексного числа: ");
        double realPart = sc.nextDouble();
        System.out.print("Введите мнимую часть комплексного числа:");
        double imaginaryPart = sc.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void showResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }
} 
