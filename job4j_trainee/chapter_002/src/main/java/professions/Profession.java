package professions;

/**
 * Базовый класс Профессия.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private long birthday;

    /**
     * Конструктор класса.
     *
     * @param name      Имя.
     * @param surname   Фамилия.
     * @param education Образование.
     * @param birthday  Время рождения.
     */
    public Profession(String name, String surname, String education, long birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    /**
     * Возвращает имя.
     *
     * @return Строка - имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Возвращает фамилию
     *
     * @return Строка - фамилия.
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Возвращает образование
     *
     * @return Строка - образование.
     */
    public String getEducation() {
        return this.education;
    }

    /**
     * Возвращает дату рождения
     *
     * @return Число - дата рождения.
     */
    public long getBirthday() {
        return this.birthday;
    }
}
