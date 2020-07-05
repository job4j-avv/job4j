package professions;

/**
 * Проффесия Хирург.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Surgeon extends Doctor {

    /**
     * Конструктор класса Хирург.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Surgeon(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - проводить операции.
     *
     * @return Строка-действие.
     */
    public String heal() {
        return String.format("Я хирург, %s. Я могу проводить операции", this.getName());
    }
}