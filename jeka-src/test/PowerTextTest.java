package test;

import dev.jeka.core.tool.JkDep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.PowerText;

@JkDep("org.junit.jupiter:junit-jupiter:5.11.3")
public class PowerTextTest {

    @Test
    void test() {
        Assertions.assertEquals("o o o ", new PowerText("o").repeat(3));
    }
}
