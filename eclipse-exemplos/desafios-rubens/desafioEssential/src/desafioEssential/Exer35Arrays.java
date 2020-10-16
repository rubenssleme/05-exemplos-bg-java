package desafioEssential;

import java.util.Arrays;
import java.util.List;

public class Exer35Arrays {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Oracle","JSF","EJB");
		long count  =  courses.stream().filter(s-> s.startsWith("J")).count();
		System.out.println(count);
	}

}
