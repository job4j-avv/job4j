package strategy;

/**
 * Интерфейс реализует паттерн Стратегия.
 *
 * @author Арыкин Валера (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public interface Shape {

    /**
     * Наследуемый метод должен "рисовать" фигуру в виде строки.
     *
     * @return String
     */
    String draw();
}
