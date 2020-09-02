package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    /**
     * Проверяет. что слово начинается с префикса.
     * Префикс может быть длиннее - тогда вернет false/
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;

        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        int i = 0;
        if (pref.length > wrd.length) {
            return false;
        }
        while (i < pref.length) {
            if (pref[i] != wrd[i]) {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
