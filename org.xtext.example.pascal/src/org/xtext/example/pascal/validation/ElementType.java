package org.xtext.example.pascal.validation;


public enum ElementType {

	VARIABLE, CONSTANT, PARAMETER, FUNCTION, PROCEDURE, TYPE;
	
	@Override
	public String toString() {
		switch(this) {
		case VARIABLE:
			return "Variable";
		case CONSTANT:
			return "Constant";
		case PARAMETER:
			return "Parameter";
		case FUNCTION:
			return "Function";
		case PROCEDURE:
			return "Procedure";
		case TYPE:
			return "Type";
		default:
			return "Undefined";
		}
	}

}