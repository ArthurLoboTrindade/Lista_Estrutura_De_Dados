package questao_3;

import questao_4.No;

public class ListaDuplamenteEncadeada<T> {

    private No<T> primeiro = null, ultimo = null;
    private int n = 0;

    public void inserirListaEsquerda(T valor) {
    	if(n==7) {
        	System.out.println("Lista cheia! 7 itens!");
        	return;
        }
    	No<T> aux = new No<>();
        aux.setValor(valor);
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro = aux;
        }
        n++;
    }

    public void inserirListaDireita(T valor) {
    	if(n==7) {
        	System.out.println("Lista cheia! 7 itens!");
        	return;
        }
    	No<T> aux = new No<>();
        aux.setValor(valor);
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else {
            ultimo.setProximo(aux);
            aux.setAnterior(ultimo);
            ultimo = aux;
        }
        n++;
    }

    public void imprimir() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getValor().toString());
            atual = atual.getProximo();
        }
        System.out.println();
    }

    
}
