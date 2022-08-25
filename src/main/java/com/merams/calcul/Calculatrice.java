package com.merams.calcul;


public class Calculatrice {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		System.out.println("Calculatrice basique. Voici quelques opérations : ");
		System.out.println("5 + 4 = " + calculator.add(5, 4));
		System.out.println("5 - 4 = " + calculator.minus(5, 4));
		System.out.println("5 * 4 = " + calculator.multiple(5, 4));
		
		try {
			  System.out.println("5 / 4 = " + calculator.divide(5, 4));
			  System.out.print("5 / 0 = ");
			  System.out.println(calculator.divide(5, 0));
			  
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fin des opérations");
		
	}

}
