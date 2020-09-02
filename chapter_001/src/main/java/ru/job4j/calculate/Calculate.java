package ru.job4j.calculate;

/**
 * Класс Calculate.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.2
 */
public class Calculate {

    /**
     * Метод main. Выводит строку приветствия на консоль.
     *
     * @param arg - аргументы.
     */
    public static void main(String[] arg) {
        System.out.println("Hello, World!");
    }

    /**
     * Метод эхо.
     *
     * @param name - имя
     * @return Строка "Echo, echo, echo : " и введенное имя
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}