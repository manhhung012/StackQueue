package queue;

import java.util.List;
import java.util.PriorityQueue;
import model.User;

public class PriorityQueueDemo {
  public String pollPriorityQueue(List<String> listStringDemo) {
    String string = "";
    PriorityQueue<String> queue = new PriorityQueue<>();

    for (int i = 0; i < listStringDemo.size(); i++) {
      queue.add(listStringDemo.get(i));
    }

    int n = queue.size();

    for (int i = 0; i < n; i++) {
      string += queue.poll();
    }
    return string;
  }

  public String pollUserPriorityQueue(List<User> listUserDemo) {
    String string = "";
    PriorityQueue<User> queue = new PriorityQueue<>();

    for (int i = 0; i < listUserDemo.size(); i++) {
      queue.add(listUserDemo.get(i));
    }

    int n = queue.size();

    for (int i = 0; i < n; i++) {
      string += queue.poll().getName() + " / ";
    }

    return string;
  }
}
