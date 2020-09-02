package strategy;

/**
 * Квадрат
 *
 * @author Арыкин Валера (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Square implements Shape {

    /**
     * Реализует метод рисования для квадрата.
     *
     * @return String строка содержащая фигуру - квадрат.
     */
    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();
        result.append("   *********   \n");
        result.append("   *       *   \n");
        result.append("   *       *   \n");
        result.append("   *       *   \n");
        result.append("   *********   \n");
        return result.toString();
    }
}

