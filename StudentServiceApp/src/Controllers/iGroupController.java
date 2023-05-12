package Controllers;

import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;

/**
 * Интерфейс контроллера группы студентов.
 * @param <T> тип группы студентов.
 */

public interface iGroupController<T extends StudentGroup> {
    
    /**
     * Создает группу студентов на основе переданного списка студентов.
     * @param listStud список студентов.
     */

    void createGroup(List<Student>listStud);
}
