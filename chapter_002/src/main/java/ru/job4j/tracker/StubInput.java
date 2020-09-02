package ru.job4j.tracker;


import ru.job4j.tracker.menu.MenuOutException;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Эмулирует работу пользователя - ввод информации с клавиатуры.
 */

public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     * Например. Если пользователь
     * хочет выбрать добавление новой заявки ему нужно ввести:
     * 1 - выбор пункта меня "добавить новую заявку".
     * name - имя заявки
     * desc - описание заявки
     * 7 - выйти из трекера.
     */
    private final String[] value;

    /**
     * Поле считает количество вызовом метода ask.
     * При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * у нас есть объект в котором содержатся заранее продуманные ответы.
     * При последовательном вызове метода ask нам надо возвращать соответствующие данные.
     * Как если бы мы симулировали поведение пользователя.
     * Для этого при каждом вызове метода ask мы увеличиваем счетчик и
     * при следующем вызове он вернет нам новое значение.
     */
    @Override
    public String ask(String question) {
        if (this.position < this.value.length) {
            return this.value[this.position++];
        } else {
            return null;
        }
    }

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