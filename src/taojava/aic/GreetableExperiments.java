package taojava.aic;

import java.io.PrintWriter;

/**
 * Experiments for our anonymous inner class examples.
 */
public class GreetableExperiments
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
        for (int j = 0; j < 3; j++)
          {
            pen.print(i + "/" + j + ": ");
            greeters[i].greet(pen);
          } // for j
      } // for i
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
  } // main(String[])
} // class GreetableExperiments
