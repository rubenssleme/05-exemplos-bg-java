package projetosdeteste;

public class Tabuada {
	public void tabuada(){
		int x = 2, t = 0;
		for(int i = 1; i<11; i++){	
			t = x * i ;
		System.out.println("valor é "+ x + "X"+ i + "=" + t);}
	}
	public static void main(String[] args) {
	Tabuada t = new Tabuada();
	t.tabuada();
	}

}
