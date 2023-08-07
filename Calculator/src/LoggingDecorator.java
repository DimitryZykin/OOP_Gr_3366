/**
 * Декоратор для логирования операции над комплексными числами.
 */

public class LoggingDecorator implements iOperationDecorator {
    private iOperation operation;

    /**
     * Конструктор.
     * @param operation операция, которую нужно выполнить.
     */

    public LoggingDecorator(iOperation operation) {
       this.operation = operation;
    }

    /**
     * Выполняет операцию над комплексными числами и логирует ее выполнение.
     * @param a первое комплексное число.
     * @param b второе комплексное число.
     * @return результат операции.
     */

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
       ComplexNumber result = operation.execute(a, b);
       System.out.println(getDescription() + ": " + operation.getClass().getSimpleName() + " над комплексными числами " + a + " и " + b);
       System.out.println("Результат операции: " + result);
       return result;
    }

    /**
     * Возвращает описание декоратора.
     * @return описание декоратора.
     */
    
    @Override
    public String getDescription() {
       return "Выполняется операция";
    }
 }
