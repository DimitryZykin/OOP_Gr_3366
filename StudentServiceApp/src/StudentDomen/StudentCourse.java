package StudentDomen;

import java.util.Iterator;
import java.util.List;

/*
 * Класс, представляющий поток студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку групп.
 */

public class StudentCourse implements Iterable<StudentGroup>{

    /*
     * groups содержит ссылку на список групп студентов в потоке, по которому будет производиться итерация. 
     * numOfCourse - номер потока.
     */

    private List<StudentGroup> groups;
    private int numOfCourse;

    /**
     * Конструктор класса.
     * @param numOfCourse номер потока
     * @param groups список групп студентов в потоке
     */

    public StudentCourse(int numOfCourse, List<StudentGroup> groups){
        this.numOfCourse = numOfCourse;
        this.groups = groups;        
    }
    
    /**
     * Метод для получения списка групп студентов в потоке.
     * @return список групп студентов
     */

    public List<StudentGroup> getGroups(){
        return groups;
    }

    /**
     * Метод для получения номера потока.
     * @return номер потока
     */

    public int getNumOfCourse(){
        return numOfCourse;
    }

    /**
     * Метод для установки списка групп студентов в потоке.
     * @param groups список групп студентов
     */

    public void setGroups(List<StudentGroup> groups){
        this.groups = groups;
    }

    /**
     * Метод для установки номера потока.
     * @param numOfCourse номер потока
     */

    public void setNumOfCourse(int numOfCourse){
        this.numOfCourse = numOfCourse;
    }

    /**
     * Метод для получения итератора по списку групп студентов в потоке.
     * @return итератор по списку групп студентов
     */

    @Override
    public Iterator<StudentGroup> iterator(){
        return new Iterator<StudentGroup>(){
            private int index = 0; // Текущая позиция в списке групп студентов.

            /**
             * Метод для проверки наличия следующего элемента в списке групп студентов.
             * @return true, если следующий элемент есть, false - в противном случае
             */

            @Override
            public boolean hasNext(){
               return index<groups.size();
            }

            /**
             * Метод для получения следующей группы студентов из списка.
             * @return следующая группа студентов
             */

            @Override
            public StudentGroup next(){
                if(!hasNext())
                {
                    return null;
                }
                return groups.get(index++);        
            }

        };
    }

    /**
     * Переопределенный метод toString() для вывода информации о потоке.
     * @return информация о потоке в виде строки
     */

    @Override
    public String toString(){
        String result = "Номер потока = " + numOfCourse +
                ", количество групп = " + this.groups.size() +
                ", список студентов:\n";
        for (StudentGroup group : groups){
            for (Student student : group){
                result += "Имя: " + student.getFirstName()  +
                "\tФамилия: " + student.getSecondName() +
                "\tВозраст: " + student.getAge() + 
                "\tstudentID: " + student.getStudentID() +"\n";
            }
        }
        return result;
    }
}
