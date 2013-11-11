package taojava.aic;
import java.io.PrintWriter;
/**
 * A very simple class that creates a Greeter.
 */
public class SampleGreetable1 implements Greetable {
    @Override
    public Greeter greeter() {
        return new SampleGreeter();
    } // greeter
} // interface SampleGreetable1
