package stack;

import static org.junit.Assert.*;

import java.util.Stack;
import org.junit.Test;

public class StackDemoTest {

  public Stack<String> stack(int n) {
    Stack<String> stackD = new Stack<>();
    for (int i = 0; i < n; i++) {
      stackD.push("string " + i);
    }

    return stackD;
  }

  @Test
  public void testPushStackDemo() {
    StackDemo stackDemo = new StackDemo();

    String result = stackDemo.pushStackDemo(stack(0));

    assertEquals("[A, B, C]", result);
  }

  @Test
  public void testPopStackDemo() {
    StackDemo stackDemo = new StackDemo();

    String result = stackDemo.popStackDemo(stack(3));
    String exp = "string 2/ string 1/ string 0/ ";

    assertEquals(exp, result);
  }
}
