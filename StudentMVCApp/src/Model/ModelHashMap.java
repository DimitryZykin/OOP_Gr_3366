package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import Controller.iGetModel;

/**
 * Класс, представляющий список студентов (в отличие от Model работает с файлами).
 * Это репозиторий файлов.
 */

public class FileRepo implements iGetModel { // с подключенным интерфейсом iGetModel 
    private String fileName; // Название файла, где хранятся данные
    private List<Student> students; // Объявляем список, куда будем помещать студентов

    // Конструктор

    public FileRepo(String fileName){
        this.fileName = fileName;
        this.students = new ArrayList<>(); // При инициализации создаём пустой список студентов

        // Проверяем, имеем ли мы доступ к файлу (try - catch позволяет обнаружить ошибки)

        try(FileWriter fw = new FileWriter(fileName, true)){ // открываем файл
            fw.flush(); // закрываем файл, если все хорошо  
        } catch (Exception e){
            System.out.println(e.getMessage()); // иначе сообщение об ошибке
        }
    }

    // Метод добавления студентов в List (временное хранилище)

    public void addStudent(Student student){
        this.students.add(student);
    }

    // Метод чтения данных всех студентов из файла

    public void readAllStudentsFromFile(){

        // Проверяем на возможные ошибки

        try{
            File file = new File(fileName); // получаем информацию о файле
            FileReader fr = new FileReader(file); // получаем разрешение подключиться к файлу
            BufferedReader reader = new BufferedReader(fr); // открываем соединение с файлом

            // Считываем данные из файла построчно, используя цикл

            String line = reader.readLine();
            while(line!=null){
                String[] param = line.split(" "); // будем выводить элементы строки через "пробел"

                // Создание экземпляра студента, считанного с файла

                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine(); // считываем следующую строку файла
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage()); // иначе сообщение об ошибке
        }
    }

    // Метод для записи данных студентов в файл с проверкой на ошибки

    public void saveAllStudentsToFile(){
        try(FileWriter fw = new FileWriter(fileName, true)){
            for(Student pers : students){
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentID());
                fw.append('\n'); // перевод строки
            }
            fw.flush();    
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Переопределяем метод из интерфейса iGetModel

    @Override
    public List<Student> getAllStudents(){
        readAllStudentsFromFile();
        return students;
    }

    // Удаляем студента, зная его ID
    // Переопределяем метод из интерфейса iModel

    @Override
    public boolean deleteStudent(long studentID){        
        
        for (int i = 0; i < students.size(); i ++){
            if (students.get(i).getStudentID() == studentID){
                students.remove(i);

                // Очищаем файл со студентами и сохраняем обновлённый список

                try (FileWriter fw = new FileWriter(fileName, false)){
                    fw.flush();
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                saveAllStudentsToFile();
                return true;
            }
        }
        return false;
    }    
}
