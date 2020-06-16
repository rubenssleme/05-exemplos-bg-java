
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mamifero {

	private String nome;
	private String habitat;
	private int altura;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}




	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}




	// Metodos

	public void somAnimail(String caminhoArquivo){
		try {
			FileInputStream fis;
			Player player;
			fis = new FileInputStream(caminhoArquivo);
			BufferedInputStream bis = new BufferedInputStream(fis);
			player = new Player(bis);
			player.play();         
		} catch (JavaLayerException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}



	public int alimenta(int comida){

		int estomago = 0;

		estomago = estomago + comida;

		return estomago;

	}




}
