package strategy;

/**
 * Треугольник.
 *
 * @author Арыкин Валера (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Triangle implements Shape {

    /**
     * Реализует метод рисования для треугольника.
     *
     * @return String строка содержащая фигуру - треугольник.
     */
    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();
        result.append("       *       \n");
        result.append("      * *      \n");
        result.append("     *   *     \n");
        result.append("    *     *    \n");
        result.append("   *********   \n");
        return result.toString();
    }
}
