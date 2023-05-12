package StudentDomen;

/**
 * Класс представляет студента и содержит данные о его имени, фамилии, возрасте и идентификаторе.
 * Класс также реализует интерфейс Comparable для сравнения студентов по возрасту и идентификатору.
 */

public class Student extends User implements Comparable<Student>{

     /**
     * идентификатор студента
     */
    private long studentID;

    /**
     * Конструктор класса Student.
     * @param firstName имя студента
     * @param secondName фамилия студента
     * @param age возраст студента
     * @param studentID идентификатор студента
     */

    public Student(String firstName, String secondName, int age, long studentID){
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    /**
     * Метод для получения идентификатора студента.
     * @return идентификатор студента
     */

    public long getStudentID(){
        return studentID;
    }

     /**
     * Метод для установки идентификатора студента.
     * @param studentID идентификатор студента
     */

    public void setStudentID(long studentID){
        this.studentID = studentID;
    }

     /**
     * Переопределение метода toString() для вывода информации о студенте.
     * @return информация о студенте в виде строки
     */

    @Override
    public String toString(){
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }

    /**
    * Реализация метода compareTo() интерфейса Comparable для сравнения студентов по возрасту и идентификатору.
    * @param o студент, с которым нужно сравнить текущего студента
    * @return результат сравнения в виде целого числа (0 - равны, 1 - текущий студент больше, -1 - текущий студент меньше)
    */

    @Override
    public int compareTo(Student o){
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(super.getAge()==o.getAge()){
            if(this.studentID==o.studentID){
                return 0;
            }
            if(this.studentID<o.studentID){
                return -1;
            }
            return 1;
        } 
        if(super.getAge()<o.getAge()){
            return -1;
        }   
        return 1;
    }
}
