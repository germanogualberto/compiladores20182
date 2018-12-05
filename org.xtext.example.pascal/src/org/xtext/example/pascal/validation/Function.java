package org.xtext.example.pascal.validation;

import java.util.List;

import org.xtext.example.pascal.pascal.abstraction_declaration;
import org.xtext.example.pascal.pascal.block;

public class Function extends Procedure {

	private Type returnType;
	
	public Function(String name, boolean inherited, block containingBlock, abstraction_declaration declaration,
			List<Variable> parameters, Type returnType) {
		super(name, ElementType.FUNCTION, inherited, containingBlock, declaration, parameters);
		this.returnType = returnType;
	}
	
	public Function(String name, block containingBlock, abstraction_declaration declaration, List<Variable> parameters) {
		this(name, false, containingBlock, declaration, parameters, null);
	}
	
	public Type getReturnType() {
		return this.returnType;
	}
	
	@Override
	public Element clone() {
		return new Function(this.name, this.inherited, this.containingBlock, this.declaration,
				this.parameters, this.returnType);
	}

	@Override
	public String toString() {
		return "[" + this.name + ", " + this.inherited + ", " + this.type + ", " + this.returnType + "]";
	}
	 
}