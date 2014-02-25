package taojava.aic;

import java.io.PrintWriter;

/**
 * A simple class with an extra method that creates an anonymous Greeter that
 * references a parameter.
 */
public class SampleGreetable5
    implements
      Greetable
{
  int i = 0;

  @Override
  public Greeter greeter()
  {
    return makeGreeter(++i);
  } // greeter()

  Greeter makeGreeter(final int n)
  {
    return new Greeter()
      {
        @Override
        public void greet(PrintWriter pen)
        {
          pen.println(n);
        } // greet(PrintWriter)
      }; // new Greeter
  } // makeGreeter
} // interface SampleGreetable5
