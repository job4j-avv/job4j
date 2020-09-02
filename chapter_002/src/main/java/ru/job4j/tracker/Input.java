package ru.job4j.tracker;

import java.util.List;

/**
 * Интерфейс для классов наследников,
 * реализующих метод ask
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public interface Input {
    /**
     * Возвращает выбранный пункт меню от пользователя.
     * @param question Текст вопроса пользователю.
     */
    String ask(String question);

    /**
     * Возвращает выбранный пункт меню от пользователя.
     * @param question Текст вопроса пользователю.
     * @param range    допустимые границы меню.
     */
    int ask(String question, List<Integer> range);
}
