package taojava.aic;

import java.io.PrintWriter;

/**
 * Java 7 doesn't yet have Predicates.
 */
public interface Predicate<T>
{
  /**
   * Check if the predicate holds on val.
   */
  public boolean test(T val);
} // interface Predicate<T>
