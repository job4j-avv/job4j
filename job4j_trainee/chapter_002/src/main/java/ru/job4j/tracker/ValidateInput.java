package ru.job4j.tracker;

import ru.job4j.tracker.menu.MenuOutException;

import java.util.List;

/**
 * Реализует консольный ввод, обрабатывает исключительные ситуации.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    /**
     * Возвращает выбранный пункт меню от пользователя.
     * @param question Текст вопроса пользователю.
     * @param range допустимые границы меню.
     */
    @Override
    public int ask(String question, List<Integer> range) {
        boolean invalid = true;
        int r = -1;
        do {
            try {
                r = this.input.ask(question, range);
                invalid = false;
            } catch (NumberFormatException | MenuOutException e) {
                System.out.println("Введите коректные данные");
            }
        } while (invalid);
        return r;
    }
}
