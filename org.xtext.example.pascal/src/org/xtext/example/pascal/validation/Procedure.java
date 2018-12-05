package org.xtext.example.pascal.validation;

import java.util.Iterator;
import java.util.List;

import org.xtext.example.pascal.pascal.abstraction_declaration;
import org.xtext.example.pascal.pascal.block;
 
public class Procedure extends Element {

	protected abstraction_declaration declaration;
	protected List<Variable> parameters;
	
	protected Procedure(String name, ElementType type, boolean inherited, block containingBlock, 
			abstraction_declaration declaration, List<Variable> parameters) {
		super(name, type, inherited, containingBlock); 
		this.parameters = parameters;
		this.declaration = declaration;
	}
	
	public Procedure(String name, boolean inherited, block containingBlock, 
			abstraction_declaration declaration, List<Variable> parameters) {
		this(name, ElementType.PROCEDURE, inherited, containingBlock, declaration, parameters);
	}

	public Procedure(String name, List<Variable> parameters) {
		this(name, ElementType.PROCEDURE, false, null, null, parameters);
	}
	
	public List<Variable> getParameters() {
		return this.parameters;
	}
	
	
	public abstraction_declaration getDeclaration() {
		return this.declaration;
	}
	
	public String getExtendedName() {
		String extendedName = this.name;
		for (Variable param : this.parameters) {
			extendedName += "_" + param.getVarType().getRealType();
		}
		return extendedName;
	}
	
	@Override
	public Element clone() {
		return new Procedure(this.name, this.type, this.inherited, this.containingBlock, 
				this.declaration, this.parameters);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && (obj instanceof Procedure)) {
			Procedure other = (Procedure) obj;
			if (!this.name.toLowerCase().equals(other.name.toLowerCase()))
				return false;
			if (this.parameters.size() != other.parameters.size()) 
				return false;
			Iterator<Variable> it1 = this.parameters.iterator();
			Iterator<Variable> it2 = other.parameters.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				Type it1Type = it1.next().getVarType();
				Type it2Type = it2.next().getVarType();
				if (!it1Type.getRealType().toLowerCase().equals(it2Type.getRealType().toLowerCase()))
					return false;
			}
			return true;
		}
		return super.equals(obj);
	}
	
	public boolean equalsWithTypeCoersion(Object obj) {
		if (obj != null && (obj instanceof Procedure)) {
			Procedure other = (Procedure) obj;
			if (!this.name.toLowerCase().equals(other.name.toLowerCase()))
				return false;
			if (this.parameters.size() != other.parameters.size()) 
				return false;
			Iterator<Variable> it1 = this.parameters.iterator();
			Iterator<Variable> it2 = other.parameters.iterator();
			while (it1.hasNext() && it2.hasNext()) {
				Type it1Type = it1.next().getVarType();
				Type it2Type = it2.next().getVarType();
				if (!TypeInferer.areTypesCompatibles(it1Type, it2Type))
					return false;
			}
			return true;
		}
		return super.equals(obj);
	}
	
	@Override
	public int compareTo(Element other) {
		if (super.compareTo(other) == 0) {
			return -1;
		}
		return super.compareTo(other);
	}
	
}