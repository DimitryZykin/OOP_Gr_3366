package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.UserComparator;

// Класс для работы с объектами типа Student.

public class StudentService implements iUserService<Student>{
    private int count; 
    private List<Student> students;

    // Конструктор

    public StudentService(){
        this.students = new ArrayList<>();
    }

    /**
     * Метод для получения списка всех объектов типа Student.
     * @return список всех объектов типа Student.
     */

    public List<Student> getAll(){
        return students;
    }

    /**
     * Метод для создания нового объекта типа Student и добавления его в список.
     * @param firstName имя студента.
     * @param secondName фамилия студента.
     * @param age возраст студента.
     */

    @Override
    public void create(String firstName, String secondName, int age){
        Student per = new Student(firstName, secondName, age, count); 
        count++; 
        students.add(per); 
    }

    /**
     * Метод для получения списка всех объектов типа Student, отсортированных по ФИО.
     * @param studentID идентификатор студента.
     * @return список всех объектов типа Student, отсортированных по ФИО.
     */

    public List<Student> getSortedByFIOStudentGroup(long studentID){
        List<Student> students = new ArrayList<>(this.students); // создаем копию списка объектов типа Student
        students.sort(new UserComparator<>()); // сортируем список по ФИО
        return students; // возвращаем отсортированный список
    }
}
