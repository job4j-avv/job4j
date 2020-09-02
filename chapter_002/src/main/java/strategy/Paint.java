package strategy;

/**
 * Класс-контекст для паттерна Стратегия.
 *
 * @author Арыкин Валера (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Paint {

    /**
     * Создает фигуры и прорисовывает их.
     *
     * @param args неиспользуется
     */
    public static void main(String[] args) {
        Paint paint = new Paint();
        Shape square = new Square();
        Shape triangle = new Triangle();
        paint.draw(square);
        paint.draw(triangle);
    }

    /**
     * Вызывает метод рисования у переданных объектов
     *
     * @param shape используемая фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
