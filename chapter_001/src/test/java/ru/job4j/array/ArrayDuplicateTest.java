package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] mass = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] result = ad.remove(mass);
        String[] exp = {"Привет", "Мир", "Супер"};
        assertThat(result, Matchers.is(exp));
    }

    @Test
    public void whenMoreDuplicates() {
        String[] mass = {"Привет", "Мир", "Мир", "Привет", "Супер", "Колбаса", "Водка", "Селедка!", "Колбаса", "Водка", "Селедка!"};
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] result = ad.remove(mass);
        String[] exp = {"Привет", "Мир", "Водка", "Селедка!", "Супер", "Колбаса"};
        assertThat(result, Matchers.is(exp));
    }

    @Test
    public void whenNotRemovedDuplicates() {
        String[] mass = {"Привет", "Мир", "Супер"};
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] result = ad.remove(mass);
        String[] exp = {"Привет", "Мир", "Супер"};
        assertThat(result, Matchers.is(exp));
    }
}