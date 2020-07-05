package professions;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void build() {
        Builder builder = new Builder("Vasia", "Pupkin", "Chptu", 1991);
        assertEquals("Vasia", builder.getName());
        assertEquals("Pupkin", builder.getSurname());
        assertEquals("Chptu", builder.getEducation());
        assertEquals(1991, builder.getBirthday());
        assertEquals("Я инженер, Vasia. Я могу разрабатывать здания и строить их.",
                builder.build());
    }
}