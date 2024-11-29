import dev.jeka.core.tool.JkDep;
import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.KBean;
import utils.PowerText;

@JkDep("com.github.lalyos:jfiglet:0.0.9")
@JkDep("com.google.guava:guava:33.3.1-jre")
class Script extends KBean {

    @JkDoc("Person to whom the greeting is intended")
    public String name = "World";

    public int count = 3;

    @JkDoc("Print greeting on console")
    public void hi() {
        String greetings = "Hi " + name + " !";
        System.out.println(greetings);
    }

    public void echo() {
        PowerText text = new PowerText(name);
        System.out.println(text.asciiart());
        System.out.println(text.repeat(count));
    }

}