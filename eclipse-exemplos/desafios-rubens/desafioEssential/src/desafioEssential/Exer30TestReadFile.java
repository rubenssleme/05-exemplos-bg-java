package desafioEssential;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exer30TestReadFile {
	
	public void readFile(String fname)throws IOException{
		
	Path p = Paths.get(fname);
		
		Stream<String> content  = Files.lines(p);
		content.forEach(sl -> System.out.println(sl));
	}

	public static void main(String[] args) {
		Exer30TestReadFile trf = new Exer30TestReadFile();
		trf.readFile(fname);

	}

}
