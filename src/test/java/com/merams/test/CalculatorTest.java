package com.merams.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.merams.calcul.Calculator;
import com.merams.calcul.CalculatorException;

class CalculatorTest {

	@Test
	void testAdd() {

       int a;
       int b;
       int somme;
       
       System.out.println("Test de la méthode Calculator.add....");
       
       Calculator calculator = new Calculator();
       

       somme = calculator.add(5, 4);
       assertEquals(9, somme);
       
       somme = calculator.add(4, 5);
       assertEquals(9, somme);
       
       somme = calculator.add(5, 0);
       assertEquals(5, somme);

       somme = calculator.add(0, 5);
       assertEquals(5, somme);

       somme = calculator.add(-5, 4);
       assertEquals(-1, somme);

       somme = calculator.add(4, -5);
       assertEquals(-1, somme);

       System.out.println("Test de la méthode Calculator.add OK");

	}
	
	
	@Test
	void testMinus() {

       int a;
       int b;
       int difference;
       
       System.out.println("Test de la méthode Calculator.minus....");
       
       Calculator calculator = new Calculator();
       

       difference = calculator.minus(5, 4);
       assertEquals(1, difference);
       
       difference = calculator.minus(4, 5);
       assertEquals(-1, difference);
       
       difference = calculator.minus(5, 0);
       assertEquals(5, difference);

       difference = calculator.minus(0, 5);
       assertEquals(-5, difference);

       difference = calculator.minus(-5, 4);
       assertEquals(-9, difference);

       difference = calculator.minus(4, -5);
       assertEquals(9, difference);
       
       System.out.println("Test de la méthode Calculator.minus OK");


	}

	

	@Test
	void testMultiple() {

       int a;
       int b;
       int produit;
       
       System.out.println("Test de la méthode Calculator.multiple....");
       
       Calculator calculator = new Calculator();
       

       produit = calculator.multiple(5, 4);
       assertEquals(20, produit);
       
       produit = calculator.multiple(4, 5);
       assertEquals(20, produit);
       
       produit = calculator.multiple(5, 0);
       assertEquals(0, produit);

       produit = calculator.multiple(0, 5);
       assertEquals(0, produit);

       produit = calculator.multiple(-5, 4);
       assertEquals(-20, produit);

       produit = calculator.multiple(4, -5);
       assertEquals(-20, produit);

       produit = calculator.multiple(10000, 10000);
       assertEquals(100000000, produit);

       
       System.out.println("Test de la méthode Calculator.multiple OK");

	}


	@Test
	void tesDivide() {

       int a;
       int b;
       int quotient;
       
       System.out.println("Test de la méthode Calculator.divide....");
       
       Calculator calculator = new Calculator();
       
       try {
             quotient = calculator.divide(5, 4);
             assertEquals(1, quotient);
       }
       catch(CalculatorException e) {
    	   fail(e.getMessage());
       }
       
       try {
		       quotient = calculator.divide(4, 5);
		       assertEquals(0, quotient);
       }
       catch(CalculatorException e) {
		    	   fail(e.getMessage());
       }
       
       try {
    	     quotient = calculator.divide(5, 0);
    	     assertEquals(0, quotient);
       }
       catch(CalculatorException e) {
    	   String expectedMsg = "Division par 0";
    	   assertTrue(e.getMessage().contains(expectedMsg));
       }
    	     

       try {
    	     quotient = calculator.divide(0, 5);
             assertEquals(0, quotient);
       }
       catch(CalculatorException e) {
    	   fail(e.getMessage());
       }

       
       try {
		     quotient = calculator.divide(-5, 4);
		     assertEquals(-1, quotient);
       }
       catch(CalculatorException e) {
    	   fail(e.getMessage());
       }

       try {
             quotient = calculator.divide(4, -5);
             assertEquals(0, quotient);
       }
       catch(CalculatorException e) {
       	   fail(e.getMessage());
       }

       
       System.out.println("Test de la méthode Calculator.divide OK");

	}

	
}
