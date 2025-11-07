package questao_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pilha<String> paginas = new Pilha<>();
		paginas.inicializarPilha();
		
		boolean f = true;
		while(f){
			System.out.println("Insira aqui o html da sua pagina: ");
			String html = sc.nextLine();
			System.out.println("Mais alguma pagina? SIM/NAO");
			char op = sc.nextLine().charAt(0);
			paginas.push(html);
			if(op=='n') {
				f=false;	
			}
		}
		
		Pilha<String> paginaTemp = new Pilha<>();
		paginaTemp.inicializarPilha();
		paginaTemp = paginas;
		
		while (!paginaTemp.isVazio()) {
			System.out.println(paginaTemp.pop());
		}
		
		sc.close();
	}

}
