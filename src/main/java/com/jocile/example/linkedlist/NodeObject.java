package com.jocile.example.linkedlist;

public class NodeObject {
  private Object object;
  private NodeObject refNode;

  public NodeObject() {}

  public NodeObject(Object object) {
    this.object = object;
  }

  public Object getObject() {
    return this.object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public NodeObject getRefNode() {
    return this.refNode;
  }

  public void setRefNode(NodeObject refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "{" + " object='" + getObject() + "'" + "}";
  }
}
