package professions;

/**
 * Проффесия Строитель.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Builder extends Engineer {

    /**
     * Конструктор класса Строитель.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Builder(String name, String surname, String education, long birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Осуществляет действие - строить здания.
     *
     * @return Строка-действие.
     */
    public String build() {
        return String.format("%s здания и строить их.", super.build());
    }
}