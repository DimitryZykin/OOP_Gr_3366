package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Dict;
import Model.Student;

/**
 * Класс контроллера, который связывает Model и View.
 * Содержит методы для получения списка студентов из Model, обновления представления View,
 * запуска приложения и обработки команд пользователя.
 */

public class Controller{
    
    private List<Student> students; // ссылка на список студентов
    private iGetView view; // ссылка на объект представления View (с исползованием интерфейса)
    private iGetModel model; // ссылка на объект модели Model (с исползованием интерфейса)
    private String lang; // язык приложения
    
    /**
     * Конструктор класса.
     * @param view - объект представления
     * @param model - объект модели
     * @param lang - язык приложения
     */

    public Controller(iGetView view, iGetModel model, String lang){
        this.view = view;
        this.model = model;
        this.lang = lang;
        this.students = new ArrayList<Student>();
    } 
    
    // Метод для получения и отправки напрямую списка студентов из Model в View (реализация MVC)

    public void updateView(){
        view.printAllStudents(model.getAllStudents());
    }

    /**
     * Метод для получения (перехвата) команд от пользователя.
     */

    public void run(){
        boolean getNewIteration = true; // флаг
        while (getNewIteration) {
            String command = view.prompt(Dict.get("enterCommand", lang));
            
            try{
                Commands com = Commands.valueOf(command.toUpperCase());
                switch (com) {
                    // Командя для выхода из программы
                    case EXIT:
                        getNewIteration = false;
                        System.out.println(Dict.get("exit", lang));
                        break;
                    // Вывод списка студентов
                    case LIST:
                        updateView();
                        System.out.println("");
                        break;
                    // Удаление Студента
                    case DELETE:
                        updateView();
                        Long studentID = Long.parseLong(view.prompt(Dict.get("enterStudentId", lang)));
                        boolean isDeleted = model.deleteStudent(studentID);
                        if (!isDeleted){
                            System.out.println(Dict.get("notFound", lang));
                        } else {
                            System.out.println(Dict.get("deleted", lang));
                            updateView();
                            System.out.println("");
                        }
                        break;
                    default:
                        System.out.println(Dict.get("notCorrect", lang));
                        break;
                }
            } catch (Exception e){
                System.out.println(Dict.get("notCorrect", lang) + " = " + e.getMessage());
                System.out.println("");
            }
        }
    }
}
