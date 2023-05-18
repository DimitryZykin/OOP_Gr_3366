package Controller;

import java.util.List;
import Model.Student;

/**
 * Интерфейс(договор между программистами) iGetModel. 
 * Предоставляет методы для получения и удаления студентов.
 */

public interface iGetModel{
    
    /**
     * Метод getAllStudents возвращает список всех студентов.
     * @return список студентов
     */

    public List<Student> getAllStudents();
    
    /**
     * Метод deleteStudent удаляет студента по указанному идентификатору.
     * @param studentID идентификатор студента
     * @return true, если студент был успешно удален, иначе - false
     */

    public boolean deleteStudent(long studentID);
}
