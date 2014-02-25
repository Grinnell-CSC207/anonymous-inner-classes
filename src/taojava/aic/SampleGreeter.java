package taojava.aic;

import java.io.PrintWriter;

/**
 * A very simple example of a greeter.
 */
public class SampleGreeter
    implements
      Greeter
{
  public void greet(PrintWriter pen)
  {
    pen.println("Hello world.");
  } // greet
} // class SampleGreeter
