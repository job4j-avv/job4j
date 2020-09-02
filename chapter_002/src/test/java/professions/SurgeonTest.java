package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurgeonTest {

    @Test
    public void heal() {
        Surgeon surgeon = new Surgeon("Svetlana", "Ivanova", "MGU", 1970);
        assertEquals("Svetlana", surgeon.getName());
        assertEquals("Ivanova", surgeon.getSurname());
        assertEquals("MGU", surgeon.getEducation());
        assertEquals(1970, surgeon.getBirthday());
        assertEquals("Я хирург, Svetlana. Я могу проводить операции", surgeon.heal());
    }
}