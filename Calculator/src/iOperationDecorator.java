/**
 * Интерфейс iOperationDecorator расширяет интерфейс iOperation и добавляет метод getDescription(),
 * который возвращает описание операции.
 */

public interface iOperationDecorator extends iOperation {
    /**
     * Метод возвращает описание операции.
     *
     * @return Описание операции в виде строки.
     */
    String getDescription();
}
