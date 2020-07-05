package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hil");
        assertThat(result, is(false));
    }

    @Test
    public void whenPrefixIsBig() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hellooo");
        assertThat(result, is(false));
    }

    @Test
    public void whenPrefixIsSmall() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "H");
        assertThat(result, is(true));
    }
}