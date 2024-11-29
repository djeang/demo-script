import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.KBean;

public class Script2 extends KBean {

    @JkDoc("Print Info on the current JDK")
    public void jdk() {
        System.out.printf("You're running on JDK %s %s%n", System.getProperty("java.version"),
                System.getProperty("java.vendor"));
    }

}
