package com.jocile.example.colletions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This is an example of a queue list where
 *  the first element to enter is the first to exit,
 *  but do not allow for a change of order
 */
public class QueueExample {

  public static void main(String[] args) {
    Queue<String> bankQueue = new LinkedList<>();

    bankQueue.add("Patrícia");
    bankQueue.add("Roberto");
    bankQueue.add("Flávio");
    bankQueue.add("Pamela");
    bankQueue.add("Anderson");

    printQueue(bankQueue);
    System.out.println("The pool retrieve and remove the head of the queue:");
    System.out.println(bankQueue.poll());

    printQueue(bankQueue);
    System.out.println(
      "The peek retrieve but does not remove the head of the queue:"
    );
    System.out.println(bankQueue.peek());
    printQueue(bankQueue);

    System.out.println(
      "The element retrieve but does not remove the head of the queue, " +
      "and throws noSuchElementException if this queue is empty:"
    );
    //bankQueue.clear();
    System.out.println(bankQueue.element());
    printQueue(bankQueue);

    System.out.println("Scrolling through the list:");
    for (String itemNames : bankQueue) {
      System.out.println(itemNames);
    }

    System.out.println("Using iterator:");
    Iterator<String> iterator = bankQueue.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  private static void printQueue(Queue<String> bankQueue) {
    System.out.println("-----------------------------------------------");
    System.out.println("The bank queue:");
    System.out.println(bankQueue);
  }
}
