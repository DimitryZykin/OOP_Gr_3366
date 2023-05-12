package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.User;

// Класс подсчета среднего возраста любых объектов, наследующих класс User

public class AverageAge<T extends User>{
    private int count; // счетчик количества объектов
    private double sum; // сумма возрастов объектов

    //Метод добавления объекта в подсчет.
    
    public void add(T person){
        if (person instanceof Student){
            sum += ((Student) person).getAge(); 
            count++; 
        } else if (person instanceof Teacher){
            sum += ((Teacher) person).getAge();
            count++;
        } else if (person instanceof Emploee){
            sum += ((Emploee) person).getAge();
            count++;
        }
    }

    // Метод получения среднего возраста объектов.
     
    public double getAverageAge(){
        return sum / count;
    }

    // Переопределение метода toString для вывода среднего возраста объектов.

    @Override
    public String toString(){
        return "Средний возраст: " + getAverageAge();
    }
}
