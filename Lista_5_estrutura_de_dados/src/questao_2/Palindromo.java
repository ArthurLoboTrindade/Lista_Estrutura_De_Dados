package questao_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Palindromo {

	public static void main(String[] args) {
		Stack<Character> palindromoCheck = new Stack<Character>(), palindromoWriter = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o possível palindromo");
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			palindromoWriter.add(s.charAt(i));
		}
		
		Iterator<Character> it = palindromoWriter.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("");
		
		
		for (int j = s.length()-1; j >=0 ; j--) {
			palindromoCheck.add(s.charAt(j));
		}
		
		Iterator<Character> it2 = palindromoCheck.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		boolean eP = true;
		
		while(!palindromoCheck.isEmpty() && !palindromoWriter.isEmpty()) {
			if(!palindromoCheck.pop().equals(palindromoWriter.pop())) {
				eP = false;
				break;
			}
		}
		
		if(eP) {
			System.out.println("É um palindromo!");
		} else {
			System.out.println("Não é um palindromo!");
		}
		
		

	}

}
