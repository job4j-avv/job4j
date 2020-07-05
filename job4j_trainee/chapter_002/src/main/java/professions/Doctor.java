package professions;

/**
 * Проффесия Доктор.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Doctor extends Profession {

    /**
     * Конструктор класса Доктор.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Doctor(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - лечить.
     *
     * @return Строка-действие.
     */
    public String heal() {
        return String.format("Я доктор, %s. Я могу лечить", this.getName());
    }
}
