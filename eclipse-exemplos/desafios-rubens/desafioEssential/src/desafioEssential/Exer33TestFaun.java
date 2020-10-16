package desafioEssential;

import java.util.Arrays;
import java.util.List;

public class Exer33TestFaun {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		nums.peek(n->n%2==0).forEach(s->System.out.print("" +s));
		nums.map(n->n%2==0).forEach(s->System.out.print("" +s));
		nums.filter(n->n%2==0).forEach(s->System.out.print("" +s));
		 
		

	}

}
