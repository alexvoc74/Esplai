package recursivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursividad {

	static String [] tec = {"Markdown", "Regexp" , "HTML", "CSS", "JS", "SQL", "Java"};
	static String str = "supercalifragilisticoespialidoso";  
	
	static void tecnologies(int k) {
		
		System.out.println(tec[k]);
		k++;
		
		if(k < tec.length) {
			tecnologies(k);
		}
		
		
		//return similar.toArray(new String[similar.size()]);
	}
	
	static void html(int j) {
		
		System.out.println(tec[j]);
		j++;
		
		
		if(!tec[j].equals("HTML")) {
			html(j);
			
		}
	}
	
	static void reverseString(String string) {  
		
		if ((string==null)||(string.length() <= 1))   
			System.out.println(string);
		
		
		else {   
			System.out.print(string.charAt(string.length()-1));   
			reverseString(string.substring(0,string.length()-1));   
			}   
	}   
	
	static void fibonacci(int num) {
		int a = 1;
		int b = 1;
		
		System.out.print("1,1,");
		fibonacci(num, a, b);
	}
	
	static void fibonacci(int num, int a, int b) {
		int c = a + b;
		
		System.out.print(c);
		
		if((c + b) >=num) {
			System.out.print(".");
		}
		else {
			System.out.print(",");
			fibonacci(num, b, c);
		}
	}
	
	public static int sum(int x, int y) {
		 System.out.println("Segundo valor es: " + y);
		  if (y == 0) {
			  System.out.println("Primer valor es: " + x);
			    return x;
		  }

		 
		  
		  else {

		    return 1 + sum(x, y-1);
		    
		  }
		}
	
	public static void main(String[] args) {
		
		System.out.println("Mostrando Array de forma recursiva: ");
		System.out.println();
		tecnologies(0);
		System.out.println("\n-----------------------------------");
		System.out.println("\nRecorrer Array hasta llegar a HTML:");
		System.out.println();
		html(0);
		System.out.println();
		System.out.println("\n-----------------------------------");
		System.out.println("\nFibonacci:");
		fibonacci(100);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Invertir palabra:");
		recursividad rs = new recursividad();
		rs.reverseString(str);
		
		System.out.println();
		System.out.println();
		int resultado = sum(20,4);
		System.out.print("La suma de valores es :"+ resultado);
		
	}
}

//parametre num 1 i sumar amb lanterior;