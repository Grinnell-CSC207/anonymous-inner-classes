package taojava.aic;

import java.io.PrintWriter;

/**
 * A simple class that creates an anonymous greeter that references a field in
 * the enclosing class at the time is built and at the time it greets.
 */
public class SampleGreetable4
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
          pen.println(num + " of " + i);
        } // greet(PrintWriter)
      }; // new Greeter
  } // greeter()
} // interface SampleGreetable4
