import java.util.ArrayList;

public class SkillDemo {
  public static Integer enumerate(Integer counter) {
    return counter + 1;
  }

  public static Integer getNumberFromList(ArrayList<Integer> listOfNums, Integer index) {
    return listOfNums.get(index);
  }

}

// javac -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" SkillDemo.java
// SkillDemoTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar"
// org.junit.runner.JUnitCore SkillDemoTest
