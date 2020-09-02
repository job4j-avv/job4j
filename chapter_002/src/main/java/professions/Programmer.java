package professions;

/**
 * Проффесия програмист.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Programmer  extends Engineer {
    /**
     * Конструктор класса програмист.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Programmer(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - писать говнокод.
     *
     * @return Строка-действие.
     */
    public String write() {
        return String.format("Я програмист, %s. Я могу писать говнокод (все равно никто не увидит)", this.getName());
    }
}
