package StudentDomen;

/**
 * Класс, представляющий пользователя системы.
 */

public class User{

    private String firstName; 
    private String secondName;
    private int age; 

    /**
    * Конструктор класса User.
    * @param firstName Имя пользователя
    * @param secondName Фамилия пользователя
    * @param age Возраст пользователя
    */

    public User(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * Метод для получения имени пользователя.
     * @return Имя пользователя
     */

    public String getFirstName(){
        return firstName;
    }

    /**
     * Метод для установки имени пользователя.
     * @param firstName Имя пользователя
     */

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Метод для получения фамилии пользователя.
     * @return Фамилия пользователя
     */

    public String getSecondName(){
        return secondName;
    }

    /**
     * Метод для установки фамилии пользователя.
     * @param secondName Фамилия пользователя
     */

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    /**
     * Метод для получения возраста пользователя.
     * @return Возраст пользователя
     */

    public int getAge(){
        return age;
    }

    /**
     * Метод для установки возраста пользователя.
     * @param age Возраст пользователя
     */

    public void setAge(int age){
        this.age = age;
    }

     /**
     * Переопределение метода toString() для вывода информации о пользователе.
     * @return Информация о пользователе
     */
    
    @Override
    public String toString(){
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
