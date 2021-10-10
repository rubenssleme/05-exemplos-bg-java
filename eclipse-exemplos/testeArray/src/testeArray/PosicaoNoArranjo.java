package testeArray;

public class PosicaoNoArranjo {


	public static void getValor() {

		int []a = {1,2,3,4,5};
		String valor = null;
		for(int d=0; d<=2 ; d++) {
			for(int i=0;i<=4;i++) {
				
				//if(i==0) {
				int v = a[i];
				System.out.println(  "Posição do valor é --> " + i + " --> e valor " + a[i] + " valor pego --> " + v );
				
				//}
			}
		System.out.println("\n");
		}

	}

	public static void main(String[] args) {

		getValor();

	}

}
