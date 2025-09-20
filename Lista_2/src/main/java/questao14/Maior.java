package questao14;

public class Maior {

	public static void main(String[] args) {
		
		int[] i = {1,2,3,4};
		
		System.out.println(maior(i, 0));
	}
	
	public static int maior(int[] i, int o) {
		
		if (o == i.length - 1) {
            return i[o];
        }

        int maiorDoResto = maior(i, (o+1));

        return Math.max(i[o], maiorDoResto);
	}
	
}
