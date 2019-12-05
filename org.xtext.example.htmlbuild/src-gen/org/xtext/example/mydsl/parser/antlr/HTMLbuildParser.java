/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalHTMLbuildParser;
import org.xtext.example.mydsl.services.HTMLbuildGrammarAccess;

public class HTMLbuildParser extends AbstractAntlrParser {

	@Inject
	private HTMLbuildGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHTMLbuildParser createParser(XtextTokenStream stream) {
		return new InternalHTMLbuildParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public HTMLbuildGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HTMLbuildGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
