package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс Dict представляет собой словарь для хранения текстовых фраз на двух языках: русском и английском.
 */

public class Dict{
    
    /**
     * Хэш-таблица для хранения фраз в виде ключ-значение, где ключ - это строковый идентификатор фразы,
     * а значение - массив из двух строк: русской и английской версий фразы соответственно.
     */

    private static HashMap<String, String[]> dictionary = new HashMap<>(Map.of(
        "enterCommand",   new String[] {"Введите команду: ", "Enter command: "},
        "exit",           new String[] {"Выход из программы", "Exit from Programm"}, 
        "notCorrect",     new String[] {"Некорректная команда!", "Command is not correct!"},
        "emptyList",      new String[] {"Список студентов пуст!", "Students List is empty!"},
        "enterStudentId", new String[] {"Введите номер студента: ", "Enter student ID: "},
        "notFound",       new String[] {"Студента с таким ID не найдёно", "There is no student with this ID"},
        "deleted",        new String[] {"Студент успешно удалён", "Student is successfully deleted"}
    ));
    
    /**
     * Метод для получения фразы по её строковому идентификатору и языку.
     * @param key строковый идентификатор фразы
     * @param lang язык, на котором нужно получить фразу (допустимые значения: "RUS" для русского языка, "ENG" для английского)
     * @return фраза на указанном языке
     */

    public static String get(String key, String lang){
        return dictionary.get(key)[lang.equals("RUS") ? 0 : 1];
    }
}
