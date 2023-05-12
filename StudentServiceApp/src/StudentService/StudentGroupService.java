package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/**
 * Класс для работы с объектами типа StudentGroup.
 */

public class StudentGroupService implements iGroupService<StudentGroup>{
    private List<StudentGroup> groups;
    private int count;

    // Конструктор

    public StudentGroupService(){
        this.groups = new ArrayList<>();
    }

    /**
     * Метод для получения списка всех объектов типа StudentGroup.
     * @return список всех объектов типа StudentGroup.
     */

    public List<StudentGroup> getAll(){
        return this.groups;
    }
    
    /**
     * Метод для получения списка всех студентов определенной группы, отсортированных по ФИО.
     * @param numOfGroup номер группы.
     * @return список всех студентов определенной группы, отсортированных по ФИО.
     */

    public List<Student> getSortedByFIOStudentGroup(int numOfGroup){
        List<Student> students = new ArrayList<>(groups.get(numOfGroup).getStudents());
        students.sort(new UserComparator<>());
        return students;
    }

    /**
     * Метод для создания нового объекта типа StudentGroup и добавления его в список.
     * @param listStud список студентов группы.
     */

    @Override
    public void createGroup(List<Student> listStud){
        StudentGroup per = new StudentGroup(count, listStud);
        count++;
        groups.add(per);
    }
}
