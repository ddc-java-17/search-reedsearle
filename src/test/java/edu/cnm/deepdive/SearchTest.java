package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SearchTest {

  private final static int HAYSTACK_SIZE = 10_000_000;
  private static final int NUM_NEEDLES = 1_000;
  private static int[] unsortedHaystack;
  private static int[] sortedHaystack;
  private static int[] needles;


@BeforeAll
static void setupHaystack() {
  RandomGenerator rng = RandomGenerator.getDefault();

  unsortedHaystack = IntStream.generate(rng::nextInt)
      .limit(HAYSTACK_SIZE)
      .toArray();
  sortedHaystack = IntStream.of(unsortedHaystack)
      .sorted()
      .toArray();
  needles = IntStream.generate(rng::nextInt)
      .limit(NUM_NEEDLES)
      .toArray();
}


  @Test
  void linearSearch() {
  }

  @Test
  void binarySearch() {
  }
}