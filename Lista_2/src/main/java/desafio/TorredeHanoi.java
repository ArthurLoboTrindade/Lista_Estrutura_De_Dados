package desafio;

public class TorredeHanoi {

    public static void main(String[] args) {
        
        int numeroDeDiscos = 4;

        System.out.println("Torre de Hanoi com " + numeroDeDiscos + " discos:");
        
        hanoi(numeroDeDiscos, 'A', 'C', 'B');
    }
    
    public static void hanoi(int n, char or, char dest, char aux) {
        if (n == 1) {
            System.out.println("Move disco 1 de " + or + " para " + dest);
            return;
        }
        hanoi(n - 1, or, aux, dest);
        System.out.println("Move disco " + n + " de " + or + " para " + dest);
        hanoi(n - 1, aux, dest, or);
    }
	
}
