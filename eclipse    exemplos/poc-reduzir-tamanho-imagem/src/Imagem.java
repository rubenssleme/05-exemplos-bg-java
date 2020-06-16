import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Imagem {

	private static File raizDiretorio;
	private static File raizDiretorioCP;
	static final String caminho = "C:\\Users\\f665152.CORPCAIXA\\Documents\\imagem\\";
	static final String caminho2 = "C:\\Users\\f665152.CORPCAIXA\\Documents\\imagem\\";
	static ImageService imageService = new ImageService();

	public static void main(String[] args) throws Exception {
        raizDiretorio = new File(caminho);
		//raizDiretorioCP = new File(caminho2);
		File[] files = raizDiretorio.listFiles();
		String nomeArquivoImagem = imageService.obterNomeImagemSemExtensao(caminho);
		imageService.atribuirOriginalNomeImagemSemExtensao(caminho);
		raizDiretorioCP = new File(caminho2 + nomeArquivoImagem + ".jpg" );
		
		System.out.println("iniciando!!");
		
	
		for (int i = 0; i < files.length; i++) {
			BufferedImage jpgImage = imageService.obterJpgImagemDoArquivo(files[i]);
			System.out.println(i);
			jpgImage = imageService.cropSquareImagem(jpgImage);
			jpgImage = imageService.resizeImagem(jpgImage, 1000);
			ImageIO.write(jpgImage, "jpg", raizDiretorioCP);
		}
		System.out.println("finalizado!!");

	}
}
