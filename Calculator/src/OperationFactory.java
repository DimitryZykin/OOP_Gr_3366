/**
 * Фабрика операций.
 */

public class OperationFactory {
    
    /**
     * Создает объект операции в зависимости от переданного типа.
     * @param type тип операции
     * @return объект операции
     * @throws IllegalArgumentException если передан неизвестный тип операции
     */
    
    public static iOperation createOperation(String type) {
       switch (type) {
          case "addition":
             return new AdditionOperation();
          case "multiplication":
             return new MultiplicationOperation();
          case "division":
             return new DivisionOperation();
          default:
             throw new IllegalArgumentException("Неизвестный тип операции: " + type);
       }
    }
 }
