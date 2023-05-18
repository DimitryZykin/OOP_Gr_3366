package Controller;

import java.util.List;
import Model.Student;

/**
 * Интерфейс(договор между программистами) iGetView.
 * Определяет методы для отображения данных в программе.
 */

public interface iGetView{
    
    /**
     * Метод printAllStudents печатает список студентов. 
     * @param students Список студентов.
     */

    void printAllStudents(List<Student> students);
    
    /**
     * Метод prompt запрашивает у пользователя ввод данных и возвращает введенное значение.
     * @param message Сообщение, которое будет выведено перед запросом ввода данных.
     * @return Введенное значение.
     */

    String prompt(String message);
}
