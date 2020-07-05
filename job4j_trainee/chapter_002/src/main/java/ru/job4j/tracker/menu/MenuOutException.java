package ru.job4j.tracker.menu;

/**
 * Исключение Выход за пределы меню.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class MenuOutException extends RuntimeException {

    /**
     * Просто передает в супер-класс сообщение
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
