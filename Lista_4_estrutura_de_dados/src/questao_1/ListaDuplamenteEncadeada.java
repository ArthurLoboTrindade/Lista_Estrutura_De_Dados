package questao_1;

public class ListaDuplamenteEncadeada<T> {

    private No<T> primeiro = null, ultimo = null;
    private int n = 0;

    public void inserirListaEsquerda(T valor) {
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

    
}
