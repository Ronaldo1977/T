package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
		    Triangulo x, y;
		    x = new Triangulo();
		    y = new Triangulo();
			
			System.out.println("Digite as medidas do triângulo x: ");
			x.a = sc.nextDouble(); 
			x.b = sc.nextDouble(); 
			x.c = sc.nextDouble(); 
			
			System.out.println("Digite as medidas do triângulo y: ");
			y.a = sc.nextDouble(); 
			y.b = sc.nextDouble(); 
			y.c = sc.nextDouble(); 
	     
			double areax = x.area();
			double areay = y.area();
			
			System.out.printf("Area do Triangulo x :%.2f%n", areax);
			System.out.printf("Area do Triangulo y :%.2f%n", areay);
			
			if (areax > areay) {
				System.out.println("Area x e maior");	
			}
			else {
				System.out.println("Area y e maior");
			}
						
					
					
					
		 sc.close(); 
		}



		

	}


