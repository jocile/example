package com.jocile.example.linkedlist;

/**
 * FIFO queue example, first in first out
 */
public class QueueExample {
  private NodeObject firstRefNode;

  public QueueExample() {
    this.firstRefNode = null;
  }

  public void enqueue(Object object) {
    NodeObject newNode = new NodeObject(object);
    newNode.setRefNode(firstRefNode);
    firstRefNode = newNode;
  }

  public Object first() {
    if (!this.isEmpty()) {
      NodeObject firstNode = firstRefNode;
      while (true) {
        if (firstNode.getRefNode() != null) {
          firstNode = firstNode.getRefNode();
        } else {
          break;
        }
      }
      return firstNode.getObject();
    }
    return null;
  }

  public Object dequeue() {
    if (!this.isEmpty()) {
      NodeObject firstNode = firstRefNode;
      NodeObject nodeAuxiliary = firstRefNode;
      while (true) {
        if (firstNode.getRefNode() != null) {
          nodeAuxiliary = firstNode;
          firstNode = firstNode.getRefNode();
        } else {
          nodeAuxiliary.setRefNode(null);
          break;
        }
      }
      return firstNode.getObject();
    }
    return null;
  }

  public boolean isEmpty() {
    return firstRefNode == null ? true : false;
  }

  @Override
  public String toString() {
    String stringReturn = "";
    NodeObject nodeAuxiliary = firstRefNode;

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
    QueueExample myqueue = new QueueExample();

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
