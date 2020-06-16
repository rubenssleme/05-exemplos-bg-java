
public enum CartasEnum {

	J(11),Q(12),K(13),A(14); 
	
	
	public  int valorCarta;

	CartasEnum(int valor){
		this.valorCarta = valor;
	}

	

	public static void main(String[] args) {
	CartasEnum a = CartasEnum.A;
	CartasEnum j = CartasEnum.J;
	CartasEnum a2 = CartasEnum.A;
	
		System.out.println(CartasEnum.A);	
	System.out.println(CartasEnum.A.valorCarta);	
	}


}






