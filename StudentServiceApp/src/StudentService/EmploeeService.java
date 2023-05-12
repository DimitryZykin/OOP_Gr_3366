package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

//Данный класс реализует интерфейс iUserService для работы с объектами типа Emploee.

public class EmploeeService implements iUserService<Emploee>{
    private int count;
    private List<Emploee> emploees;

    // Конструктор

    public EmploeeService(){
        this.emploees = new ArrayList<>();
    }

     /**
     * Метод создания нового объекта типа Emploee.
     * @param firstName  имя сотрудника.
     * @param secondName фамилия сотрудника.
     * @param age        возраст сотрудника.
     */

    @Override
    public void create(String firstName, String secondName, int age){
       Emploee per = new Emploee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
    }

    //Метод получения всех объектов типа Emploee.

    public List<Emploee> getAll(){
        return emploees;
    }

    // Метод получения списка объектов типа Emploee, отсортированных по ФИО и группе.
     
    public List<Emploee> getSortedByFIOStudentGroup(){
        List<Emploee> employees = new ArrayList<>(this.emploees);
        employees.sort(new UserComparator<>());
        return emploees;
    }
}
