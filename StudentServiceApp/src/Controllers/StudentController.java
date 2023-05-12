package Controllers;

import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**
 * Класс контроллера для управления студентами.
 */

public class StudentController implements iUserController<Student>, iGroupController<StudentGroup>{
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    
    /**
     * Создает нового студента.
     * @param firstName Имя студента.
     * @param secondName Фамилия студента.
     * @param age Возраст студента.
     */

    @Override
    public void create(String firstName, String secondName, int age){
        dataService.create(firstName, secondName, age);
    }
    
    /**
     * Создает новую группу студентов.
     * @param listStud Список студентов, входящих в группу.
     */
    
    @Override
    public void createGroup(List<Student> listStud){
        groupService.createGroup(listStud);
    }
}
