package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version $Id$
 * @since 0.0.2
 */
public class CalculateTest {

    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Valery";
        String expect = "Echo, echo, echo : Valery";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}