package com.jocile.example.linkedlist;

/**
 * Doubly linked node
 */
public class NodeD<T> {
  private T conteudo;
  private NodeD<T> noProximo;
  private NodeD<T> noPrevio;

  public NodeD(T conteudo) {
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public NodeD<T> getNoProximo() {
    return noProximo;
  }

  public void setNoProximo(NodeD<T> noProximo) {
    this.noProximo = noProximo;
  }

  public NodeD<T> getNoPrevio() {
    return noPrevio;
  }

  public void setNoPrevio(NodeD<T> noPrevio) {
    this.noPrevio = noPrevio;
  }

  @Override
  public String toString() {
    return "NodeD{" + "conteudo=" + conteudo + '}';
  }
}
