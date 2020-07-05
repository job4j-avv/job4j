package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Построение пирамиды в псевдографике.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.2
 */
public class Paint {

    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Выполняет построение всей пирамиды.
     *
     * @param height высота пирамиды.
     * @return строка с псевдографикой.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Выполняет построение правой стороны пирамиды.
     *
     * @param height высота пирамиды.
     * @return строка с псевдографикой.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Выполняет построение левой стороны пирамиды.
     *
     * @param height высота пирамиды.
     * @return строка с псевдографикой.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }
}
