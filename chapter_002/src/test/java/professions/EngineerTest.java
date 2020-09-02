package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class EngineerTest {

    @Test
    public void engineerCreate() {
        Engineer engineer = new Engineer("Kolja", "Ivanov", "PTU", 2000);
        assertSame("Kolja", engineer.getName());
        assertSame("Ivanov", engineer.getSurname());
        assertSame("PTU", engineer.getEducation());
        assertEquals(2000, engineer.getBirthday());
    }

    @Test
    public void engineerBuild() {
        Engineer engineer = new Engineer("Ivan", "Ivanov", "BGU", 1980);
        assertEquals("Я инженер, Ivan. Я могу разрабатывать", engineer.build());
    }
}