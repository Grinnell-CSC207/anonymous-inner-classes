package taojava.aic;
import java.io.PrintWriter;
/**
 * Explicit references to the location of various fields.
 */
public class SampleGreetable6 implements Greetable {
    int i = 0;

    @Override
    public Greeter greeter() {
        return new Greeter() {
            int num = ++SampleGreetable6.this.i;
            @Override
            public void greet(PrintWriter pen) {
                pen.println(this.num + " of " + SampleGreetable6.this.i);
            } // greet(PrintWriter)
        }; // new Greeter
    } // greeter()
} // interface SampleGreetable6
