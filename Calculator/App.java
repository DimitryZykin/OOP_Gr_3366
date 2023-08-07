/**
 * Основной класс приложения.
 */

public class App {

    /**
     * Метод main, точка входа в приложение.
     * 
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {

        // Создание экземпляров View и Calculator

        View view = new View();
        Calculator calculator = new Calculator();
        int choice = 0;
        while (choice != 4) {

            // Вывод на экран меню

            view.showMenu();
            choice = view.getMenuChoice();

            // Выбор операции в зависимости от выбора пользователя

            switch (choice) {
                case 1:

                    // Получение двух комплексных чисел от пользователя и выполнение операции сложения

                    ComplexNumber num1 = view.getComplexNumber();
                    ComplexNumber num2 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("addition")));
                    ComplexNumber sum = calculator.execute(num1, num2);
                    break;
                case 2:

                    // Получение двух комплексных чисел от пользователя и выполнение операции деления

                    ComplexNumber num3 = view.getComplexNumber();
                    ComplexNumber num4 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("division")));
                    ComplexNumber div = calculator.execute(num3, num4);
                    break;
                case 3:

                    // Получение двух комплексных чисел от пользователя и выполнение операции умножения

                    ComplexNumber num5 = view.getComplexNumber();
                    ComplexNumber num6 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("multiplication")));
                    ComplexNumber product = calculator.execute(num5, num6);
                    break;
                case 4:

                    // Вывод сообщения о выходе из программы

                    System.out.println("Выход");
                    break;
                default:

                    // Вывод сообщения об ошибке при некорректном выборе пользователя

                    System.out.println("Некорректный выбор");
            }
        }
    }
}
