package com.merams.calcul;

public class CalculatorException extends Exception {
	
	private String msg = "";
	
	public CalculatorException(String message) {
		this.msg = message;
	}
	
	public String getMessage() {
		return this.msg;
	}

}
