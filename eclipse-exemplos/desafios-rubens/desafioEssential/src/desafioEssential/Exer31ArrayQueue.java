package desafioEssential;

import java.util.ArrayDeque;
import java.util.Queue;

public class Exer31ArrayQueue {

	public static void main(String[] args) {
		Queue<String> products = new ArrayDeque<String>();
		products.add("p1");
		products.add("p2");
		products.add("p3");
		System.out.println(products.peek());
		System.out.println(products.poll());
		System.out.println("");
		
		products.forEach(s -> System.out.println(s));
		
	}

}
