package application;

import java.util.stream.IntStream;

public class App {
	public static void main(String[] args) {
		
		//Java is object oriented
		//Stream loops allow for functional programming
		
		//another way of creating a loop
		
		/* A stream is a sequence of items produced one by one
		 * forEach iterates over the items as they are produced
		 * 
		 */
		IntStream.range(0, 5).forEach(i -> {
			System.out.println(i);
		});
	}
}
