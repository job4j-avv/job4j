package professions;

/**
 * Проффесия Инжинер.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Engineer extends Profession {

    /**
     * Конструктор класса Инжинер.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Engineer(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - строить.
     */
    public String build() {
        return String.format("Я инженер, %s. Я могу разрабатывать", this.getName());
    }
}
