package ru.job4j.array;

/**
 * Проверяет матрицу.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class MatrixCheck {
    /**
     * Проверяет матрицу -, что все элементы по диагоналям равны true или false.
     *
     * @param data Матрицу из boolean-элементов.
     * @return boolean.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean diagonal1 = data[0][0];
        boolean diagonal2 = data[0][data.length - 1];
        for (int i = 0; i < data.length; i++) {
            if (diagonal1 != data[i][i] | diagonal2 != data[i][data.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}