package com.jocile.example.linkedlist;

public class NodeG<T> {
  private T content;
  private NodeG<T> nextNode = null;

  public NodeG(T content) {
    this.content = content;
  }

  public NodeG(T content, NodeG<T> nextNode) {
    this.content = content;
    this.nextNode = nextNode;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public NodeG<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(NodeG<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "No{" + content + '}';
  }

  public String toStringLinked() {
    String str = "No{" + content + "}";

    if (nextNode != null) {
      str += "->" + nextNode.toString();
    } else {
      str += "->null";
    }
    return str;
  }
}
