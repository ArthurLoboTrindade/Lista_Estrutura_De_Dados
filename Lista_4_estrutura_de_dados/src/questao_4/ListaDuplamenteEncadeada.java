package questao_4;

public class ListaDuplamenteEncadeada<T> {

    private No<T> primeiro = null, ultimo = null;
    private int n = 0;

    public void inserirListaEsquerda(T valor) {
        if(n==15) {
        	System.out.println("Lista cheia! 15 itens!");
        	return;
        }
    	No<T> aux = new No<>();
        aux.setValor(valor);
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else if(n<=15) {
            aux.setProximo(primeiro);
            primeiro.setAnterior(aux);
            primeiro = aux;
        }
        n++;
    }

    public void inserirListaDireita(T valor) {
    	if(n==15) {
        	System.out.println("Lista cheia! 15 itens!");
        	return;
        }
    	No<T> aux = new No<>();
        aux.setValor(valor);
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
        } else if(n<=15){
            ultimo.setProximo(aux);
            aux.setAnterior(ultimo);
            ultimo = aux;
        }
        n++;
    }

    public T removerListaEsquerda() {
        if (n == 0) {
            return null;
        }
        T dado = primeiro.getValor();
        n--;
        if (n == 0) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return dado;
    }

    public T removerListaDireita() {
        if (n == 0) {
            return null;
        }
        T dado = ultimo.getValor();
        n--;
        if (n == 0) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return dado;
    }

    public T consultarEsq() {
        if (primeiro != null) {
            return primeiro.getValor();
        } else {
            return null;
        }
    }

    public T consultarDir() {
        if (ultimo != null) {
            return ultimo.getValor();
        } else {
            return null;
        }
    }

    public int tamanho() {
        return n;
    }

    public void imprimir() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
