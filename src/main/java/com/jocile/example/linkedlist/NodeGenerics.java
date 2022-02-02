package com.jocile.example.linkedlist;

public class NodeGenerics<T> {
  private T object;
  private NodeGenerics<T> refNode;

  public NodeGenerics() {}

  public NodeGenerics(T object) {
    this.refNode = null;
    this.object = object;
  }

  public Object getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }

  public NodeGenerics<T> getRefNode() {
    return refNode;
  }

  public void setRefNode(NodeGenerics<T> refNode) {
    this.refNode = refNode;
  }

  @Override
  public String toString() {
    return "Node{" + " object='" + getObject() + "'" + "}";
  }
}
