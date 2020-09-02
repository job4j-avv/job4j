package strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    // получаем ссылку на стандартный вывод в консоль.
    private final PrintStream stdout = System.out;
    // Создаем буфур для хранения вывода.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void beforeTesr() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void afterTesr() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("   *********   \n")
                        .append("   *       *   \n")
                        .append("   *       *   \n")
                        .append("   *       *   \n")
                        .append("   *********   \n")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void drawSquare() {
        Shape square = new Square();
        assertThat(square.draw(),
                is(new StringBuilder()
                        .append("   *********   \n")
                        .append("   *       *   \n")
                        .append("   *       *   \n")
                        .append("   *       *   \n")
                        .append("   *********   \n")
                        .toString()
                ));
    }

    @Test
    public void drawTriangle() {
        Shape triangle = new Triangle();
        assertThat(triangle.draw(),
                is(new StringBuilder()
                        .append("       *       \n")
                        .append("      * *      \n")
                        .append("     *   *     \n")
                        .append("    *     *    \n")
                        .append("   *********   \n")
                        .toString()
                ));
    }
}