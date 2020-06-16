import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import org.apache.commons.io.FilenameUtils;
import org.imgscalr.Scalr;

public class ImageService {

	public BufferedImage obterJpgImagemDoArquivo(File uploadedFile) throws Exception {
		String ext = FilenameUtils.getExtension(uploadedFile.getName());
		if (!"bmp".equals(ext) && !"jpg".equals(ext)) {
			throw new Exception("Somente imagens BMP e JPG são permitidas");
		}

		try {
			BufferedImage img = ImageIO.read(uploadedFile);
			if ("bmp".equals(ext)) {
				img = converterBmpParaJpg(img);
			}
			return img;
		} catch (IOException e) {
			throw new Exception("Erro ao ler arquivo");
		}
	}

//	transforma arquivo png em jpg
	public BufferedImage converterBmpParaJpg(BufferedImage img) {
		BufferedImage jpgImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
		jpgImage.createGraphics().drawImage(img, 0, 0, Color.WHITE, null);
		return jpgImage;
	}

	public InputStream obterInputStream(BufferedImage img, String extension) throws Exception {
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(img, extension, os);
			return new ByteArrayInputStream(os.toByteArray());
		} catch (IOException e) {
			throw new Exception("Erro ao ler arquivo");
		}
	}

	public BufferedImage cropSquareImagem(BufferedImage sourceImg) {
		int min = (sourceImg.getHeight() <= sourceImg.getWidth()) ? sourceImg.getHeight() : sourceImg.getWidth();
		System.out.println("cropSquare image!");
		return Scalr.crop(sourceImg, (sourceImg.getWidth() / 2) - (min / 2), (sourceImg.getHeight() / 2) - (min / 2),
				min, min);
	}

	public BufferedImage resizeImagem(BufferedImage sourceImg, int size) {
		System.out.println("resize image!");
		return Scalr.resize(sourceImg, Scalr.Method.ULTRA_QUALITY, size);
	}
	
	public String obterNomeImagemSemExtensao(String path) throws IOException {
		String retorno = "";
		Path configFilePath = FileSystems.getDefault().getPath(path);
		List<Path> fileWithName = Files.walk(configFilePath)
		                .filter(s -> s.toString().endsWith(".bmp"))
		                .map(Path::getFileName)
		                .sorted()
		                .collect(Collectors.toList());

		for (Path name : fileWithName) {
		    // printing the name of file in every sub folder
			String sName;
			sName = name.toString();
			int p=sName.toString().lastIndexOf('.'); 
			if (p>0) sName=sName.substring(0,p);
		    System.out.println(sName);
		  retorno = sName.toString();
		}
		return retorno;
	
}
	public String atribuirOriginalNomeImagemSemExtensao(String path) throws IOException {
		String retorno = "";
		Path configFilePath = FileSystems.getDefault().getPath(path);
		List<Path> fileWithName = Files.walk(configFilePath)
		                .filter(s -> s.toString().endsWith(".bmp"))
		                .map(Path::getFileName)
		                .sorted()
		                .collect(Collectors.toList());

		for (Path name : fileWithName) {
		    // printing the name of file in every sub folder
			String sName;
			sName = name.toString();
			int p=sName.toString().lastIndexOf('.'); 
			if (p>0) sName=sName.substring(0,p);
		    System.out.println(sName + "_ORIGINAL.bmp");
		  retorno = sName.toString()+ "_ORIGINAL.bmp";
		}
		return retorno;
	
}
	public String obterNomeImagemComExtensao(String path) throws IOException {
		String retorno = "";
		Path configFilePath = FileSystems.getDefault().getPath(path);
		List<Path> fileWithName = Files.walk(configFilePath)
		                .filter(s -> s.toString().endsWith(".bmp"))
		                .map(Path::getFileName)
		                .sorted()
		                .collect(Collectors.toList());

		for (Path name : fileWithName) {
		  System.out.println(name);
		  retorno = name.toString();
		}
		return retorno;

	
	
	
}	
	public String tratarCaminhoImagem() throws IOException {
		Path configFilePath = FileSystems.getDefault().getPath("C:\\Users\\f665152.CORPCAIXA\\Documents\\imagem\\");
		List<Path> fileWithName = Files.walk(configFilePath)
		                .filter(s -> s.toString().endsWith(".bmp"))
		                .map(Path::getFileName)
		                .sorted()
		                .collect(Collectors.toList());

		for (Path name : fileWithName) {
		    // printing the name of file in every sub folder
		    System.out.println(name);
		}
		return null;
		
	}

}