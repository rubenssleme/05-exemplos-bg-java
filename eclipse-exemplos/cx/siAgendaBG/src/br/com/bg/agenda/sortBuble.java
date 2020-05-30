package br.com.bg.agenda;
public class sortBuble {

	public static <T> void main(String[] args) {
		int[] lista = {4,5,3,1,2,50,100,9,8,7,10,15,13,12,11};
		int	aux;
		for (int i = 0; i < lista.length-1; i++)
		{
			for(int j = 0; j < lista.length-i-1; j++)
			{
				if(lista[j] > lista[j + 1])
				{
					aux = lista [j + 1];
					lista [j + 1]= lista [j];
					lista [j] = aux;
			    }
			}
		
		}
		for (int i = 0; i < lista.length; i++)
		{
		     System.out.printf("%d %s",lista[i],"");
		}

	}

}
