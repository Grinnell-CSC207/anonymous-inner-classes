package taojava.aic;

import java.io.PrintWriter;

/**
 * Utilities for our anonymous inner class examples.
 */
public class GreeterUtils
{
  /**
   * Grab the greeter and run it multiple times.
   */
  public static void annoy(Greetable g, PrintWriter pen)
  {
    Greeter gree = g.greeter();
    for (int i = 0; i < 5; i++)
      {
        gree.greet(pen);
      } // for
  } // annoy

  /**
   * A simple experiment for a greetable.
   */
  public static void experiment(Greetable g)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    annoy(g, pen);
  } // experiment
} // class GreeterUtils
