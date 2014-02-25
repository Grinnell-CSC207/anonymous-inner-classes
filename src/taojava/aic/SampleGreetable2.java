package taojava.aic;

import java.io.PrintWriter;

/**
 * A simple class that builds an anonymous greeter.
 */
public class SampleGreetable2
    implements
      Greetable
{
  @Override
  public Greeter greeter()
  {
    return new Greeter()
      {
        @Override
        public void greet(PrintWriter pen)
        {
          pen.println("Hi");
        } // greet(PrintWriter)
      }; // new Greeter
  } // greeter()
} // interface SampleGreetable2
