package StudentDomen;

/**
 * Класс, представляющий преподавателя.
 * Потомок класса User.
 */

public class Teacher extends User{
    private int teacerId; // идентификатор преподавателя
    private String academicDegree; // ученая степень преподавателя

    /**
     * Конструктор класса Teacher.
     * @param firstName Имя преподавателя.
     * @param secondName Фамилия преподавателя.
     * @param age Возраст преподавателя.
     * @param teacherId Уникальный идентификатор преподавателя.
     * @param academicDegree Ученая степень преподавателя.
     */

    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree ){
        super(firstName, secondName, age);
       this.teacerId = teacerId;
       this.academicDegree = academicDegree;
    }

    // Метод для получения уникального идентификатора преподавателя

    public int getTeacerId(){
        return teacerId;
    }

    // Метод для установки уникального идентификатора преподавателя

    public void setTeacerId(int teacerId){
        this.teacerId = teacerId;
    }

    // Метод для получения ученой степени преподавателя

    public String getLevel(){
        return academicDegree;
    }

    // Метод для установки ученой степени преподавателя

    public void setLevel(String academicDegree){
        this.academicDegree = academicDegree;
    }

     /**
     * Переопределение метода toString для класса Teacher.
     * @return Строковое представление объекта класса Teacher.
     */

    @Override
    public String toString(){
        return  "Имя = " + super.getFirstName()  +
                "\tФамилия = " + super.getSecondName() +
                "\tВозраст = " + super.getAge() +
                "\tteacherId = " + teacerId +
                "\tУчёная степень = " + academicDegree;
    }            
}
