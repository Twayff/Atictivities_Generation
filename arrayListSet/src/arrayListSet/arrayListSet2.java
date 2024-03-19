package arrayListSet;

import java.util.Scanner;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class arrayListSet2 {
	public static void main(String [] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite seus valores:");
			int num = leia.nextInt();
			setNumeros.add(num);
			
		}
		
		System.out.println("\nListar dados do Set:" + setNumeros);
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
		
		
	}

}
