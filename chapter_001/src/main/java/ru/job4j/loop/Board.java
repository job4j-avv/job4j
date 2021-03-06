package ru.job4j.loop;

/**
 * Шахматная доска.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Board {
    /**
     * Строит доску с размерами width * height.
     *
     * @param width  ширина.
     * @param height высота.
     * @return Строка, содержащая элементы шахматной доски.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (((i + j) % 2) == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}