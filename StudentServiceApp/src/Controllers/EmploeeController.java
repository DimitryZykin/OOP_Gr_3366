package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

/**
 * Контроллер для работы с сотрудниками.
 * Реализует интерфейс iUserController.
 */

public class EmploeeController implements iUserController<Emploee>{
    private final EmploeeService empService = new EmploeeService();

     /**
     * Создание нового сотрудника.
     * @param firstName имя сотрудника
     * @param secondName фамилия сотрудника
     * @param age возраст сотрудника
     * @param address адрес сотрудника
     */

    @Override
    public void create(String firstName, String secondName, int age){
        empService.create(firstName, secondName, age);
    }

     /**
     * Метод для выплаты зарплаты сотруднику.
     * @param person сотрудник, которому выплачивается зарплата
     */

    public static <T extends Emploee> void paySalary(T person){
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

     /**
     * Метод для вычисления среднего значения числового массива.
     * @param num массив чисел
     * @param <T> тип элементов массива
     * @return среднее значение элементов массива
     */
    
    public static <T extends Number> Double mean(T[] num){
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}
