package StudentDomen;

// Класс, представляющий сотрудника

public class Emploee extends User{
    private int empId; // идентификатор сотрудника

     /**
     * Конструктор класса.
     * @param firstName имя сотрудника.
     * @param secondName фамилия сотрудника.
     * @param age возраст сотрудника.
     * @param empId идентификатор сотрудника.
     */

    public Emploee(String firstName, String secondName, int age, int empId){
        super(firstName, secondName, age);
        this.empId = empId;
    }
    // Метод для получения идентификатора сотрудника

    public int getEmpId(){
        return empId;
    }
    // Метод для установки значения идентификатора сотрудника
    
    public void setEmpId(int empId){
        this.empId = empId;
    }
}
