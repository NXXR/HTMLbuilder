/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalHTMLbuildParser;
import org.xtext.example.mydsl.services.HTMLbuildGrammarAccess;

public class HTMLbuildParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(HTMLbuildGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HTMLbuildGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getStyleAccess().getAlternatives_3(), "rule__Style__Alternatives_3");
			builder.put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
			builder.put(grammarAccess.getTextAccess().getAlternatives_4(), "rule__Text__Alternatives_4");
			builder.put(grammarAccess.getImageAccess().getAlternatives_3(), "rule__Image__Alternatives_3");
			builder.put(grammarAccess.getLinkAccess().getAlternatives_3(), "rule__Link__Alternatives_3");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives_0(), "rule__Element__Alternatives_0");
			builder.put(grammarAccess.getSeparatorAccess().getAlternatives(), "rule__Separator__Alternatives");
			builder.put(grammarAccess.getStyleAccess().getGroup(), "rule__Style__Group__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_4(), "rule__Link__Group_4__0");
			builder.put(grammarAccess.getDivAccess().getGroup(), "rule__Div__Group__0");
			builder.put(grammarAccess.getDivAccess().getGroup_3(), "rule__Div__Group_3__0");
			builder.put(grammarAccess.getNextAccess().getGroup(), "rule__Next__Group__0");
			builder.put(grammarAccess.getNextAccess().getGroup_2(), "rule__Next__Group_2__0");
			builder.put(grammarAccess.getNextAccess().getGroup_2_1(), "rule__Next__Group_2_1__0");
			builder.put(grammarAccess.getThenAccess().getGroup(), "rule__Then__Group__0");
			builder.put(grammarAccess.getThenAccess().getGroup_2(), "rule__Then__Group_2__0");
			builder.put(grammarAccess.getThenAccess().getGroup_2_1(), "rule__Then__Group_2_1__0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
			builder.put(grammarAccess.getStyleAccess().getStyle_idAssignment_1(), "rule__Style__Style_idAssignment_1");
			builder.put(grammarAccess.getStyleAccess().getLinkAssignment_3_0(), "rule__Style__LinkAssignment_3_0");
			builder.put(grammarAccess.getStyleAccess().getNewlinkAssignment_3_1(), "rule__Style__NewlinkAssignment_3_1");
			builder.put(grammarAccess.getTextAccess().getNameAssignment_2(), "rule__Text__NameAssignment_2");
			builder.put(grammarAccess.getTextAccess().getH1Assignment_4_0(), "rule__Text__H1Assignment_4_0");
			builder.put(grammarAccess.getTextAccess().getH2Assignment_4_1(), "rule__Text__H2Assignment_4_1");
			builder.put(grammarAccess.getTextAccess().getH3Assignment_4_2(), "rule__Text__H3Assignment_4_2");
			builder.put(grammarAccess.getImageAccess().getNameAssignment_1(), "rule__Image__NameAssignment_1");
			builder.put(grammarAccess.getImageAccess().getLinkAssignment_3_0(), "rule__Image__LinkAssignment_3_0");
			builder.put(grammarAccess.getImageAccess().getNewlinkAssignment_3_1(), "rule__Image__NewlinkAssignment_3_1");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
			builder.put(grammarAccess.getLinkAccess().getAddressAssignment_3_0(), "rule__Link__AddressAssignment_3_0");
			builder.put(grammarAccess.getLinkAccess().getAnchorAssignment_3_1(), "rule__Link__AnchorAssignment_3_1");
			builder.put(grammarAccess.getLinkAccess().getLinktextAssignment_4_1(), "rule__Link__LinktextAssignment_4_1");
			builder.put(grammarAccess.getElementAccess().getElemAssignment_1(), "rule__Element__ElemAssignment_1");
			builder.put(grammarAccess.getDivAccess().getDiv_idAssignment_0(), "rule__Div__Div_idAssignment_0");
			builder.put(grammarAccess.getDivAccess().getDivelementsAssignment_2(), "rule__Div__DivelementsAssignment_2");
			builder.put(grammarAccess.getDivAccess().getSeparatorsAssignment_3_0(), "rule__Div__SeparatorsAssignment_3_0");
			builder.put(grammarAccess.getDivAccess().getDivelementsAssignment_3_1(), "rule__Div__DivelementsAssignment_3_1");
			builder.put(grammarAccess.getNextAccess().getHasratioAssignment_2_0(), "rule__Next__HasratioAssignment_2_0");
			builder.put(grammarAccess.getNextAccess().getRatiosAssignment_2_1_0(), "rule__Next__RatiosAssignment_2_1_0");
			builder.put(grammarAccess.getNextAccess().getRatiosAssignment_2_2(), "rule__Next__RatiosAssignment_2_2");
			builder.put(grammarAccess.getThenAccess().getHasratioAssignment_2_0(), "rule__Then__HasratioAssignment_2_0");
			builder.put(grammarAccess.getThenAccess().getRatiosAssignment_2_1_0(), "rule__Then__RatiosAssignment_2_1_0");
			builder.put(grammarAccess.getThenAccess().getRatiosAssignment_2_2(), "rule__Then__RatiosAssignment_2_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private HTMLbuildGrammarAccess grammarAccess;

	@Override
	protected InternalHTMLbuildParser createParser() {
		InternalHTMLbuildParser result = new InternalHTMLbuildParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HTMLbuildGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HTMLbuildGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
