package arrayListSet;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;



public class arrayListSet1 {

	    public static void main(String[] args) {
	    	
	    	
	        
	        ArrayList<String> cores = new ArrayList<String>();
	        
	        
	        Scanner leia = new Scanner(System.in);
	        
	      
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Digite suas cores:");
	            String cor = leia.nextLine();
	            cores.add(cor);
	        }
	        
	        
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	        
	       
	        Collections.sort(cores);
	        
	        
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	        
	        
	        leia.close();
	    }
	}

