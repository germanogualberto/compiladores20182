package org.xtext.example.pascal.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class APIProvider {

	public static final Set<Procedure> procedures = getStandardAbstractions();
	public static final Set<Type> types = getStandardTypes();
	
	private static List<Variable> getParametersWithType(String... parameters) {
		List<Variable> params = new ArrayList<Variable>();
		int count = 0;
		for (String s : parameters) {
			params.add(new Variable("arg_" + count, new Type(s), false, null, ElementType.PARAMETER));
			count++;
		}	
		return params;
	}
	
	private static void addAbstractionInAbstractions(Set<Procedure> abstractions, String name, Type returnType, String... parameters) {
		if (returnType.equals(new Type("void"))) { 
			abstractions.add(new Procedure(name, false, null, null, getParametersWithType(parameters))); 
		} else {
			abstractions.add(new Function(name, false, null, null, getParametersWithType(parameters), returnType)); 
		}
	} 
	
	private static void addAbstraction(Set<Procedure> abstractions, String name, String returnType, String... parameters) {  
		boolean isVirtual = false;
		for (int i = 0; i < parameters.length; i++) {
			if (parameters[i].equals("numeric")) {
				String[] newParameters = new String[parameters.length];
				System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
				newParameters[i] = "integer";
				addAbstraction(abstractions, name, returnType, newParameters);
				newParameters = new String[parameters.length];
				System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
				newParameters[i] = "real";
				addAbstraction(abstractions, name, returnType, newParameters);
				isVirtual = true;
			} else if (parameters[i].contains("?")) {
				for (Type t : getStandardTypes()) {
					String newParameterName = t.name;
					String[] newParameters = new String[parameters.length];
					System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
					if (parameters[i].equals("?")) {
						newParameters[i] = newParameterName;
						addAbstraction(abstractions, name, returnType, newParameters); 
					}
				} 
				isVirtual = true;
			}
		}
		if (!isVirtual)  {
			if (returnType.equals("reflect")) {
				if (parameters.length == 1) { 
					addAbstraction(abstractions, name, parameters[0], parameters); 
				} else {
					throw new RuntimeException("Invalid return type");
				}
			} else {
				addAbstractionInAbstractions(abstractions, name, new Type(returnType), parameters);
			}
		}
	}
	
	private static void setStandardAbstractions(Set<Procedure> it) {
		addAbstraction(it, "round", "integer", "real"); 
		addAbstraction(it, "chr", "char", "integer");
		addAbstraction(it, "abs", "reflect", "numeric");
		addAbstraction(it, "odd", "boolean", "integer");
		addAbstraction(it, "sqr", "reflect", "numeric");
		addAbstraction(it, "sqrt", "real", "numeric");
		addAbstraction(it, "sin", "real", "numeric");
		addAbstraction(it, "cos", "real", "numeric");
		addAbstraction(it, "arctan", "real", "numeric");
		addAbstraction(it, "ln", "real", "numeric");
		addAbstraction(it, "exp", "real", "numeric");
		addAbstraction(it, "succ", "integer", "integer");
		addAbstraction(it, "pred", "integer", "integer");
		addAbstraction(it, "write", "void", "?");
		addAbstraction(it, "write", "void"); 
		addAbstraction(it, "writeln", "void", "?");
		addAbstraction(it, "writeln", "void");
		addAbstraction(it, "read", "void", "?");
		addAbstraction(it, "read", "void");
		addAbstraction(it, "readln", "void", "?");
		addAbstraction(it, "readln", "void");
	}
	
	private static Set<Procedure> getStandardAbstractions() {
		Set<Procedure> abstractions = new HashSet<Procedure>();
		setStandardAbstractions(abstractions);
		return abstractions;
	} 
	
	private static HashSet<Type> getStandardTypes() {
		HashSet<Type> standardTypes = new HashSet<Type>();
		standardTypes.add(new Type("real"));
		standardTypes.add(new Type("integer"));
		standardTypes.add(new Type("shortint"));
		standardTypes.add(new Type("longint"));
		standardTypes.add(new Type("boolean"));
		standardTypes.add(new Type("char")); 
		return standardTypes;
	}
	
}