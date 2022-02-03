import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class SkillDemoTest {
  @Test
  public void enumerateTest() {
    Integer counter = 10;
    assertEquals(11, (int) SkillDemo.enumerate(counter));
  }

  @Test
  public void getValue() throws IOException {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    assertEquals(5, (int) SkillDemo.getNumberFromList(numbers, 4));
  }

}

// in server use
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoTest.java
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemo.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar
// org.junit.runner.JUnitCore SkillDemoTest
