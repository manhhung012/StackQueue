package queue;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import org.junit.Test;

public class ArrayDequeDemoTest {
  public ArrayDeque<String> arrayDeque = new ArrayDeque<>();

  @Test
  public void testAddArrayDequeDemo() {
    ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();
    String Exc = "[B, A, C, D]";
    String result = arrayDequeDemo.addArrayDequeDemo("A", "B", "C", "D");

    assertEquals(Exc, result);
  }

  @Test
  public void testElementArrayDequeDemo() {
    arrayDeque.add("A");
    arrayDeque.add("B");
    ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();

    String result = arrayDequeDemo.elementArrayDequeDemo(arrayDeque);

    assertEquals("A", result);

    arrayDeque.clear();

    String resultNull = arrayDequeDemo.elementArrayDequeDemo(arrayDeque);

    assertEquals("Ex null", resultNull);
  }

  @Test
  public void testPeekArrayDequeDemo() {
    arrayDeque.add("A");
    arrayDeque.add("B");
    arrayDeque.add("C");
    ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();

    String result = arrayDequeDemo.peekArrayDequeDemo(arrayDeque);

    assertEquals("AAC", result);

    arrayDeque.clear();

    String resultNull = arrayDequeDemo.peekArrayDequeDemo(arrayDeque);

    assertEquals(null, resultNull);
  }

  @Test
  public void testRemoveArrayDequeDemo() {
    arrayDeque.add("A");
    arrayDeque.add("B");
    arrayDeque.add("C");
    arrayDeque.add("D");
    arrayDeque.add("E");
    ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();

    String result = arrayDequeDemo.removeArrayDequeDemo(arrayDeque);

    assertEquals("ABE : 2", result);

    arrayDeque.clear();

    String resultNull = arrayDequeDemo.removeArrayDequeDemo(arrayDeque);

    assertEquals("Ex null", resultNull);
  }

  @Test
  public void testollArrayDequeDemo() {
    arrayDeque.add("A");
    arrayDeque.add("B");
    arrayDeque.add("C");
    arrayDeque.add("D");
    arrayDeque.add("E");
    ArrayDequeDemo arrayDequeDemo = new ArrayDequeDemo();

    String result = arrayDequeDemo.pollArrayDequeDemo(arrayDeque);

    assertEquals("ABE : 2", result);

    arrayDeque.clear();

    String resultNull = arrayDequeDemo.pollArrayDequeDemo(arrayDeque);

    assertEquals("null : 0", resultNull);
  }
}
