package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class DentistTest {

    @Test
    public void heal() {
        Dentist dentist = new Dentist("Svetlana", "Ivanova", "MGU", 1980);
        assertEquals("Svetlana", dentist.getName());
        assertEquals("Ivanova", dentist.getSurname());
        assertEquals("MGU", dentist.getEducation());
        assertEquals(1980, dentist.getBirthday());
        assertEquals("Я зубной врач, Svetlana. Я могу лечить зубы", dentist.heal());
    }

    @Test
    public void removeTeeths() {
        Dentist dentist = new Dentist("Svetlana", "Ivanova", "MGU", 1980);
        assertEquals("Если не могу лечить зубы - то дергаю их. Это проще :)\n Дергаю зубы с 2005 года", dentist.removeTeeths());
    }
}