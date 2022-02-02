package com.jocile.example.linkedlist;

public class Node {
  private int date;
  private Node refNode = null;

  public Node(int date) {
    this.date = date;
  }

  public int getDate() {
    return this.date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public Node getRefNode() {
    return this.refNode;
  }

  public void setRefNode(Node refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "Node{" + " date='" + getDate() + "'" + "}";
  }
}
