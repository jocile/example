package com.jocile.example.linkedlist;

/**
 * FIFO queue example, first in first out
 */
public class QueueGenericExample<T> {
  private NodeGenerics<T> firstRefNode;

  public QueueGenericExample() {
    this.firstRefNode = null;
  }

  public void enqueue(T object) {
    NodeGenerics<T> newNode = new NodeGenerics<T>(object);
    newNode.setRefNode(firstRefNode);
    firstRefNode = newNode;
  }

  public T first() {
    if (!this.isEmpty()) {
      NodeGenerics<T> firstNode = firstRefNode;
      while (true) {
        if (firstNode.getRefNode() != null) {
          firstNode = firstNode.getRefNode();
        } else {
          break;
        }
      }
      return (T) firstNode.getObject();
    }
    return null;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      NodeGenerics<T> firstNode = firstRefNode;
      NodeGenerics<T> nodeAuxiliary = firstRefNode;
      while (true) {
        if (firstNode.getRefNode() != null) {
          nodeAuxiliary = firstNode;
          firstNode = firstNode.getRefNode();
        } else {
          nodeAuxiliary.setRefNode(null);
          break;
        }
      }
      return (T) firstNode.getObject();
    }
    return null;
  }

  public boolean isEmpty() {
    return firstRefNode == null ? true : false;
  }

  @Override
  public String toString() {
    String stringReturn = "";
    NodeGenerics<T> nodeAuxiliary = firstRefNode;

    if (firstRefNode != null) {
      while (true) {
        stringReturn += "[Node{object: " + nodeAuxiliary.getObject() + "}]--->";

        if (nodeAuxiliary.getRefNode() != null) {
          nodeAuxiliary = nodeAuxiliary.getRefNode();
        } else {
          stringReturn += "null";
          break;
        }
      }
    } else {
      stringReturn = "null";
    }

    return stringReturn;
  }

  public static void main(String[] args) {
    QueueGenericExample<String> myqueue = new QueueGenericExample<>();

    myqueue.enqueue("first");
    myqueue.enqueue("second");
    myqueue.enqueue("third");
    myqueue.enqueue("fourth");

    System.out.println(myqueue);
    System.out.println(myqueue.dequeue());
    System.out.println(myqueue);
    myqueue.enqueue("last");
    System.out.println(myqueue);
    System.out.println(myqueue.first());
    System.out.println(myqueue);
  }
}
