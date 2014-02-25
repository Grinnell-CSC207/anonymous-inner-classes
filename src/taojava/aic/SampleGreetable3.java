package taojava.aic;

import java.io.PrintWriter;

/**
 * A simple class that creates an anonymous greeter and references an internal
 * field of the enclosing class during creation.
 */
public class SampleGreetable3
    implements
      Greetable
{
  int i = 0;

  @Override
  public Greeter greeter()
  {
    return new Greeter()
      {
        int num = ++i;

        @Override
        public void greet(PrintWriter pen)
        {
          pen.println("Number " + num);
        } // greet(PrintWriter)
      }; // new Greeter
  } // greeter()
} // interface SampleGreetable3
