package StudentService;

import java.util.List;

/**
 * Интерфейс для работы с пользователями.
 * @param <T> тип данных, с которыми работает сервис.
 */

public interface iUserService<T>{

    /**
     * Получить всех пользователей.
     * @return список всех пользователей.
     */

    List<T> getAll();

    /**
     * Создать нового пользователя.
     * @param firstName имя пользователя.
     * @param secondName фамилия пользователя.
     * @param age возраст пользователя.
     */
    
    void create(String firstName, String secondName, int age);
}
