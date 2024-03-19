package arrayListSetActivit;

import java.util.Scanner;

import java.util.ArrayList;
//import java.util.Collections;


public class arrayListSetActivit1 {
	
			public void main(String[] args) {
				
				String cor;
				Scanner leia = new Scanner(System.in);
				ArrayList <String> cores = new ArrayList<String>();
				
				
				for(int i = 0; i < 5; i++) {
					System.out.println("Adicine 5 cores:");
					cor = leia.next();
					cores.add(cor);
				}
				System.out.println("As cores adicionadas foram:" + cores);
					
				}
				
			}


