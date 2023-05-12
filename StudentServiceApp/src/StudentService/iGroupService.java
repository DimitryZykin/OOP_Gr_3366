package StudentService;

import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;

/**
 * Интерфейс для работы с группами студентов.
 * @param <T> тип группы, должен наследоваться от StudentGroup.
 */

public interface iGroupService<T extends StudentGroup>{

    /**
     * Получение списка всех групп.
     * @return список всех групп.
     */

    List<T> getAll();

    /**
     * Создание новой группы на основе переданного списка студентов.
     * @param listStud список студентов, которых нужно добавить в группу.
     */
    
    void createGroup(List<Student> listStud);
}
