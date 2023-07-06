package com.rays.Exception;

public class TestMistake {

	   public static void main(String[] args) throws MistakeException {
		
		   Dad();
		   
	}

	private static void Dad() throws MistakeException {
        
		Mom();
		
	}

	private static void Mom() throws MistakeException {
		
		Son();
		
		
	}

	private static void Son() throws MistakeException {
    
		throw new MistakeException();
	}
}
