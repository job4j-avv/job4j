package professions;

/**
 * Проффесия Зубной врач.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Dentist extends Doctor {
    /**
     * Конструктор класса Зубной врач.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Dentist(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - лечить зубы.
     *
     * @return Строка-действие.
     */
    public String heal() {
        return String.format("Я зубной врач, %s. Я могу лечить зубы", this.getName());
    }

    /**
     * Осуществляет действие - дергать зубы.
     *
     * @return Строка-действие.
     */
    public String removeTeeths() {
        return String.format("Если не могу лечить зубы - то дергаю их. Это проще :)\n Дергаю зубы с %s года", this.getBirthday() + 25);
    }
}
