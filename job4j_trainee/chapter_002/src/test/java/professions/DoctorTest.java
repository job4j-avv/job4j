package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoctorTest {

    @Test
    public void doctorCreate() {
        Doctor doctor = new Doctor("Svetlana", "Ivanova", "MGU", 1980);
        assertEquals("Svetlana", doctor.getName());
        assertEquals("Ivanova", doctor.getSurname());
        assertEquals("MGU", doctor.getEducation());
        assertEquals(1980, doctor.getBirthday());
    }

    @Test
    public void doctorHeal() {
        Doctor doctor = new Doctor("Svetlana", "Ivanova", "MGU", 1980);
        assertEquals("Я доктор, Svetlana. Я могу лечить", doctor.heal());
    }
}