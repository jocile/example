package com.jocile.example.linkedlist;

/**
 * Dynamically doubly linked list
 */
public class LinkedListDoublyExemple<T> {
  private NodeD<T> primeiroNo;
  private NodeD<T> ultimoNo;

  private int tamanhoLista = 0;

  public void add(T elemento) {
    NodeD<T> novoNo = new NodeD<T>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevio(ultimoNo);
    if (primeiroNo == null) {
      primeiroNo = novoNo;
    }
    if (ultimoNo != null) {
      ultimoNo.setNoProximo(novoNo);
    }
    ultimoNo = novoNo;
    tamanhoLista++;
  }

  public void add(int index, T elemento) {
    NodeD<T> noAuxiliar = getNo(index);
    NodeD<T> novoNo = new NodeD<>(elemento);
    novoNo.setNoProximo(noAuxiliar);

    if (novoNo.getNoProximo() != null) {
      novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
      novoNo.getNoProximo().setNoPrevio(novoNo);
    } else {
      novoNo.setNoPrevio(ultimoNo);
      ultimoNo = novoNo;
    }
    if (index == 0) {
      primeiroNo = novoNo;
    } else {
      novoNo.getNoPrevio().setNoProximo(novoNo);
    }
    tamanhoLista++;
  }

  public void remove(int index) {
    if (index == 0) {
      primeiroNo = primeiroNo.getNoProximo();
      if (primeiroNo != null) {
        primeiroNo.setNoPrevio(null);
      }
    } else {
      NodeD<T> noAuxiliar = getNo(index);
      noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
      if (noAuxiliar != ultimoNo) {
        noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
      } else {
        ultimoNo = noAuxiliar;
      }
    }
    tamanhoLista--;
  }

  public T get(int index) {
    return getNo(index).getConteudo();
  }

  private NodeD<T> getNo(int index) {
    NodeD<T> noAuxiliar = primeiroNo;
    for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
  }

  public int size() {
    return tamanhoLista;
  }

  @Override
  public String toString() {
    String strRetorno = "";
    NodeD<T> noAuxiliar = primeiroNo;
    for (int i = 0; i < size(); i++) {
      strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
      noAuxiliar = noAuxiliar.getNoProximo();
    }
    strRetorno += "null";
    return strRetorno;
  }

  public static void main(String args[]) {
    LinkedListDoublyExemple<String> minhaListaEncadeada = new LinkedListDoublyExemple<>();

    minhaListaEncadeada.add("c1");
    minhaListaEncadeada.add("c2");
    minhaListaEncadeada.add("c3");
    minhaListaEncadeada.add("c4");
    minhaListaEncadeada.add("c5");
    minhaListaEncadeada.add("c6");
    minhaListaEncadeada.add("c7");

    System.out.println(minhaListaEncadeada);

    minhaListaEncadeada.remove(3);
    minhaListaEncadeada.add(3, "99");

    System.out.println(minhaListaEncadeada);
    System.out.println(minhaListaEncadeada.get(3));
  }
}
