package Controllers;

import StudentDomen.User;

/**
 * Интерфейс iUserController для управления пользователями.
 * @param <T> тип пользователя.
 */

public interface iUserController<T extends User> {

     /**
     * Создает нового пользователя.
     * @param firstName имя пользователя.
     * @param secondName фамилия пользователя.
     * @param age возраст пользователя.
     */

    void create(String firstName, String secondName, int age);
}
