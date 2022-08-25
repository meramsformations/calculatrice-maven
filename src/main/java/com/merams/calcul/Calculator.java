package com.merams.calcul;

public class Calculator {

	//Addition
	public int add(int a, int b) {
		return a + b;
	}

	//Soustraction
	public int minus(int a, int b) {
		return a - b;
	}

	//Multiplication
	public int multiple(int a, int b) {
		return a * b;
	}

	//Division
	public int divide(int a, int b) throws CalculatorException {
		if (b == 0) throw new CalculatorException ("Division par 0 interdite.");
		
		return a / b;
	}

}
