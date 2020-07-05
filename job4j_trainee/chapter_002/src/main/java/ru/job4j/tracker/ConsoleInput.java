package ru.job4j.tracker;

import ru.job4j.tracker.menu.MenuOutException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


/**
 * Реализует консольный ввод.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Возвращает выбранный пункт меню от пользователя.
     *
     * @param question Текст вопроса пользователю.
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Возвращает выбранный пункт меню от пользователя.
     *
     * @param question Текст вопроса пользователю.
     * @param range    допустимые границы меню.
     */
    @Override
    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int val : range) {
            if (val == key) {
                exist = true;
                break;
            }
        }
        validate(exist);
        return key;
    }

    /**
     * валидатор.
     *
     * @param val то что нужно проверить
     * @return true-если проверка прошла успешно, иначе выбросит исключение MenuOutException
     *
     */
    boolean validate(final boolean val) {
        this.validates.forEach(action -> action.accept(val));
        return true;
    }

    /**
     * функциональный метод для валидации.
     * может расширятся, добавляя другие проверки.
     */
    private final List<Consumer<Boolean>> validates = Arrays.asList(
            item -> {
                if (!item) {
                    throw new MenuOutException("За пределами меню");
                }
            }
    );
}
