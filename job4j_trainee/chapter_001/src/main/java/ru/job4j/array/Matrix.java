package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Matrix {

    /**
     * Создает матрицу размером size.
     *
     * @param size Размер матрицы
     * @return Матрица.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                table[x - 1][y - 1] = x * y;
            }
        }
        return table;
    }
}
