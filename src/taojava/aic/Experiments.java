package taojava.aic;

import java.io.PrintWriter;

/**
 * Experiments for our anonymous inner class examples.
 */
public class Experiments
{

  // +---------------+---------------------------------------------------
  // | Local Helpers |
  // +---------------+

  /**
   * Grab a few greeters and ask them to greet us.
   */
  static void annoy(Greetable g, PrintWriter pen)
  {
    Greeter[] greeters =
        new Greeter[] { g.greeter(), g.greeter(), g.greeter(), g.greeter(),
                       g.greeter() };

    for (int i = 0; i < greeters.length; i++)
      {
        pen.print(i + ": ");
        greeters[i].greet(pen);
      } // for
  } // annoy

  /**
   * A simple experiment for a greetable.
   */
  static void experiment(Greetable g)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    annoy(g, pen);
  } // experiment

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Main!
   */
  public static void main(String[] args)
  {
    experiment(new SampleGreetable1());
    experiment(new SampleGreetable2());
    experiment(new SampleGreetable3());
    experiment(new SampleGreetable4());
    experiment(new SampleGreetable5());
  } // main(String[])
} // class Experiments
