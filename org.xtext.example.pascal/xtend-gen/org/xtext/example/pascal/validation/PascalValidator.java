/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.validation;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.variable_section;
import org.xtext.example.pascal.validation.AbstractPascalValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PascalValidator extends AbstractPascalValidator {
  public final static Map<String, Map<String, Object>> artefacts = new HashMap<String, Map<String, Object>>();
  
  private HashMap<String, variable_section> variables = new HashMap<String, variable_section>();
  
  @Check
  public Object fillArtefacts(final program p) {
    Object _xblockexpression = null;
    {
      String name = p.getHeading().getName();
      Object _xifexpression = null;
      boolean _containsKey = PascalValidator.artefacts.containsKey(name);
      boolean _not = (!_containsKey);
      if (_not) {
        Object _xblockexpression_1 = null;
        {
          HashMap<String, Object> _hashMap = new HashMap<String, Object>();
          PascalValidator.artefacts.put(name, _hashMap);
          _xblockexpression_1 = PascalValidator.artefacts.get(name).put("variables", this.variables);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checaVariavelDeclaradaSemInicializar(final variable_section varDecl) {
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(varDecl.getIdentifiers().getNames());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      EList<String> _names = varDecl.getIdentifiers().getNames();
      for (final String element : _names) {
        boolean _containsKey = this.variables.containsKey(element);
        boolean _not_1 = (!_containsKey);
        if (_not_1) {
          this.variables.put(element, varDecl);
        } else {
          this.error((" Duplicate identifier " + element), null);
        }
      }
    }
  }
  
  @Check
  public void checaVariavelNaoInicializadaAssignment(final assignment_statement assignment) {
    String element = assignment.getVariable().getName();
    boolean _containsKey = this.variables.containsKey(element);
    boolean _not = (!_containsKey);
    if (_not) {
      this.error(("Identifier not found " + element), null);
    }
  }
  
  @Check
  public void checaIdsFactorExpressions(final factor f) {
    boolean _containsKey = this.variables.containsKey(f.getVariable().getName());
    boolean _not = (!_containsKey);
    if (_not) {
      String _name = f.getVariable().getName();
      String _plus = ("Identifier not found " + _name);
      this.error(_plus, null);
    }
  }
  
  @Check
  public void restart(final program program) {
    PascalValidator.artefacts.clear();
    this.variables.clear();
  }
}
