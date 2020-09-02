package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTest {

    @Test
    public void write() {
        Programmer programmer = new Programmer("Vasia", "Pupkin", "Chptu", 1990);
        assertEquals("Vasia", programmer.getName());
        assertEquals("Pupkin", programmer.getSurname());
        assertEquals("Chptu", programmer.getEducation());
        assertEquals(1990, programmer.getBirthday());
        assertEquals("Я програмист, Vasia. Я могу писать говнокод (все равно никто не увидит)", programmer.write());
    }
}