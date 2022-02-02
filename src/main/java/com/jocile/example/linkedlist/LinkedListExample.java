package com.jocile.example.linkedlist;

/**
 * Dynamically linked list
 */
public class LinkedListExample<T> {
  private NodeG<T> referenciaEntrada;

  public LinkedListExample() {
    this.referenciaEntrada = null;
  }

  public void add(T content) {
    NodeG<T> novoNo = new NodeG<T>(content);
    if (this.isEmpty()) {
      referenciaEntrada = novoNo;
      return;
    }
    NodeG<T> noAuxiliar = referenciaEntrada;
    for (int i = 0; i < size() - 1; i++) {
      noAuxiliar = noAuxiliar.getNextNode();
    }
    noAuxiliar.setNextNode(novoNo);
  }

  public T get(int index) {
    return getNo(index).getContent();
  }

  private NodeG<T> getNo(int index) {
    validaIndice(index);
    NodeG<T> noAuxiliar = referenciaEntrada;
    NodeG<T> noRetorno = null;
    for (int i = 0; i <= index; i++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getNextNode();
    }
    return noRetorno;
  }

  public T remove(int index) {
    validaIndice(index);
    NodeG<T> noPivor = getNo(index);
    if (index == 0) {
      referenciaEntrada = noPivor.getNextNode();
      return noPivor.getContent();
    }
    NodeG<T> noAnterior = getNo(index - 1);
    noAnterior.setNextNode(noPivor.getNextNode());
    return noPivor.getContent();
  }

  public int size() {
    int tamanhoLista = 0;
    NodeG<T> referenciaAux = referenciaEntrada;
    while (true) {
      if (referenciaAux != null) {
        tamanhoLista++;
        if (referenciaAux.getNextNode() != null) {
          referenciaAux = referenciaAux.getNextNode();
        } else {
          break;
        }
      } else {
        break;
      }
    }
    return tamanhoLista;
  }

  private void validaIndice(int index) {
    if (index >= size()) {
      int ultimoIndice = size() - 1;
      throw new IndexOutOfBoundsException(
        "Não existe conteúdo no índice " +
        index +
        " desta lista. Esta lista só vai até o índice " +
        ultimoIndice +
        '.'
      );
    }
  }

  public boolean isEmpty() {
    return referenciaEntrada == null ? true : false;
  }

  public NodeG<T> getReferenciaEntrada() {
    return referenciaEntrada;
  }

  public void setReferenciaEntrada(NodeG<T> referenciaEntrada) {
    this.referenciaEntrada = referenciaEntrada;
  }

  @Override
  public String toString() {
    String strRetorno = "";
    NodeG<T> noAuxiliar = referenciaEntrada;
    for (int i = 0; i < size(); i++) {
      strRetorno += "[No{conteudo=" + noAuxiliar.getContent() + "}]--->";
      noAuxiliar = noAuxiliar.getNextNode();
    }
    strRetorno += "null";
    return strRetorno;
  }

  public static void main(String args[]) {
    LinkedListExample<String> minhaListaEncadeada = new LinkedListExample<>();

    minhaListaEncadeada.add("teste1");
    minhaListaEncadeada.add("teste2");
    minhaListaEncadeada.add("teste3");
    minhaListaEncadeada.add("teste4");

    System.out.println(minhaListaEncadeada.get(0));
    System.out.println(minhaListaEncadeada.get(1));
    System.out.println(minhaListaEncadeada.get(2));
    System.out.println(minhaListaEncadeada.get(3));

    System.out.println(minhaListaEncadeada);

    minhaListaEncadeada.remove(3);

    System.out.println(minhaListaEncadeada);
  }
}
