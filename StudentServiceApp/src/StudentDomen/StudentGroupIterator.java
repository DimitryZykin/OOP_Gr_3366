package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс реализует итератор для списка студентов.
 */

public class StudentGroupIterator implements Iterator<Student>{

    /**
     * @param counter для отслеживания текущей позиции в списке студентов
     * @param students содержит ссылку на список студентов, по которому будет производиться итерация.
     */

    private int counter;
    private final List<Student> students;

    /**
     * Конструктор класса StudentGroupIterator.
     * @param students список студентов
     */

    public StudentGroupIterator(List<Student> students){
        this.students = students;
        this.counter = 0;
    }

    /**
     * Метод для проверки наличия следующего элемента в списке.
     * @return true, если следующий элемент существует, иначе - false
     */

    @Override
    public boolean hasNext(){
       return counter<students.size();
    }

    /**
     * Метод для получения следующего элемента списка.
     * @return следующий элемент списка
     */

    @Override
    public Student next(){
        if(!hasNext()){
            return null;
        }
        return students.get(counter++);        
    }   
}
