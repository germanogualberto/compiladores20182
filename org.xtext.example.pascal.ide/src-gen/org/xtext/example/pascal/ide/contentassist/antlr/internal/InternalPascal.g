/*
 * generated by Xtext 2.15.0
 */
grammar InternalPascal;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.pascal.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.pascal.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.pascal.services.PascalGrammarAccess;

}
@parser::members {
	private PascalGrammarAccess grammarAccess;

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleprogram
entryRuleprogram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleprogram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule program
ruleprogram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleindentifier_list
entryRuleindentifier_list
:
{ before(grammarAccess.getIndentifier_listRule()); }
	 ruleindentifier_list
{ after(grammarAccess.getIndentifier_listRule()); } 
	 EOF 
;

// Rule indentifier_list
ruleindentifier_list 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIndentifier_listAccess().getGroup()); }
		(rule__Indentifier_list__Group__0)
		{ after(grammarAccess.getIndentifier_listAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
	'program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
	rule__Program__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getGroup_2()); }
	(rule__Program__Group_2__0)?
	{ after(grammarAccess.getProgramAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getProgramAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group_2__0__Impl
	rule__Program__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group_2__1__Impl
	rule__Program__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getIdentifiersAssignment_2_1()); }
	(rule__Program__IdentifiersAssignment_2_1)
	{ after(grammarAccess.getProgramAccess().getIdentifiersAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2()); }
	')'
	{ after(grammarAccess.getProgramAccess().getRightParenthesisKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Indentifier_list__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Indentifier_list__Group__0__Impl
	rule__Indentifier_list__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_0()); }
	(rule__Indentifier_list__NamesAssignment_0)
	{ after(grammarAccess.getIndentifier_listAccess().getNamesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Indentifier_list__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIndentifier_listAccess().getGroup_1()); }
	(rule__Indentifier_list__Group_1__0)*
	{ after(grammarAccess.getIndentifier_listAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Indentifier_list__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Indentifier_list__Group_1__0__Impl
	rule__Indentifier_list__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getIndentifier_listAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Indentifier_list__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIndentifier_listAccess().getNamesAssignment_1_1()); }
	(rule__Indentifier_list__NamesAssignment_1_1)
	{ after(grammarAccess.getIndentifier_listAccess().getNamesAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__IdentifiersAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getIdentifiersIndentifier_listParserRuleCall_2_1_0()); }
		ruleindentifier_list
		{ after(grammarAccess.getProgramAccess().getIdentifiersIndentifier_listParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__NamesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Indentifier_list__NamesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIndentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
