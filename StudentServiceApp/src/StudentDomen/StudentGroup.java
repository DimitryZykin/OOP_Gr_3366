package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс представляет группу студентов и содержит список студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку студентов.
 */

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{

    /**
     * Список студентов
     */

    private List<Student> students;
    private int numOfGroup;

    /**
     * Конструктор класса StudentGroup.
     * @param listStud список студентов
     */

    public StudentGroup(int numOfGroup, List<Student> ListStud){
        this.numOfGroup = numOfGroup;
        this.students = ListStud;
    }

    /**
     * Метод для получения списка студентов.
     * @return список студентов
     */

    public List<Student> getStudents(){
        return students;
    }

    /**
     * Метод для установки списка студентов.
     * @param students список студентов
     */

    public void setStudents(List<Student> students){
        this.students = students;
    }

    /**
     * Метод для получения номера группы студентов
     * @return номер группы
     */

    public int getNumOfGroup(){
        return numOfGroup;
    }

    /**
     * Реализация метода iterator() интерфейса Iterable для возможности итерации по списку студентов.
     * @return итератор списка студентов
     */

    @Override
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(students);
    }

    /**
     * Реализация метода compareTo() интерфейса Comparable для сравнения групп по размеру.
     * @param o группа, с которой нужно сравнить текущую группу
     * @return результат сравнения в виде целого числа (0 - равны, 1 - текущая группа больше, -1 - текущая группа меньше)
     */

    @Override
    public int compareTo(StudentGroup o){
        if(this.students.size() == o.students.size()){            
            return 0;
        }
        if(this.students.size() < o.students.size()){
            return -1;
        }
        return 1;
    }

    /**
     * Переопределенный метод toString() для вывода информации о группе.
     * @return информация о группе в виде строки
     */

    @Override
    public String toString(){
        String result = "Номер группы = " + numOfGroup +
                ", количество студентов = " + this.students.size() +
                ", список студентов:\n";
        for (Student student : students) {
            result += "Имя: " + student.getFirstName()  +
            "\tФамилия: " + student.getSecondName() +
            "\tВозраст: " + student.getAge() + 
            "\tstudentID: " + student.getStudentID() +"\n";
        }
        return result;
    }
}
