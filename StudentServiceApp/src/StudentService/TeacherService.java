package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

// Класс для работы с объектами типа Teacher.

public class TeacherService implements iUserService<Teacher>{
    private int count; // счетчик количества объектов
    private String academicDegree; // ученая степень
    private List<Teacher> teachers; // список объектов типа Teacher

    // Конструктор

    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    /**
     * Метод для получения списка всех объектов типа Teacher.
     * @return список всех объектов типа Teacher.
     */

    @Override
    public List<Teacher> getAll(){
        return teachers;
    }

    /**
     * Метод для создания нового объекта типа Teacher и добавления его в список.
     * @param firstName имя преподавателя.
     * @param secondName фамилия преподавателя.
     * @param age возраст преподавателя.
     */

    @Override
    public void create(String firstName, String secondName, int age){
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegree);
        count++; 
        teachers.add(per); // добавляем объект в список
    }

    /**
     * Метод для получения списка всех объектов типа Teacher, отсортированных по ФИО.
     * @param teacherId идентификатор преподавателя.
     * @return список всех объектов типа Teacher, отсортированных по ФИО.
     */

    public List<Teacher> getSortedByFIOStudentGroup(long teacherId){
        List<Teacher> teachers = new ArrayList<>(this.teachers);
        teachers.sort(new UserComparator<>());
        return teachers;
    }
}
