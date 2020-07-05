package ru.job4j.converter;

/**
 * Корвертор валюты.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Converter {

    private static final int EURO_CURSE = 70;
    private static final int DOLLAR_CURSE = 60;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / EURO_CURSE;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        return value / DOLLAR_CURSE;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value Евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value * EURO_CURSE;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value Доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
        return value * DOLLAR_CURSE;
    }
}