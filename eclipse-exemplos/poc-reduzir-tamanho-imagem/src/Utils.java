
public class Utils {
//	public static void gerarCopiaImagem(File file) throws IOException {
//
//		String caminhoSaida = preparaCaminhoFileSaida(file);
//		if (isImagemJPG(file)) {
//			BufferedImage img = ImageIO.read(file);
//			System.out.println("Copiando imagem de :" + file.getPath() + "\n para: " + caminhoSaida);
//			ImageIO.write(img, "jpg", new File(caminhoSaida));
//
//		} else {
//
//			File outFile = new File(caminhoSaida);
//			if (!outFile.exists() && outFile.isDirectory())
//				outFile.mkdir();
//			System.out.println("Copiando arquivo: " + file.getAbsolutePath());
//			OutputStream ou = new FileOutputStream(outFile);
//			OutputStreamWriter osw = new OutputStreamWriter(ou);
//			BufferedWriter bw = new BufferedWriter(osw);
//
//			String texto = "";
//			BufferedReader reader = new BufferedReader(new FileReader(file));
//			String linha = reader.readLine();
//			while (linha != null) {
//				texto += linha;
//				linha = reader.readLine();
//			}
//			reader.close();
//			texto = texto.replaceAll("nomealeatorio", "");
//
//			bw.write(texto);
//			bw.close();
//
//		}
//
//	}
//
//	private static boolean isImagemJPG(File file) {
//		return file.getName().endsWith(".jpg");
//	}
//
//	private static String preparaCaminhoFileSaida(File file) throws IOException {
//		String path = file.getAbsolutePath();
//		path = path.replace(caminho, raizDiretorioCP.getCanonicalPath() + "\\");
//		return path;
//	}
//
//	private static void entraDiretorio(File[] files) throws FileNotFoundException, IOException {
//		for (File file : files) {
//			if (file.isDirectory() && !file.getAbsolutePath().equals(raizDiretorioCP.getAbsolutePath())) {
//				File[] listSubDiretorio = file.listFiles();
//				file = new File(preparaCaminhoFileSaida(file));
//				System.out.println("Criando diretorio " + file.getAbsolutePath());
//				file.mkdir();
//				entraDiretorio(listSubDiretorio);
//			} else if (file.isFile() && !file.getAbsolutePath().equals(raizDiretorioCP.getAbsolutePath())) {
//				gerarCopiaImagem(file);
//			}
//		}
//	}

}
