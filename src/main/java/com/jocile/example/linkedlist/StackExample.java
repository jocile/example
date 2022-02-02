package com.jocile.example.linkedlist;

/**
 * LIFO stack example, last in first out
 */
public class StackExample {
  private Node firstRefNode;

  public StackExample() {
    this.firstRefNode = null;
  }

  public void push(Node newNode) {
    Node refAuxiliary = firstRefNode;
    firstRefNode = newNode;
    firstRefNode.setRefNode(refAuxiliary);
  }

  public Node pop() {
    if (!this.isEmpty()) {
      Node nodePoped = firstRefNode;
      firstRefNode = firstRefNode.getRefNode();
      return nodePoped;
    }
    return null;
  }

  public Node top() {
    return firstRefNode;
  }

  public boolean isEmpty() {
    return firstRefNode == null ? true : false;
  }

  @Override
  public String toString() {
    String stringReturn = "--------------------------------\n";
    stringReturn += " Stack\n";
    stringReturn += "--------------------------------\n";

    Node nodeAuxiliary = firstRefNode;

    while (true) {
      if (nodeAuxiliary != null) {
        stringReturn += "[Node{date=" + nodeAuxiliary.getDate() + "}]\n";
        nodeAuxiliary = nodeAuxiliary.getRefNode();
      } else {
        break;
      }
    }
    stringReturn += "================================\n";
    return stringReturn;
  }

  public static void main(String[] args) {
    StackExample myStack = new StackExample();

    myStack.push(new Node(1));
    myStack.push(new Node(2));
    myStack.push(new Node(3));
    myStack.push(new Node(4));
    myStack.push(new Node(5));
    myStack.push(new Node(6));

    System.out.println(myStack);
    System.out.println(myStack.pop());
    System.out.println(myStack);

    myStack.push(new Node(99));
    System.out.println(myStack);
  }
}
