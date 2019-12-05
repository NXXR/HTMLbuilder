package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.HTMLbuildGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHTMLbuildParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Style'", "':'", "'Text'", "'Image'", "'Link'", "'linktext'", "'{'", "'}'", "'<next'", "'>'", "')'", "'/'", "'<then'", "'#'", "'##'", "'###'", "'('"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHTMLbuildParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHTMLbuildParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHTMLbuildParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHTMLbuild.g"; }


    	private HTMLbuildGrammarAccess grammarAccess;

    	public void setGrammarAccess(HTMLbuildGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalHTMLbuild.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:54:1: ( ruleModel EOF )
            // InternalHTMLbuild.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHTMLbuild.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalHTMLbuild.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalHTMLbuild.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalHTMLbuild.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalHTMLbuild.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=13 && LA1_0<=15)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHTMLbuild.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalHTMLbuild.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:79:1: ( ruleType EOF )
            // InternalHTMLbuild.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalHTMLbuild.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalHTMLbuild.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalHTMLbuild.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalHTMLbuild.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalHTMLbuild.g:94:3: ( rule__Type__Alternatives )
            // InternalHTMLbuild.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStyle"
    // InternalHTMLbuild.g:103:1: entryRuleStyle : ruleStyle EOF ;
    public final void entryRuleStyle() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:104:1: ( ruleStyle EOF )
            // InternalHTMLbuild.g:105:1: ruleStyle EOF
            {
             before(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleStyle();

            state._fsp--;

             after(grammarAccess.getStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalHTMLbuild.g:112:1: ruleStyle : ( ( rule__Style__Group__0 ) ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:116:2: ( ( ( rule__Style__Group__0 ) ) )
            // InternalHTMLbuild.g:117:2: ( ( rule__Style__Group__0 ) )
            {
            // InternalHTMLbuild.g:117:2: ( ( rule__Style__Group__0 ) )
            // InternalHTMLbuild.g:118:3: ( rule__Style__Group__0 )
            {
             before(grammarAccess.getStyleAccess().getGroup()); 
            // InternalHTMLbuild.g:119:3: ( rule__Style__Group__0 )
            // InternalHTMLbuild.g:119:4: rule__Style__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Style__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContent"
    // InternalHTMLbuild.g:128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:129:1: ( ruleContent EOF )
            // InternalHTMLbuild.g:130:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalHTMLbuild.g:137:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:141:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalHTMLbuild.g:142:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalHTMLbuild.g:142:2: ( ( rule__Content__Alternatives ) )
            // InternalHTMLbuild.g:143:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalHTMLbuild.g:144:3: ( rule__Content__Alternatives )
            // InternalHTMLbuild.g:144:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleText"
    // InternalHTMLbuild.g:153:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:154:1: ( ruleText EOF )
            // InternalHTMLbuild.g:155:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalHTMLbuild.g:162:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:166:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalHTMLbuild.g:167:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalHTMLbuild.g:167:2: ( ( rule__Text__Group__0 ) )
            // InternalHTMLbuild.g:168:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalHTMLbuild.g:169:3: ( rule__Text__Group__0 )
            // InternalHTMLbuild.g:169:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleImage"
    // InternalHTMLbuild.g:178:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:179:1: ( ruleImage EOF )
            // InternalHTMLbuild.g:180:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalHTMLbuild.g:187:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:191:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalHTMLbuild.g:192:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalHTMLbuild.g:192:2: ( ( rule__Image__Group__0 ) )
            // InternalHTMLbuild.g:193:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalHTMLbuild.g:194:3: ( rule__Image__Group__0 )
            // InternalHTMLbuild.g:194:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleLink"
    // InternalHTMLbuild.g:203:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:204:1: ( ruleLink EOF )
            // InternalHTMLbuild.g:205:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalHTMLbuild.g:212:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:216:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalHTMLbuild.g:217:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalHTMLbuild.g:217:2: ( ( rule__Link__Group__0 ) )
            // InternalHTMLbuild.g:218:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalHTMLbuild.g:219:3: ( rule__Link__Group__0 )
            // InternalHTMLbuild.g:219:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleElement"
    // InternalHTMLbuild.g:228:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:229:1: ( ruleElement EOF )
            // InternalHTMLbuild.g:230:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalHTMLbuild.g:237:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:241:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalHTMLbuild.g:242:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalHTMLbuild.g:242:2: ( ( rule__Element__Alternatives ) )
            // InternalHTMLbuild.g:243:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalHTMLbuild.g:244:3: ( rule__Element__Alternatives )
            // InternalHTMLbuild.g:244:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDiv"
    // InternalHTMLbuild.g:253:1: entryRuleDiv : ruleDiv EOF ;
    public final void entryRuleDiv() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:254:1: ( ruleDiv EOF )
            // InternalHTMLbuild.g:255:1: ruleDiv EOF
            {
             before(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            ruleDiv();

            state._fsp--;

             after(grammarAccess.getDivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalHTMLbuild.g:262:1: ruleDiv : ( ( rule__Div__Group__0 ) ) ;
    public final void ruleDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:266:2: ( ( ( rule__Div__Group__0 ) ) )
            // InternalHTMLbuild.g:267:2: ( ( rule__Div__Group__0 ) )
            {
            // InternalHTMLbuild.g:267:2: ( ( rule__Div__Group__0 ) )
            // InternalHTMLbuild.g:268:3: ( rule__Div__Group__0 )
            {
             before(grammarAccess.getDivAccess().getGroup()); 
            // InternalHTMLbuild.g:269:3: ( rule__Div__Group__0 )
            // InternalHTMLbuild.g:269:4: rule__Div__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Div__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleSeparator"
    // InternalHTMLbuild.g:278:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:279:1: ( ruleSeparator EOF )
            // InternalHTMLbuild.g:280:1: ruleSeparator EOF
            {
             before(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getSeparatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalHTMLbuild.g:287:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:291:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalHTMLbuild.g:292:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalHTMLbuild.g:292:2: ( ( rule__Separator__Alternatives ) )
            // InternalHTMLbuild.g:293:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalHTMLbuild.g:294:3: ( rule__Separator__Alternatives )
            // InternalHTMLbuild.g:294:4: rule__Separator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleNext"
    // InternalHTMLbuild.g:303:1: entryRuleNext : ruleNext EOF ;
    public final void entryRuleNext() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:304:1: ( ruleNext EOF )
            // InternalHTMLbuild.g:305:1: ruleNext EOF
            {
             before(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_1);
            ruleNext();

            state._fsp--;

             after(grammarAccess.getNextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNext"


    // $ANTLR start "ruleNext"
    // InternalHTMLbuild.g:312:1: ruleNext : ( ( rule__Next__Group__0 ) ) ;
    public final void ruleNext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:316:2: ( ( ( rule__Next__Group__0 ) ) )
            // InternalHTMLbuild.g:317:2: ( ( rule__Next__Group__0 ) )
            {
            // InternalHTMLbuild.g:317:2: ( ( rule__Next__Group__0 ) )
            // InternalHTMLbuild.g:318:3: ( rule__Next__Group__0 )
            {
             before(grammarAccess.getNextAccess().getGroup()); 
            // InternalHTMLbuild.g:319:3: ( rule__Next__Group__0 )
            // InternalHTMLbuild.g:319:4: rule__Next__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Next__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNext"


    // $ANTLR start "entryRuleThen"
    // InternalHTMLbuild.g:328:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalHTMLbuild.g:329:1: ( ruleThen EOF )
            // InternalHTMLbuild.g:330:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalHTMLbuild.g:337:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:341:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalHTMLbuild.g:342:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalHTMLbuild.g:342:2: ( ( rule__Then__Group__0 ) )
            // InternalHTMLbuild.g:343:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalHTMLbuild.g:344:3: ( rule__Then__Group__0 )
            // InternalHTMLbuild.g:344:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalHTMLbuild.g:352:1: rule__Type__Alternatives : ( ( ruleStyle ) | ( ruleContent ) | ( ruleDiv ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:356:1: ( ( ruleStyle ) | ( ruleContent ) | ( ruleDiv ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHTMLbuild.g:357:2: ( ruleStyle )
                    {
                    // InternalHTMLbuild.g:357:2: ( ruleStyle )
                    // InternalHTMLbuild.g:358:3: ruleStyle
                    {
                     before(grammarAccess.getTypeAccess().getStyleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStyle();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStyleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:363:2: ( ruleContent )
                    {
                    // InternalHTMLbuild.g:363:2: ( ruleContent )
                    // InternalHTMLbuild.g:364:3: ruleContent
                    {
                     before(grammarAccess.getTypeAccess().getContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContent();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getContentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:369:2: ( ruleDiv )
                    {
                    // InternalHTMLbuild.g:369:2: ( ruleDiv )
                    // InternalHTMLbuild.g:370:3: ruleDiv
                    {
                     before(grammarAccess.getTypeAccess().getDivParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDiv();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDivParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Style__Alternatives_3"
    // InternalHTMLbuild.g:379:1: rule__Style__Alternatives_3 : ( ( ( rule__Style__LinkAssignment_3_0 ) ) | ( ( rule__Style__NewlinkAssignment_3_1 ) ) );
    public final void rule__Style__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:383:1: ( ( ( rule__Style__LinkAssignment_3_0 ) ) | ( ( rule__Style__NewlinkAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHTMLbuild.g:384:2: ( ( rule__Style__LinkAssignment_3_0 ) )
                    {
                    // InternalHTMLbuild.g:384:2: ( ( rule__Style__LinkAssignment_3_0 ) )
                    // InternalHTMLbuild.g:385:3: ( rule__Style__LinkAssignment_3_0 )
                    {
                     before(grammarAccess.getStyleAccess().getLinkAssignment_3_0()); 
                    // InternalHTMLbuild.g:386:3: ( rule__Style__LinkAssignment_3_0 )
                    // InternalHTMLbuild.g:386:4: rule__Style__LinkAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Style__LinkAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStyleAccess().getLinkAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:390:2: ( ( rule__Style__NewlinkAssignment_3_1 ) )
                    {
                    // InternalHTMLbuild.g:390:2: ( ( rule__Style__NewlinkAssignment_3_1 ) )
                    // InternalHTMLbuild.g:391:3: ( rule__Style__NewlinkAssignment_3_1 )
                    {
                     before(grammarAccess.getStyleAccess().getNewlinkAssignment_3_1()); 
                    // InternalHTMLbuild.g:392:3: ( rule__Style__NewlinkAssignment_3_1 )
                    // InternalHTMLbuild.g:392:4: rule__Style__NewlinkAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Style__NewlinkAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStyleAccess().getNewlinkAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Alternatives_3"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalHTMLbuild.g:400:1: rule__Content__Alternatives : ( ( ruleText ) | ( ruleImage ) | ( ruleLink ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:404:1: ( ( ruleText ) | ( ruleImage ) | ( ruleLink ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHTMLbuild.g:405:2: ( ruleText )
                    {
                    // InternalHTMLbuild.g:405:2: ( ruleText )
                    // InternalHTMLbuild.g:406:3: ruleText
                    {
                     before(grammarAccess.getContentAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:411:2: ( ruleImage )
                    {
                    // InternalHTMLbuild.g:411:2: ( ruleImage )
                    // InternalHTMLbuild.g:412:3: ruleImage
                    {
                     before(grammarAccess.getContentAccess().getImageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getImageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:417:2: ( ruleLink )
                    {
                    // InternalHTMLbuild.g:417:2: ( ruleLink )
                    // InternalHTMLbuild.g:418:3: ruleLink
                    {
                     before(grammarAccess.getContentAccess().getLinkParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getLinkParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Text__Alternatives_4"
    // InternalHTMLbuild.g:427:1: rule__Text__Alternatives_4 : ( ( ( rule__Text__H1Assignment_4_0 ) ) | ( ( rule__Text__H2Assignment_4_1 ) ) | ( ( rule__Text__H3Assignment_4_2 ) ) );
    public final void rule__Text__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:431:1: ( ( ( rule__Text__H1Assignment_4_0 ) ) | ( ( rule__Text__H2Assignment_4_1 ) ) | ( ( rule__Text__H3Assignment_4_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHTMLbuild.g:432:2: ( ( rule__Text__H1Assignment_4_0 ) )
                    {
                    // InternalHTMLbuild.g:432:2: ( ( rule__Text__H1Assignment_4_0 ) )
                    // InternalHTMLbuild.g:433:3: ( rule__Text__H1Assignment_4_0 )
                    {
                     before(grammarAccess.getTextAccess().getH1Assignment_4_0()); 
                    // InternalHTMLbuild.g:434:3: ( rule__Text__H1Assignment_4_0 )
                    // InternalHTMLbuild.g:434:4: rule__Text__H1Assignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__H1Assignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getH1Assignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:438:2: ( ( rule__Text__H2Assignment_4_1 ) )
                    {
                    // InternalHTMLbuild.g:438:2: ( ( rule__Text__H2Assignment_4_1 ) )
                    // InternalHTMLbuild.g:439:3: ( rule__Text__H2Assignment_4_1 )
                    {
                     before(grammarAccess.getTextAccess().getH2Assignment_4_1()); 
                    // InternalHTMLbuild.g:440:3: ( rule__Text__H2Assignment_4_1 )
                    // InternalHTMLbuild.g:440:4: rule__Text__H2Assignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__H2Assignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getH2Assignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:444:2: ( ( rule__Text__H3Assignment_4_2 ) )
                    {
                    // InternalHTMLbuild.g:444:2: ( ( rule__Text__H3Assignment_4_2 ) )
                    // InternalHTMLbuild.g:445:3: ( rule__Text__H3Assignment_4_2 )
                    {
                     before(grammarAccess.getTextAccess().getH3Assignment_4_2()); 
                    // InternalHTMLbuild.g:446:3: ( rule__Text__H3Assignment_4_2 )
                    // InternalHTMLbuild.g:446:4: rule__Text__H3Assignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__H3Assignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getH3Assignment_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Alternatives_4"


    // $ANTLR start "rule__Image__Alternatives_3"
    // InternalHTMLbuild.g:454:1: rule__Image__Alternatives_3 : ( ( ( rule__Image__LinkAssignment_3_0 ) ) | ( ( rule__Image__NewlinkAssignment_3_1 ) ) );
    public final void rule__Image__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:458:1: ( ( ( rule__Image__LinkAssignment_3_0 ) ) | ( ( rule__Image__NewlinkAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHTMLbuild.g:459:2: ( ( rule__Image__LinkAssignment_3_0 ) )
                    {
                    // InternalHTMLbuild.g:459:2: ( ( rule__Image__LinkAssignment_3_0 ) )
                    // InternalHTMLbuild.g:460:3: ( rule__Image__LinkAssignment_3_0 )
                    {
                     before(grammarAccess.getImageAccess().getLinkAssignment_3_0()); 
                    // InternalHTMLbuild.g:461:3: ( rule__Image__LinkAssignment_3_0 )
                    // InternalHTMLbuild.g:461:4: rule__Image__LinkAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__LinkAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImageAccess().getLinkAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:465:2: ( ( rule__Image__NewlinkAssignment_3_1 ) )
                    {
                    // InternalHTMLbuild.g:465:2: ( ( rule__Image__NewlinkAssignment_3_1 ) )
                    // InternalHTMLbuild.g:466:3: ( rule__Image__NewlinkAssignment_3_1 )
                    {
                     before(grammarAccess.getImageAccess().getNewlinkAssignment_3_1()); 
                    // InternalHTMLbuild.g:467:3: ( rule__Image__NewlinkAssignment_3_1 )
                    // InternalHTMLbuild.g:467:4: rule__Image__NewlinkAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__NewlinkAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getImageAccess().getNewlinkAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Alternatives_3"


    // $ANTLR start "rule__Link__Alternatives_3"
    // InternalHTMLbuild.g:475:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__AddressAssignment_3_0 ) ) | ( ( rule__Link__AnchorAssignment_3_1 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:479:1: ( ( ( rule__Link__AddressAssignment_3_0 ) ) | ( ( rule__Link__AnchorAssignment_3_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHTMLbuild.g:480:2: ( ( rule__Link__AddressAssignment_3_0 ) )
                    {
                    // InternalHTMLbuild.g:480:2: ( ( rule__Link__AddressAssignment_3_0 ) )
                    // InternalHTMLbuild.g:481:3: ( rule__Link__AddressAssignment_3_0 )
                    {
                     before(grammarAccess.getLinkAccess().getAddressAssignment_3_0()); 
                    // InternalHTMLbuild.g:482:3: ( rule__Link__AddressAssignment_3_0 )
                    // InternalHTMLbuild.g:482:4: rule__Link__AddressAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__AddressAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getAddressAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:486:2: ( ( rule__Link__AnchorAssignment_3_1 ) )
                    {
                    // InternalHTMLbuild.g:486:2: ( ( rule__Link__AnchorAssignment_3_1 ) )
                    // InternalHTMLbuild.g:487:3: ( rule__Link__AnchorAssignment_3_1 )
                    {
                     before(grammarAccess.getLinkAccess().getAnchorAssignment_3_1()); 
                    // InternalHTMLbuild.g:488:3: ( rule__Link__AnchorAssignment_3_1 )
                    // InternalHTMLbuild.g:488:4: rule__Link__AnchorAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__AnchorAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getAnchorAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Alternatives_3"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalHTMLbuild.g:496:1: rule__Element__Alternatives : ( ( ( rule__Element__Alternatives_0 ) ) | ( ( rule__Element__ElemAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:500:1: ( ( ( rule__Element__Alternatives_0 ) ) | ( ( rule__Element__ElemAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=15)||LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||(LA8_2>=18 && LA8_2<=19)||LA8_2==23) ) {
                    alt8=2;
                }
                else if ( (LA8_2==17) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHTMLbuild.g:501:2: ( ( rule__Element__Alternatives_0 ) )
                    {
                    // InternalHTMLbuild.g:501:2: ( ( rule__Element__Alternatives_0 ) )
                    // InternalHTMLbuild.g:502:3: ( rule__Element__Alternatives_0 )
                    {
                     before(grammarAccess.getElementAccess().getAlternatives_0()); 
                    // InternalHTMLbuild.g:503:3: ( rule__Element__Alternatives_0 )
                    // InternalHTMLbuild.g:503:4: rule__Element__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:507:2: ( ( rule__Element__ElemAssignment_1 ) )
                    {
                    // InternalHTMLbuild.g:507:2: ( ( rule__Element__ElemAssignment_1 ) )
                    // InternalHTMLbuild.g:508:3: ( rule__Element__ElemAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getElemAssignment_1()); 
                    // InternalHTMLbuild.g:509:3: ( rule__Element__ElemAssignment_1 )
                    // InternalHTMLbuild.g:509:4: rule__Element__ElemAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__ElemAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getElemAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Element__Alternatives_0"
    // InternalHTMLbuild.g:517:1: rule__Element__Alternatives_0 : ( ( ruleContent ) | ( ruleDiv ) );
    public final void rule__Element__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:521:1: ( ( ruleContent ) | ( ruleDiv ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=15)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHTMLbuild.g:522:2: ( ruleContent )
                    {
                    // InternalHTMLbuild.g:522:2: ( ruleContent )
                    // InternalHTMLbuild.g:523:3: ruleContent
                    {
                     before(grammarAccess.getElementAccess().getContentParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContent();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getContentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:528:2: ( ruleDiv )
                    {
                    // InternalHTMLbuild.g:528:2: ( ruleDiv )
                    // InternalHTMLbuild.g:529:3: ruleDiv
                    {
                     before(grammarAccess.getElementAccess().getDivParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiv();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDivParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives_0"


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalHTMLbuild.g:538:1: rule__Separator__Alternatives : ( ( ruleNext ) | ( ruleThen ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:542:1: ( ( ruleNext ) | ( ruleThen ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHTMLbuild.g:543:2: ( ruleNext )
                    {
                    // InternalHTMLbuild.g:543:2: ( ruleNext )
                    // InternalHTMLbuild.g:544:3: ruleNext
                    {
                     before(grammarAccess.getSeparatorAccess().getNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNext();

                    state._fsp--;

                     after(grammarAccess.getSeparatorAccess().getNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:549:2: ( ruleThen )
                    {
                    // InternalHTMLbuild.g:549:2: ( ruleThen )
                    // InternalHTMLbuild.g:550:3: ruleThen
                    {
                     before(grammarAccess.getSeparatorAccess().getThenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleThen();

                    state._fsp--;

                     after(grammarAccess.getSeparatorAccess().getThenParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Separator__Alternatives"


    // $ANTLR start "rule__Style__Group__0"
    // InternalHTMLbuild.g:559:1: rule__Style__Group__0 : rule__Style__Group__0__Impl rule__Style__Group__1 ;
    public final void rule__Style__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:563:1: ( rule__Style__Group__0__Impl rule__Style__Group__1 )
            // InternalHTMLbuild.g:564:2: rule__Style__Group__0__Impl rule__Style__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Style__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Style__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__0"


    // $ANTLR start "rule__Style__Group__0__Impl"
    // InternalHTMLbuild.g:571:1: rule__Style__Group__0__Impl : ( 'Style' ) ;
    public final void rule__Style__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:575:1: ( ( 'Style' ) )
            // InternalHTMLbuild.g:576:1: ( 'Style' )
            {
            // InternalHTMLbuild.g:576:1: ( 'Style' )
            // InternalHTMLbuild.g:577:2: 'Style'
            {
             before(grammarAccess.getStyleAccess().getStyleKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStyleAccess().getStyleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__0__Impl"


    // $ANTLR start "rule__Style__Group__1"
    // InternalHTMLbuild.g:586:1: rule__Style__Group__1 : rule__Style__Group__1__Impl rule__Style__Group__2 ;
    public final void rule__Style__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:590:1: ( rule__Style__Group__1__Impl rule__Style__Group__2 )
            // InternalHTMLbuild.g:591:2: rule__Style__Group__1__Impl rule__Style__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Style__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Style__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__1"


    // $ANTLR start "rule__Style__Group__1__Impl"
    // InternalHTMLbuild.g:598:1: rule__Style__Group__1__Impl : ( ( rule__Style__Style_idAssignment_1 ) ) ;
    public final void rule__Style__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:602:1: ( ( ( rule__Style__Style_idAssignment_1 ) ) )
            // InternalHTMLbuild.g:603:1: ( ( rule__Style__Style_idAssignment_1 ) )
            {
            // InternalHTMLbuild.g:603:1: ( ( rule__Style__Style_idAssignment_1 ) )
            // InternalHTMLbuild.g:604:2: ( rule__Style__Style_idAssignment_1 )
            {
             before(grammarAccess.getStyleAccess().getStyle_idAssignment_1()); 
            // InternalHTMLbuild.g:605:2: ( rule__Style__Style_idAssignment_1 )
            // InternalHTMLbuild.g:605:3: rule__Style__Style_idAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Style__Style_idAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getStyle_idAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__1__Impl"


    // $ANTLR start "rule__Style__Group__2"
    // InternalHTMLbuild.g:613:1: rule__Style__Group__2 : rule__Style__Group__2__Impl rule__Style__Group__3 ;
    public final void rule__Style__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:617:1: ( rule__Style__Group__2__Impl rule__Style__Group__3 )
            // InternalHTMLbuild.g:618:2: rule__Style__Group__2__Impl rule__Style__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Style__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Style__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__2"


    // $ANTLR start "rule__Style__Group__2__Impl"
    // InternalHTMLbuild.g:625:1: rule__Style__Group__2__Impl : ( ':' ) ;
    public final void rule__Style__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:629:1: ( ( ':' ) )
            // InternalHTMLbuild.g:630:1: ( ':' )
            {
            // InternalHTMLbuild.g:630:1: ( ':' )
            // InternalHTMLbuild.g:631:2: ':'
            {
             before(grammarAccess.getStyleAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStyleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__2__Impl"


    // $ANTLR start "rule__Style__Group__3"
    // InternalHTMLbuild.g:640:1: rule__Style__Group__3 : rule__Style__Group__3__Impl ;
    public final void rule__Style__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:644:1: ( rule__Style__Group__3__Impl )
            // InternalHTMLbuild.g:645:2: rule__Style__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Style__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__3"


    // $ANTLR start "rule__Style__Group__3__Impl"
    // InternalHTMLbuild.g:651:1: rule__Style__Group__3__Impl : ( ( rule__Style__Alternatives_3 ) ) ;
    public final void rule__Style__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:655:1: ( ( ( rule__Style__Alternatives_3 ) ) )
            // InternalHTMLbuild.g:656:1: ( ( rule__Style__Alternatives_3 ) )
            {
            // InternalHTMLbuild.g:656:1: ( ( rule__Style__Alternatives_3 ) )
            // InternalHTMLbuild.g:657:2: ( rule__Style__Alternatives_3 )
            {
             before(grammarAccess.getStyleAccess().getAlternatives_3()); 
            // InternalHTMLbuild.g:658:2: ( rule__Style__Alternatives_3 )
            // InternalHTMLbuild.g:658:3: rule__Style__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Style__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalHTMLbuild.g:667:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:671:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalHTMLbuild.g:672:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalHTMLbuild.g:679:1: rule__Text__Group__0__Impl : ( () ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:683:1: ( ( () ) )
            // InternalHTMLbuild.g:684:1: ( () )
            {
            // InternalHTMLbuild.g:684:1: ( () )
            // InternalHTMLbuild.g:685:2: ()
            {
             before(grammarAccess.getTextAccess().getTextAction_0()); 
            // InternalHTMLbuild.g:686:2: ()
            // InternalHTMLbuild.g:686:3: 
            {
            }

             after(grammarAccess.getTextAccess().getTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalHTMLbuild.g:694:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:698:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalHTMLbuild.g:699:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalHTMLbuild.g:706:1: rule__Text__Group__1__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:710:1: ( ( 'Text' ) )
            // InternalHTMLbuild.g:711:1: ( 'Text' )
            {
            // InternalHTMLbuild.g:711:1: ( 'Text' )
            // InternalHTMLbuild.g:712:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalHTMLbuild.g:721:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:725:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalHTMLbuild.g:726:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalHTMLbuild.g:733:1: rule__Text__Group__2__Impl : ( ( rule__Text__NameAssignment_2 )? ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:737:1: ( ( ( rule__Text__NameAssignment_2 )? ) )
            // InternalHTMLbuild.g:738:1: ( ( rule__Text__NameAssignment_2 )? )
            {
            // InternalHTMLbuild.g:738:1: ( ( rule__Text__NameAssignment_2 )? )
            // InternalHTMLbuild.g:739:2: ( rule__Text__NameAssignment_2 )?
            {
             before(grammarAccess.getTextAccess().getNameAssignment_2()); 
            // InternalHTMLbuild.g:740:2: ( rule__Text__NameAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHTMLbuild.g:740:3: rule__Text__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalHTMLbuild.g:748:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:752:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalHTMLbuild.g:753:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalHTMLbuild.g:760:1: rule__Text__Group__3__Impl : ( ':' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:764:1: ( ( ':' ) )
            // InternalHTMLbuild.g:765:1: ( ':' )
            {
            // InternalHTMLbuild.g:765:1: ( ':' )
            // InternalHTMLbuild.g:766:2: ':'
            {
             before(grammarAccess.getTextAccess().getColonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__4"
    // InternalHTMLbuild.g:775:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:779:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalHTMLbuild.g:780:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalHTMLbuild.g:787:1: rule__Text__Group__4__Impl : ( ( rule__Text__Alternatives_4 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:791:1: ( ( ( rule__Text__Alternatives_4 )? ) )
            // InternalHTMLbuild.g:792:1: ( ( rule__Text__Alternatives_4 )? )
            {
            // InternalHTMLbuild.g:792:1: ( ( rule__Text__Alternatives_4 )? )
            // InternalHTMLbuild.g:793:2: ( rule__Text__Alternatives_4 )?
            {
             before(grammarAccess.getTextAccess().getAlternatives_4()); 
            // InternalHTMLbuild.g:794:2: ( rule__Text__Alternatives_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHTMLbuild.g:794:3: rule__Text__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__5"
    // InternalHTMLbuild.g:802:1: rule__Text__Group__5 : rule__Text__Group__5__Impl ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:806:1: ( rule__Text__Group__5__Impl )
            // InternalHTMLbuild.g:807:2: rule__Text__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5"


    // $ANTLR start "rule__Text__Group__5__Impl"
    // InternalHTMLbuild.g:813:1: rule__Text__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:817:1: ( ( RULE_STRING ) )
            // InternalHTMLbuild.g:818:1: ( RULE_STRING )
            {
            // InternalHTMLbuild.g:818:1: ( RULE_STRING )
            // InternalHTMLbuild.g:819:2: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall_5()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalHTMLbuild.g:829:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:833:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalHTMLbuild.g:834:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalHTMLbuild.g:841:1: rule__Image__Group__0__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:845:1: ( ( 'Image' ) )
            // InternalHTMLbuild.g:846:1: ( 'Image' )
            {
            // InternalHTMLbuild.g:846:1: ( 'Image' )
            // InternalHTMLbuild.g:847:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalHTMLbuild.g:856:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:860:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalHTMLbuild.g:861:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalHTMLbuild.g:868:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:872:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalHTMLbuild.g:873:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalHTMLbuild.g:873:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalHTMLbuild.g:874:2: ( rule__Image__NameAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            // InternalHTMLbuild.g:875:2: ( rule__Image__NameAssignment_1 )
            // InternalHTMLbuild.g:875:3: rule__Image__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalHTMLbuild.g:883:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:887:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalHTMLbuild.g:888:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalHTMLbuild.g:895:1: rule__Image__Group__2__Impl : ( ':' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:899:1: ( ( ':' ) )
            // InternalHTMLbuild.g:900:1: ( ':' )
            {
            // InternalHTMLbuild.g:900:1: ( ':' )
            // InternalHTMLbuild.g:901:2: ':'
            {
             before(grammarAccess.getImageAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalHTMLbuild.g:910:1: rule__Image__Group__3 : rule__Image__Group__3__Impl ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:914:1: ( rule__Image__Group__3__Impl )
            // InternalHTMLbuild.g:915:2: rule__Image__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalHTMLbuild.g:921:1: rule__Image__Group__3__Impl : ( ( rule__Image__Alternatives_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:925:1: ( ( ( rule__Image__Alternatives_3 ) ) )
            // InternalHTMLbuild.g:926:1: ( ( rule__Image__Alternatives_3 ) )
            {
            // InternalHTMLbuild.g:926:1: ( ( rule__Image__Alternatives_3 ) )
            // InternalHTMLbuild.g:927:2: ( rule__Image__Alternatives_3 )
            {
             before(grammarAccess.getImageAccess().getAlternatives_3()); 
            // InternalHTMLbuild.g:928:2: ( rule__Image__Alternatives_3 )
            // InternalHTMLbuild.g:928:3: rule__Image__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Image__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalHTMLbuild.g:937:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:941:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalHTMLbuild.g:942:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalHTMLbuild.g:949:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:953:1: ( ( 'Link' ) )
            // InternalHTMLbuild.g:954:1: ( 'Link' )
            {
            // InternalHTMLbuild.g:954:1: ( 'Link' )
            // InternalHTMLbuild.g:955:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalHTMLbuild.g:964:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:968:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalHTMLbuild.g:969:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalHTMLbuild.g:976:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 )? ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:980:1: ( ( ( rule__Link__NameAssignment_1 )? ) )
            // InternalHTMLbuild.g:981:1: ( ( rule__Link__NameAssignment_1 )? )
            {
            // InternalHTMLbuild.g:981:1: ( ( rule__Link__NameAssignment_1 )? )
            // InternalHTMLbuild.g:982:2: ( rule__Link__NameAssignment_1 )?
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalHTMLbuild.g:983:2: ( rule__Link__NameAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHTMLbuild.g:983:3: rule__Link__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalHTMLbuild.g:991:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:995:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalHTMLbuild.g:996:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalHTMLbuild.g:1003:1: rule__Link__Group__2__Impl : ( ':' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1007:1: ( ( ':' ) )
            // InternalHTMLbuild.g:1008:1: ( ':' )
            {
            // InternalHTMLbuild.g:1008:1: ( ':' )
            // InternalHTMLbuild.g:1009:2: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalHTMLbuild.g:1018:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1022:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalHTMLbuild.g:1023:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalHTMLbuild.g:1030:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1034:1: ( ( ( rule__Link__Alternatives_3 ) ) )
            // InternalHTMLbuild.g:1035:1: ( ( rule__Link__Alternatives_3 ) )
            {
            // InternalHTMLbuild.g:1035:1: ( ( rule__Link__Alternatives_3 ) )
            // InternalHTMLbuild.g:1036:2: ( rule__Link__Alternatives_3 )
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalHTMLbuild.g:1037:2: ( rule__Link__Alternatives_3 )
            // InternalHTMLbuild.g:1037:3: rule__Link__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalHTMLbuild.g:1045:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1049:1: ( rule__Link__Group__4__Impl )
            // InternalHTMLbuild.g:1050:2: rule__Link__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalHTMLbuild.g:1056:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1060:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalHTMLbuild.g:1061:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalHTMLbuild.g:1061:1: ( ( rule__Link__Group_4__0 )? )
            // InternalHTMLbuild.g:1062:2: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalHTMLbuild.g:1063:2: ( rule__Link__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHTMLbuild.g:1063:3: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalHTMLbuild.g:1072:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1076:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalHTMLbuild.g:1077:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0"


    // $ANTLR start "rule__Link__Group_4__0__Impl"
    // InternalHTMLbuild.g:1084:1: rule__Link__Group_4__0__Impl : ( 'linktext' ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1088:1: ( ( 'linktext' ) )
            // InternalHTMLbuild.g:1089:1: ( 'linktext' )
            {
            // InternalHTMLbuild.g:1089:1: ( 'linktext' )
            // InternalHTMLbuild.g:1090:2: 'linktext'
            {
             before(grammarAccess.getLinkAccess().getLinktextKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinktextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0__Impl"


    // $ANTLR start "rule__Link__Group_4__1"
    // InternalHTMLbuild.g:1099:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1103:1: ( rule__Link__Group_4__1__Impl )
            // InternalHTMLbuild.g:1104:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1"


    // $ANTLR start "rule__Link__Group_4__1__Impl"
    // InternalHTMLbuild.g:1110:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__LinktextAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1114:1: ( ( ( rule__Link__LinktextAssignment_4_1 ) ) )
            // InternalHTMLbuild.g:1115:1: ( ( rule__Link__LinktextAssignment_4_1 ) )
            {
            // InternalHTMLbuild.g:1115:1: ( ( rule__Link__LinktextAssignment_4_1 ) )
            // InternalHTMLbuild.g:1116:2: ( rule__Link__LinktextAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getLinktextAssignment_4_1()); 
            // InternalHTMLbuild.g:1117:2: ( rule__Link__LinktextAssignment_4_1 )
            // InternalHTMLbuild.g:1117:3: rule__Link__LinktextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__LinktextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinktextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1__Impl"


    // $ANTLR start "rule__Div__Group__0"
    // InternalHTMLbuild.g:1126:1: rule__Div__Group__0 : rule__Div__Group__0__Impl rule__Div__Group__1 ;
    public final void rule__Div__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1130:1: ( rule__Div__Group__0__Impl rule__Div__Group__1 )
            // InternalHTMLbuild.g:1131:2: rule__Div__Group__0__Impl rule__Div__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Div__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Div__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__0"


    // $ANTLR start "rule__Div__Group__0__Impl"
    // InternalHTMLbuild.g:1138:1: rule__Div__Group__0__Impl : ( ( rule__Div__Div_idAssignment_0 )? ) ;
    public final void rule__Div__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1142:1: ( ( ( rule__Div__Div_idAssignment_0 )? ) )
            // InternalHTMLbuild.g:1143:1: ( ( rule__Div__Div_idAssignment_0 )? )
            {
            // InternalHTMLbuild.g:1143:1: ( ( rule__Div__Div_idAssignment_0 )? )
            // InternalHTMLbuild.g:1144:2: ( rule__Div__Div_idAssignment_0 )?
            {
             before(grammarAccess.getDivAccess().getDiv_idAssignment_0()); 
            // InternalHTMLbuild.g:1145:2: ( rule__Div__Div_idAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHTMLbuild.g:1145:3: rule__Div__Div_idAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Div__Div_idAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDivAccess().getDiv_idAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__0__Impl"


    // $ANTLR start "rule__Div__Group__1"
    // InternalHTMLbuild.g:1153:1: rule__Div__Group__1 : rule__Div__Group__1__Impl rule__Div__Group__2 ;
    public final void rule__Div__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1157:1: ( rule__Div__Group__1__Impl rule__Div__Group__2 )
            // InternalHTMLbuild.g:1158:2: rule__Div__Group__1__Impl rule__Div__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Div__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Div__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__1"


    // $ANTLR start "rule__Div__Group__1__Impl"
    // InternalHTMLbuild.g:1165:1: rule__Div__Group__1__Impl : ( '{' ) ;
    public final void rule__Div__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1169:1: ( ( '{' ) )
            // InternalHTMLbuild.g:1170:1: ( '{' )
            {
            // InternalHTMLbuild.g:1170:1: ( '{' )
            // InternalHTMLbuild.g:1171:2: '{'
            {
             before(grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__1__Impl"


    // $ANTLR start "rule__Div__Group__2"
    // InternalHTMLbuild.g:1180:1: rule__Div__Group__2 : rule__Div__Group__2__Impl rule__Div__Group__3 ;
    public final void rule__Div__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1184:1: ( rule__Div__Group__2__Impl rule__Div__Group__3 )
            // InternalHTMLbuild.g:1185:2: rule__Div__Group__2__Impl rule__Div__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Div__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Div__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__2"


    // $ANTLR start "rule__Div__Group__2__Impl"
    // InternalHTMLbuild.g:1192:1: rule__Div__Group__2__Impl : ( ( rule__Div__DivelementsAssignment_2 ) ) ;
    public final void rule__Div__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1196:1: ( ( ( rule__Div__DivelementsAssignment_2 ) ) )
            // InternalHTMLbuild.g:1197:1: ( ( rule__Div__DivelementsAssignment_2 ) )
            {
            // InternalHTMLbuild.g:1197:1: ( ( rule__Div__DivelementsAssignment_2 ) )
            // InternalHTMLbuild.g:1198:2: ( rule__Div__DivelementsAssignment_2 )
            {
             before(grammarAccess.getDivAccess().getDivelementsAssignment_2()); 
            // InternalHTMLbuild.g:1199:2: ( rule__Div__DivelementsAssignment_2 )
            // InternalHTMLbuild.g:1199:3: rule__Div__DivelementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Div__DivelementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getDivelementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__2__Impl"


    // $ANTLR start "rule__Div__Group__3"
    // InternalHTMLbuild.g:1207:1: rule__Div__Group__3 : rule__Div__Group__3__Impl rule__Div__Group__4 ;
    public final void rule__Div__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1211:1: ( rule__Div__Group__3__Impl rule__Div__Group__4 )
            // InternalHTMLbuild.g:1212:2: rule__Div__Group__3__Impl rule__Div__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Div__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Div__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__3"


    // $ANTLR start "rule__Div__Group__3__Impl"
    // InternalHTMLbuild.g:1219:1: rule__Div__Group__3__Impl : ( ( rule__Div__Group_3__0 )* ) ;
    public final void rule__Div__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1223:1: ( ( ( rule__Div__Group_3__0 )* ) )
            // InternalHTMLbuild.g:1224:1: ( ( rule__Div__Group_3__0 )* )
            {
            // InternalHTMLbuild.g:1224:1: ( ( rule__Div__Group_3__0 )* )
            // InternalHTMLbuild.g:1225:2: ( rule__Div__Group_3__0 )*
            {
             before(grammarAccess.getDivAccess().getGroup_3()); 
            // InternalHTMLbuild.g:1226:2: ( rule__Div__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19||LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHTMLbuild.g:1226:3: rule__Div__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Div__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDivAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__3__Impl"


    // $ANTLR start "rule__Div__Group__4"
    // InternalHTMLbuild.g:1234:1: rule__Div__Group__4 : rule__Div__Group__4__Impl ;
    public final void rule__Div__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1238:1: ( rule__Div__Group__4__Impl )
            // InternalHTMLbuild.g:1239:2: rule__Div__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Div__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__4"


    // $ANTLR start "rule__Div__Group__4__Impl"
    // InternalHTMLbuild.g:1245:1: rule__Div__Group__4__Impl : ( '}' ) ;
    public final void rule__Div__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1249:1: ( ( '}' ) )
            // InternalHTMLbuild.g:1250:1: ( '}' )
            {
            // InternalHTMLbuild.g:1250:1: ( '}' )
            // InternalHTMLbuild.g:1251:2: '}'
            {
             before(grammarAccess.getDivAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDivAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group__4__Impl"


    // $ANTLR start "rule__Div__Group_3__0"
    // InternalHTMLbuild.g:1261:1: rule__Div__Group_3__0 : rule__Div__Group_3__0__Impl rule__Div__Group_3__1 ;
    public final void rule__Div__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1265:1: ( rule__Div__Group_3__0__Impl rule__Div__Group_3__1 )
            // InternalHTMLbuild.g:1266:2: rule__Div__Group_3__0__Impl rule__Div__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Div__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Div__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group_3__0"


    // $ANTLR start "rule__Div__Group_3__0__Impl"
    // InternalHTMLbuild.g:1273:1: rule__Div__Group_3__0__Impl : ( ( rule__Div__SeparatorsAssignment_3_0 ) ) ;
    public final void rule__Div__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1277:1: ( ( ( rule__Div__SeparatorsAssignment_3_0 ) ) )
            // InternalHTMLbuild.g:1278:1: ( ( rule__Div__SeparatorsAssignment_3_0 ) )
            {
            // InternalHTMLbuild.g:1278:1: ( ( rule__Div__SeparatorsAssignment_3_0 ) )
            // InternalHTMLbuild.g:1279:2: ( rule__Div__SeparatorsAssignment_3_0 )
            {
             before(grammarAccess.getDivAccess().getSeparatorsAssignment_3_0()); 
            // InternalHTMLbuild.g:1280:2: ( rule__Div__SeparatorsAssignment_3_0 )
            // InternalHTMLbuild.g:1280:3: rule__Div__SeparatorsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Div__SeparatorsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getSeparatorsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group_3__0__Impl"


    // $ANTLR start "rule__Div__Group_3__1"
    // InternalHTMLbuild.g:1288:1: rule__Div__Group_3__1 : rule__Div__Group_3__1__Impl ;
    public final void rule__Div__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1292:1: ( rule__Div__Group_3__1__Impl )
            // InternalHTMLbuild.g:1293:2: rule__Div__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Div__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group_3__1"


    // $ANTLR start "rule__Div__Group_3__1__Impl"
    // InternalHTMLbuild.g:1299:1: rule__Div__Group_3__1__Impl : ( ( rule__Div__DivelementsAssignment_3_1 ) ) ;
    public final void rule__Div__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1303:1: ( ( ( rule__Div__DivelementsAssignment_3_1 ) ) )
            // InternalHTMLbuild.g:1304:1: ( ( rule__Div__DivelementsAssignment_3_1 ) )
            {
            // InternalHTMLbuild.g:1304:1: ( ( rule__Div__DivelementsAssignment_3_1 ) )
            // InternalHTMLbuild.g:1305:2: ( rule__Div__DivelementsAssignment_3_1 )
            {
             before(grammarAccess.getDivAccess().getDivelementsAssignment_3_1()); 
            // InternalHTMLbuild.g:1306:2: ( rule__Div__DivelementsAssignment_3_1 )
            // InternalHTMLbuild.g:1306:3: rule__Div__DivelementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Div__DivelementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getDivelementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Group_3__1__Impl"


    // $ANTLR start "rule__Next__Group__0"
    // InternalHTMLbuild.g:1315:1: rule__Next__Group__0 : rule__Next__Group__0__Impl rule__Next__Group__1 ;
    public final void rule__Next__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1319:1: ( rule__Next__Group__0__Impl rule__Next__Group__1 )
            // InternalHTMLbuild.g:1320:2: rule__Next__Group__0__Impl rule__Next__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Next__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__0"


    // $ANTLR start "rule__Next__Group__0__Impl"
    // InternalHTMLbuild.g:1327:1: rule__Next__Group__0__Impl : ( () ) ;
    public final void rule__Next__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1331:1: ( ( () ) )
            // InternalHTMLbuild.g:1332:1: ( () )
            {
            // InternalHTMLbuild.g:1332:1: ( () )
            // InternalHTMLbuild.g:1333:2: ()
            {
             before(grammarAccess.getNextAccess().getNextAction_0()); 
            // InternalHTMLbuild.g:1334:2: ()
            // InternalHTMLbuild.g:1334:3: 
            {
            }

             after(grammarAccess.getNextAccess().getNextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__0__Impl"


    // $ANTLR start "rule__Next__Group__1"
    // InternalHTMLbuild.g:1342:1: rule__Next__Group__1 : rule__Next__Group__1__Impl rule__Next__Group__2 ;
    public final void rule__Next__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1346:1: ( rule__Next__Group__1__Impl rule__Next__Group__2 )
            // InternalHTMLbuild.g:1347:2: rule__Next__Group__1__Impl rule__Next__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Next__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__1"


    // $ANTLR start "rule__Next__Group__1__Impl"
    // InternalHTMLbuild.g:1354:1: rule__Next__Group__1__Impl : ( '<next' ) ;
    public final void rule__Next__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1358:1: ( ( '<next' ) )
            // InternalHTMLbuild.g:1359:1: ( '<next' )
            {
            // InternalHTMLbuild.g:1359:1: ( '<next' )
            // InternalHTMLbuild.g:1360:2: '<next'
            {
             before(grammarAccess.getNextAccess().getNextKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getNextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__1__Impl"


    // $ANTLR start "rule__Next__Group__2"
    // InternalHTMLbuild.g:1369:1: rule__Next__Group__2 : rule__Next__Group__2__Impl rule__Next__Group__3 ;
    public final void rule__Next__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1373:1: ( rule__Next__Group__2__Impl rule__Next__Group__3 )
            // InternalHTMLbuild.g:1374:2: rule__Next__Group__2__Impl rule__Next__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Next__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__2"


    // $ANTLR start "rule__Next__Group__2__Impl"
    // InternalHTMLbuild.g:1381:1: rule__Next__Group__2__Impl : ( ( rule__Next__Group_2__0 )? ) ;
    public final void rule__Next__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1385:1: ( ( ( rule__Next__Group_2__0 )? ) )
            // InternalHTMLbuild.g:1386:1: ( ( rule__Next__Group_2__0 )? )
            {
            // InternalHTMLbuild.g:1386:1: ( ( rule__Next__Group_2__0 )? )
            // InternalHTMLbuild.g:1387:2: ( rule__Next__Group_2__0 )?
            {
             before(grammarAccess.getNextAccess().getGroup_2()); 
            // InternalHTMLbuild.g:1388:2: ( rule__Next__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHTMLbuild.g:1388:3: rule__Next__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Next__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNextAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__2__Impl"


    // $ANTLR start "rule__Next__Group__3"
    // InternalHTMLbuild.g:1396:1: rule__Next__Group__3 : rule__Next__Group__3__Impl ;
    public final void rule__Next__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1400:1: ( rule__Next__Group__3__Impl )
            // InternalHTMLbuild.g:1401:2: rule__Next__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Next__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__3"


    // $ANTLR start "rule__Next__Group__3__Impl"
    // InternalHTMLbuild.g:1407:1: rule__Next__Group__3__Impl : ( '>' ) ;
    public final void rule__Next__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1411:1: ( ( '>' ) )
            // InternalHTMLbuild.g:1412:1: ( '>' )
            {
            // InternalHTMLbuild.g:1412:1: ( '>' )
            // InternalHTMLbuild.g:1413:2: '>'
            {
             before(grammarAccess.getNextAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__3__Impl"


    // $ANTLR start "rule__Next__Group_2__0"
    // InternalHTMLbuild.g:1423:1: rule__Next__Group_2__0 : rule__Next__Group_2__0__Impl rule__Next__Group_2__1 ;
    public final void rule__Next__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1427:1: ( rule__Next__Group_2__0__Impl rule__Next__Group_2__1 )
            // InternalHTMLbuild.g:1428:2: rule__Next__Group_2__0__Impl rule__Next__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Next__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__0"


    // $ANTLR start "rule__Next__Group_2__0__Impl"
    // InternalHTMLbuild.g:1435:1: rule__Next__Group_2__0__Impl : ( ( rule__Next__HasratioAssignment_2_0 ) ) ;
    public final void rule__Next__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1439:1: ( ( ( rule__Next__HasratioAssignment_2_0 ) ) )
            // InternalHTMLbuild.g:1440:1: ( ( rule__Next__HasratioAssignment_2_0 ) )
            {
            // InternalHTMLbuild.g:1440:1: ( ( rule__Next__HasratioAssignment_2_0 ) )
            // InternalHTMLbuild.g:1441:2: ( rule__Next__HasratioAssignment_2_0 )
            {
             before(grammarAccess.getNextAccess().getHasratioAssignment_2_0()); 
            // InternalHTMLbuild.g:1442:2: ( rule__Next__HasratioAssignment_2_0 )
            // InternalHTMLbuild.g:1442:3: rule__Next__HasratioAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Next__HasratioAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getHasratioAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__0__Impl"


    // $ANTLR start "rule__Next__Group_2__1"
    // InternalHTMLbuild.g:1450:1: rule__Next__Group_2__1 : rule__Next__Group_2__1__Impl rule__Next__Group_2__2 ;
    public final void rule__Next__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1454:1: ( rule__Next__Group_2__1__Impl rule__Next__Group_2__2 )
            // InternalHTMLbuild.g:1455:2: rule__Next__Group_2__1__Impl rule__Next__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Next__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__1"


    // $ANTLR start "rule__Next__Group_2__1__Impl"
    // InternalHTMLbuild.g:1462:1: rule__Next__Group_2__1__Impl : ( ( rule__Next__Group_2_1__0 )? ) ;
    public final void rule__Next__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1466:1: ( ( ( rule__Next__Group_2_1__0 )? ) )
            // InternalHTMLbuild.g:1467:1: ( ( rule__Next__Group_2_1__0 )? )
            {
            // InternalHTMLbuild.g:1467:1: ( ( rule__Next__Group_2_1__0 )? )
            // InternalHTMLbuild.g:1468:2: ( rule__Next__Group_2_1__0 )?
            {
             before(grammarAccess.getNextAccess().getGroup_2_1()); 
            // InternalHTMLbuild.g:1469:2: ( rule__Next__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==22) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalHTMLbuild.g:1469:3: rule__Next__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Next__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNextAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__1__Impl"


    // $ANTLR start "rule__Next__Group_2__2"
    // InternalHTMLbuild.g:1477:1: rule__Next__Group_2__2 : rule__Next__Group_2__2__Impl rule__Next__Group_2__3 ;
    public final void rule__Next__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1481:1: ( rule__Next__Group_2__2__Impl rule__Next__Group_2__3 )
            // InternalHTMLbuild.g:1482:2: rule__Next__Group_2__2__Impl rule__Next__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__Next__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__2"


    // $ANTLR start "rule__Next__Group_2__2__Impl"
    // InternalHTMLbuild.g:1489:1: rule__Next__Group_2__2__Impl : ( ( rule__Next__RatiosAssignment_2_2 ) ) ;
    public final void rule__Next__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1493:1: ( ( ( rule__Next__RatiosAssignment_2_2 ) ) )
            // InternalHTMLbuild.g:1494:1: ( ( rule__Next__RatiosAssignment_2_2 ) )
            {
            // InternalHTMLbuild.g:1494:1: ( ( rule__Next__RatiosAssignment_2_2 ) )
            // InternalHTMLbuild.g:1495:2: ( rule__Next__RatiosAssignment_2_2 )
            {
             before(grammarAccess.getNextAccess().getRatiosAssignment_2_2()); 
            // InternalHTMLbuild.g:1496:2: ( rule__Next__RatiosAssignment_2_2 )
            // InternalHTMLbuild.g:1496:3: rule__Next__RatiosAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Next__RatiosAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getRatiosAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__2__Impl"


    // $ANTLR start "rule__Next__Group_2__3"
    // InternalHTMLbuild.g:1504:1: rule__Next__Group_2__3 : rule__Next__Group_2__3__Impl ;
    public final void rule__Next__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1508:1: ( rule__Next__Group_2__3__Impl )
            // InternalHTMLbuild.g:1509:2: rule__Next__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Next__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__3"


    // $ANTLR start "rule__Next__Group_2__3__Impl"
    // InternalHTMLbuild.g:1515:1: rule__Next__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Next__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1519:1: ( ( ')' ) )
            // InternalHTMLbuild.g:1520:1: ( ')' )
            {
            // InternalHTMLbuild.g:1520:1: ( ')' )
            // InternalHTMLbuild.g:1521:2: ')'
            {
             before(grammarAccess.getNextAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2__3__Impl"


    // $ANTLR start "rule__Next__Group_2_1__0"
    // InternalHTMLbuild.g:1531:1: rule__Next__Group_2_1__0 : rule__Next__Group_2_1__0__Impl rule__Next__Group_2_1__1 ;
    public final void rule__Next__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1535:1: ( rule__Next__Group_2_1__0__Impl rule__Next__Group_2_1__1 )
            // InternalHTMLbuild.g:1536:2: rule__Next__Group_2_1__0__Impl rule__Next__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Next__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Next__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2_1__0"


    // $ANTLR start "rule__Next__Group_2_1__0__Impl"
    // InternalHTMLbuild.g:1543:1: rule__Next__Group_2_1__0__Impl : ( ( rule__Next__RatiosAssignment_2_1_0 ) ) ;
    public final void rule__Next__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1547:1: ( ( ( rule__Next__RatiosAssignment_2_1_0 ) ) )
            // InternalHTMLbuild.g:1548:1: ( ( rule__Next__RatiosAssignment_2_1_0 ) )
            {
            // InternalHTMLbuild.g:1548:1: ( ( rule__Next__RatiosAssignment_2_1_0 ) )
            // InternalHTMLbuild.g:1549:2: ( rule__Next__RatiosAssignment_2_1_0 )
            {
             before(grammarAccess.getNextAccess().getRatiosAssignment_2_1_0()); 
            // InternalHTMLbuild.g:1550:2: ( rule__Next__RatiosAssignment_2_1_0 )
            // InternalHTMLbuild.g:1550:3: rule__Next__RatiosAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Next__RatiosAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getRatiosAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2_1__0__Impl"


    // $ANTLR start "rule__Next__Group_2_1__1"
    // InternalHTMLbuild.g:1558:1: rule__Next__Group_2_1__1 : rule__Next__Group_2_1__1__Impl ;
    public final void rule__Next__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1562:1: ( rule__Next__Group_2_1__1__Impl )
            // InternalHTMLbuild.g:1563:2: rule__Next__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Next__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2_1__1"


    // $ANTLR start "rule__Next__Group_2_1__1__Impl"
    // InternalHTMLbuild.g:1569:1: rule__Next__Group_2_1__1__Impl : ( '/' ) ;
    public final void rule__Next__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1573:1: ( ( '/' ) )
            // InternalHTMLbuild.g:1574:1: ( '/' )
            {
            // InternalHTMLbuild.g:1574:1: ( '/' )
            // InternalHTMLbuild.g:1575:2: '/'
            {
             before(grammarAccess.getNextAccess().getSolidusKeyword_2_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getSolidusKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group_2_1__1__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalHTMLbuild.g:1585:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1589:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalHTMLbuild.g:1590:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalHTMLbuild.g:1597:1: rule__Then__Group__0__Impl : ( () ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1601:1: ( ( () ) )
            // InternalHTMLbuild.g:1602:1: ( () )
            {
            // InternalHTMLbuild.g:1602:1: ( () )
            // InternalHTMLbuild.g:1603:2: ()
            {
             before(grammarAccess.getThenAccess().getThenAction_0()); 
            // InternalHTMLbuild.g:1604:2: ()
            // InternalHTMLbuild.g:1604:3: 
            {
            }

             after(grammarAccess.getThenAccess().getThenAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalHTMLbuild.g:1612:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1616:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalHTMLbuild.g:1617:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Then__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalHTMLbuild.g:1624:1: rule__Then__Group__1__Impl : ( '<then' ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1628:1: ( ( '<then' ) )
            // InternalHTMLbuild.g:1629:1: ( '<then' )
            {
            // InternalHTMLbuild.g:1629:1: ( '<then' )
            // InternalHTMLbuild.g:1630:2: '<then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__2"
    // InternalHTMLbuild.g:1639:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1643:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalHTMLbuild.g:1644:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Then__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__2"


    // $ANTLR start "rule__Then__Group__2__Impl"
    // InternalHTMLbuild.g:1651:1: rule__Then__Group__2__Impl : ( ( rule__Then__Group_2__0 )? ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1655:1: ( ( ( rule__Then__Group_2__0 )? ) )
            // InternalHTMLbuild.g:1656:1: ( ( rule__Then__Group_2__0 )? )
            {
            // InternalHTMLbuild.g:1656:1: ( ( rule__Then__Group_2__0 )? )
            // InternalHTMLbuild.g:1657:2: ( rule__Then__Group_2__0 )?
            {
             before(grammarAccess.getThenAccess().getGroup_2()); 
            // InternalHTMLbuild.g:1658:2: ( rule__Then__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHTMLbuild.g:1658:3: rule__Then__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__2__Impl"


    // $ANTLR start "rule__Then__Group__3"
    // InternalHTMLbuild.g:1666:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1670:1: ( rule__Then__Group__3__Impl )
            // InternalHTMLbuild.g:1671:2: rule__Then__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__3"


    // $ANTLR start "rule__Then__Group__3__Impl"
    // InternalHTMLbuild.g:1677:1: rule__Then__Group__3__Impl : ( '>' ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1681:1: ( ( '>' ) )
            // InternalHTMLbuild.g:1682:1: ( '>' )
            {
            // InternalHTMLbuild.g:1682:1: ( '>' )
            // InternalHTMLbuild.g:1683:2: '>'
            {
             before(grammarAccess.getThenAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__3__Impl"


    // $ANTLR start "rule__Then__Group_2__0"
    // InternalHTMLbuild.g:1693:1: rule__Then__Group_2__0 : rule__Then__Group_2__0__Impl rule__Then__Group_2__1 ;
    public final void rule__Then__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1697:1: ( rule__Then__Group_2__0__Impl rule__Then__Group_2__1 )
            // InternalHTMLbuild.g:1698:2: rule__Then__Group_2__0__Impl rule__Then__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Then__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__0"


    // $ANTLR start "rule__Then__Group_2__0__Impl"
    // InternalHTMLbuild.g:1705:1: rule__Then__Group_2__0__Impl : ( ( rule__Then__HasratioAssignment_2_0 ) ) ;
    public final void rule__Then__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1709:1: ( ( ( rule__Then__HasratioAssignment_2_0 ) ) )
            // InternalHTMLbuild.g:1710:1: ( ( rule__Then__HasratioAssignment_2_0 ) )
            {
            // InternalHTMLbuild.g:1710:1: ( ( rule__Then__HasratioAssignment_2_0 ) )
            // InternalHTMLbuild.g:1711:2: ( rule__Then__HasratioAssignment_2_0 )
            {
             before(grammarAccess.getThenAccess().getHasratioAssignment_2_0()); 
            // InternalHTMLbuild.g:1712:2: ( rule__Then__HasratioAssignment_2_0 )
            // InternalHTMLbuild.g:1712:3: rule__Then__HasratioAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Then__HasratioAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getHasratioAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__0__Impl"


    // $ANTLR start "rule__Then__Group_2__1"
    // InternalHTMLbuild.g:1720:1: rule__Then__Group_2__1 : rule__Then__Group_2__1__Impl rule__Then__Group_2__2 ;
    public final void rule__Then__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1724:1: ( rule__Then__Group_2__1__Impl rule__Then__Group_2__2 )
            // InternalHTMLbuild.g:1725:2: rule__Then__Group_2__1__Impl rule__Then__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Then__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__1"


    // $ANTLR start "rule__Then__Group_2__1__Impl"
    // InternalHTMLbuild.g:1732:1: rule__Then__Group_2__1__Impl : ( ( rule__Then__Group_2_1__0 )? ) ;
    public final void rule__Then__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1736:1: ( ( ( rule__Then__Group_2_1__0 )? ) )
            // InternalHTMLbuild.g:1737:1: ( ( rule__Then__Group_2_1__0 )? )
            {
            // InternalHTMLbuild.g:1737:1: ( ( rule__Then__Group_2_1__0 )? )
            // InternalHTMLbuild.g:1738:2: ( rule__Then__Group_2_1__0 )?
            {
             before(grammarAccess.getThenAccess().getGroup_2_1()); 
            // InternalHTMLbuild.g:1739:2: ( rule__Then__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==22) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalHTMLbuild.g:1739:3: rule__Then__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__1__Impl"


    // $ANTLR start "rule__Then__Group_2__2"
    // InternalHTMLbuild.g:1747:1: rule__Then__Group_2__2 : rule__Then__Group_2__2__Impl rule__Then__Group_2__3 ;
    public final void rule__Then__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1751:1: ( rule__Then__Group_2__2__Impl rule__Then__Group_2__3 )
            // InternalHTMLbuild.g:1752:2: rule__Then__Group_2__2__Impl rule__Then__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__Then__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__2"


    // $ANTLR start "rule__Then__Group_2__2__Impl"
    // InternalHTMLbuild.g:1759:1: rule__Then__Group_2__2__Impl : ( ( rule__Then__RatiosAssignment_2_2 ) ) ;
    public final void rule__Then__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1763:1: ( ( ( rule__Then__RatiosAssignment_2_2 ) ) )
            // InternalHTMLbuild.g:1764:1: ( ( rule__Then__RatiosAssignment_2_2 ) )
            {
            // InternalHTMLbuild.g:1764:1: ( ( rule__Then__RatiosAssignment_2_2 ) )
            // InternalHTMLbuild.g:1765:2: ( rule__Then__RatiosAssignment_2_2 )
            {
             before(grammarAccess.getThenAccess().getRatiosAssignment_2_2()); 
            // InternalHTMLbuild.g:1766:2: ( rule__Then__RatiosAssignment_2_2 )
            // InternalHTMLbuild.g:1766:3: rule__Then__RatiosAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Then__RatiosAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getRatiosAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__2__Impl"


    // $ANTLR start "rule__Then__Group_2__3"
    // InternalHTMLbuild.g:1774:1: rule__Then__Group_2__3 : rule__Then__Group_2__3__Impl ;
    public final void rule__Then__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1778:1: ( rule__Then__Group_2__3__Impl )
            // InternalHTMLbuild.g:1779:2: rule__Then__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__3"


    // $ANTLR start "rule__Then__Group_2__3__Impl"
    // InternalHTMLbuild.g:1785:1: rule__Then__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Then__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1789:1: ( ( ')' ) )
            // InternalHTMLbuild.g:1790:1: ( ')' )
            {
            // InternalHTMLbuild.g:1790:1: ( ')' )
            // InternalHTMLbuild.g:1791:2: ')'
            {
             before(grammarAccess.getThenAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2__3__Impl"


    // $ANTLR start "rule__Then__Group_2_1__0"
    // InternalHTMLbuild.g:1801:1: rule__Then__Group_2_1__0 : rule__Then__Group_2_1__0__Impl rule__Then__Group_2_1__1 ;
    public final void rule__Then__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1805:1: ( rule__Then__Group_2_1__0__Impl rule__Then__Group_2_1__1 )
            // InternalHTMLbuild.g:1806:2: rule__Then__Group_2_1__0__Impl rule__Then__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Then__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2_1__0"


    // $ANTLR start "rule__Then__Group_2_1__0__Impl"
    // InternalHTMLbuild.g:1813:1: rule__Then__Group_2_1__0__Impl : ( ( rule__Then__RatiosAssignment_2_1_0 ) ) ;
    public final void rule__Then__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1817:1: ( ( ( rule__Then__RatiosAssignment_2_1_0 ) ) )
            // InternalHTMLbuild.g:1818:1: ( ( rule__Then__RatiosAssignment_2_1_0 ) )
            {
            // InternalHTMLbuild.g:1818:1: ( ( rule__Then__RatiosAssignment_2_1_0 ) )
            // InternalHTMLbuild.g:1819:2: ( rule__Then__RatiosAssignment_2_1_0 )
            {
             before(grammarAccess.getThenAccess().getRatiosAssignment_2_1_0()); 
            // InternalHTMLbuild.g:1820:2: ( rule__Then__RatiosAssignment_2_1_0 )
            // InternalHTMLbuild.g:1820:3: rule__Then__RatiosAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Then__RatiosAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getRatiosAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2_1__0__Impl"


    // $ANTLR start "rule__Then__Group_2_1__1"
    // InternalHTMLbuild.g:1828:1: rule__Then__Group_2_1__1 : rule__Then__Group_2_1__1__Impl ;
    public final void rule__Then__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1832:1: ( rule__Then__Group_2_1__1__Impl )
            // InternalHTMLbuild.g:1833:2: rule__Then__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2_1__1"


    // $ANTLR start "rule__Then__Group_2_1__1__Impl"
    // InternalHTMLbuild.g:1839:1: rule__Then__Group_2_1__1__Impl : ( '/' ) ;
    public final void rule__Then__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1843:1: ( ( '/' ) )
            // InternalHTMLbuild.g:1844:1: ( '/' )
            {
            // InternalHTMLbuild.g:1844:1: ( '/' )
            // InternalHTMLbuild.g:1845:2: '/'
            {
             before(grammarAccess.getThenAccess().getSolidusKeyword_2_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getSolidusKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group_2_1__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalHTMLbuild.g:1855:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1859:1: ( ( ruleType ) )
            // InternalHTMLbuild.g:1860:2: ( ruleType )
            {
            // InternalHTMLbuild.g:1860:2: ( ruleType )
            // InternalHTMLbuild.g:1861:3: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Style__Style_idAssignment_1"
    // InternalHTMLbuild.g:1870:1: rule__Style__Style_idAssignment_1 : ( RULE_ID ) ;
    public final void rule__Style__Style_idAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1874:1: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:1875:2: ( RULE_ID )
            {
            // InternalHTMLbuild.g:1875:2: ( RULE_ID )
            // InternalHTMLbuild.g:1876:3: RULE_ID
            {
             before(grammarAccess.getStyleAccess().getStyle_idIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStyleAccess().getStyle_idIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Style_idAssignment_1"


    // $ANTLR start "rule__Style__LinkAssignment_3_0"
    // InternalHTMLbuild.g:1885:1: rule__Style__LinkAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Style__LinkAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1889:1: ( ( ( RULE_ID ) ) )
            // InternalHTMLbuild.g:1890:2: ( ( RULE_ID ) )
            {
            // InternalHTMLbuild.g:1890:2: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:1891:3: ( RULE_ID )
            {
             before(grammarAccess.getStyleAccess().getLinkLinkCrossReference_3_0_0()); 
            // InternalHTMLbuild.g:1892:3: ( RULE_ID )
            // InternalHTMLbuild.g:1893:4: RULE_ID
            {
             before(grammarAccess.getStyleAccess().getLinkLinkIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStyleAccess().getLinkLinkIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getStyleAccess().getLinkLinkCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__LinkAssignment_3_0"


    // $ANTLR start "rule__Style__NewlinkAssignment_3_1"
    // InternalHTMLbuild.g:1904:1: rule__Style__NewlinkAssignment_3_1 : ( ruleLink ) ;
    public final void rule__Style__NewlinkAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1908:1: ( ( ruleLink ) )
            // InternalHTMLbuild.g:1909:2: ( ruleLink )
            {
            // InternalHTMLbuild.g:1909:2: ( ruleLink )
            // InternalHTMLbuild.g:1910:3: ruleLink
            {
             before(grammarAccess.getStyleAccess().getNewlinkLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getStyleAccess().getNewlinkLinkParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__NewlinkAssignment_3_1"


    // $ANTLR start "rule__Text__NameAssignment_2"
    // InternalHTMLbuild.g:1919:1: rule__Text__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1923:1: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:1924:2: ( RULE_ID )
            {
            // InternalHTMLbuild.g:1924:2: ( RULE_ID )
            // InternalHTMLbuild.g:1925:3: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_2"


    // $ANTLR start "rule__Text__H1Assignment_4_0"
    // InternalHTMLbuild.g:1934:1: rule__Text__H1Assignment_4_0 : ( ( '#' ) ) ;
    public final void rule__Text__H1Assignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1938:1: ( ( ( '#' ) ) )
            // InternalHTMLbuild.g:1939:2: ( ( '#' ) )
            {
            // InternalHTMLbuild.g:1939:2: ( ( '#' ) )
            // InternalHTMLbuild.g:1940:3: ( '#' )
            {
             before(grammarAccess.getTextAccess().getH1NumberSignKeyword_4_0_0()); 
            // InternalHTMLbuild.g:1941:3: ( '#' )
            // InternalHTMLbuild.g:1942:4: '#'
            {
             before(grammarAccess.getTextAccess().getH1NumberSignKeyword_4_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getH1NumberSignKeyword_4_0_0()); 

            }

             after(grammarAccess.getTextAccess().getH1NumberSignKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__H1Assignment_4_0"


    // $ANTLR start "rule__Text__H2Assignment_4_1"
    // InternalHTMLbuild.g:1953:1: rule__Text__H2Assignment_4_1 : ( ( '##' ) ) ;
    public final void rule__Text__H2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1957:1: ( ( ( '##' ) ) )
            // InternalHTMLbuild.g:1958:2: ( ( '##' ) )
            {
            // InternalHTMLbuild.g:1958:2: ( ( '##' ) )
            // InternalHTMLbuild.g:1959:3: ( '##' )
            {
             before(grammarAccess.getTextAccess().getH2NumberSignNumberSignKeyword_4_1_0()); 
            // InternalHTMLbuild.g:1960:3: ( '##' )
            // InternalHTMLbuild.g:1961:4: '##'
            {
             before(grammarAccess.getTextAccess().getH2NumberSignNumberSignKeyword_4_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getH2NumberSignNumberSignKeyword_4_1_0()); 

            }

             after(grammarAccess.getTextAccess().getH2NumberSignNumberSignKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__H2Assignment_4_1"


    // $ANTLR start "rule__Text__H3Assignment_4_2"
    // InternalHTMLbuild.g:1972:1: rule__Text__H3Assignment_4_2 : ( ( '###' ) ) ;
    public final void rule__Text__H3Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1976:1: ( ( ( '###' ) ) )
            // InternalHTMLbuild.g:1977:2: ( ( '###' ) )
            {
            // InternalHTMLbuild.g:1977:2: ( ( '###' ) )
            // InternalHTMLbuild.g:1978:3: ( '###' )
            {
             before(grammarAccess.getTextAccess().getH3NumberSignNumberSignNumberSignKeyword_4_2_0()); 
            // InternalHTMLbuild.g:1979:3: ( '###' )
            // InternalHTMLbuild.g:1980:4: '###'
            {
             before(grammarAccess.getTextAccess().getH3NumberSignNumberSignNumberSignKeyword_4_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getH3NumberSignNumberSignNumberSignKeyword_4_2_0()); 

            }

             after(grammarAccess.getTextAccess().getH3NumberSignNumberSignNumberSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__H3Assignment_4_2"


    // $ANTLR start "rule__Image__NameAssignment_1"
    // InternalHTMLbuild.g:1991:1: rule__Image__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:1995:1: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:1996:2: ( RULE_ID )
            {
            // InternalHTMLbuild.g:1996:2: ( RULE_ID )
            // InternalHTMLbuild.g:1997:3: RULE_ID
            {
             before(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__NameAssignment_1"


    // $ANTLR start "rule__Image__LinkAssignment_3_0"
    // InternalHTMLbuild.g:2006:1: rule__Image__LinkAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Image__LinkAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2010:1: ( ( ( RULE_ID ) ) )
            // InternalHTMLbuild.g:2011:2: ( ( RULE_ID ) )
            {
            // InternalHTMLbuild.g:2011:2: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:2012:3: ( RULE_ID )
            {
             before(grammarAccess.getImageAccess().getLinkLinkCrossReference_3_0_0()); 
            // InternalHTMLbuild.g:2013:3: ( RULE_ID )
            // InternalHTMLbuild.g:2014:4: RULE_ID
            {
             before(grammarAccess.getImageAccess().getLinkLinkIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getLinkLinkIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getImageAccess().getLinkLinkCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__LinkAssignment_3_0"


    // $ANTLR start "rule__Image__NewlinkAssignment_3_1"
    // InternalHTMLbuild.g:2025:1: rule__Image__NewlinkAssignment_3_1 : ( ruleLink ) ;
    public final void rule__Image__NewlinkAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2029:1: ( ( ruleLink ) )
            // InternalHTMLbuild.g:2030:2: ( ruleLink )
            {
            // InternalHTMLbuild.g:2030:2: ( ruleLink )
            // InternalHTMLbuild.g:2031:3: ruleLink
            {
             before(grammarAccess.getImageAccess().getNewlinkLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getImageAccess().getNewlinkLinkParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__NewlinkAssignment_3_1"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalHTMLbuild.g:2040:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2044:1: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:2045:2: ( RULE_ID )
            {
            // InternalHTMLbuild.g:2045:2: ( RULE_ID )
            // InternalHTMLbuild.g:2046:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__AddressAssignment_3_0"
    // InternalHTMLbuild.g:2055:1: rule__Link__AddressAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Link__AddressAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2059:1: ( ( RULE_STRING ) )
            // InternalHTMLbuild.g:2060:2: ( RULE_STRING )
            {
            // InternalHTMLbuild.g:2060:2: ( RULE_STRING )
            // InternalHTMLbuild.g:2061:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getAddressSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getAddressSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__AddressAssignment_3_0"


    // $ANTLR start "rule__Link__AnchorAssignment_3_1"
    // InternalHTMLbuild.g:2070:1: rule__Link__AnchorAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__AnchorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2074:1: ( ( ( RULE_ID ) ) )
            // InternalHTMLbuild.g:2075:2: ( ( RULE_ID ) )
            {
            // InternalHTMLbuild.g:2075:2: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:2076:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getAnchorContentCrossReference_3_1_0()); 
            // InternalHTMLbuild.g:2077:3: ( RULE_ID )
            // InternalHTMLbuild.g:2078:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getAnchorContentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getAnchorContentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getAnchorContentCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__AnchorAssignment_3_1"


    // $ANTLR start "rule__Link__LinktextAssignment_4_1"
    // InternalHTMLbuild.g:2089:1: rule__Link__LinktextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__LinktextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2093:1: ( ( RULE_STRING ) )
            // InternalHTMLbuild.g:2094:2: ( RULE_STRING )
            {
            // InternalHTMLbuild.g:2094:2: ( RULE_STRING )
            // InternalHTMLbuild.g:2095:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getLinktextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinktextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinktextAssignment_4_1"


    // $ANTLR start "rule__Element__ElemAssignment_1"
    // InternalHTMLbuild.g:2104:1: rule__Element__ElemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Element__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2108:1: ( ( ( RULE_ID ) ) )
            // InternalHTMLbuild.g:2109:2: ( ( RULE_ID ) )
            {
            // InternalHTMLbuild.g:2109:2: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:2110:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getElemContentCrossReference_1_0()); 
            // InternalHTMLbuild.g:2111:3: ( RULE_ID )
            // InternalHTMLbuild.g:2112:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElemContentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElemContentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getElementAccess().getElemContentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ElemAssignment_1"


    // $ANTLR start "rule__Div__Div_idAssignment_0"
    // InternalHTMLbuild.g:2123:1: rule__Div__Div_idAssignment_0 : ( RULE_ID ) ;
    public final void rule__Div__Div_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2127:1: ( ( RULE_ID ) )
            // InternalHTMLbuild.g:2128:2: ( RULE_ID )
            {
            // InternalHTMLbuild.g:2128:2: ( RULE_ID )
            // InternalHTMLbuild.g:2129:3: RULE_ID
            {
             before(grammarAccess.getDivAccess().getDiv_idIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDivAccess().getDiv_idIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__Div_idAssignment_0"


    // $ANTLR start "rule__Div__DivelementsAssignment_2"
    // InternalHTMLbuild.g:2138:1: rule__Div__DivelementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Div__DivelementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2142:1: ( ( ruleElement ) )
            // InternalHTMLbuild.g:2143:2: ( ruleElement )
            {
            // InternalHTMLbuild.g:2143:2: ( ruleElement )
            // InternalHTMLbuild.g:2144:3: ruleElement
            {
             before(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__DivelementsAssignment_2"


    // $ANTLR start "rule__Div__SeparatorsAssignment_3_0"
    // InternalHTMLbuild.g:2153:1: rule__Div__SeparatorsAssignment_3_0 : ( ruleSeparator ) ;
    public final void rule__Div__SeparatorsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2157:1: ( ( ruleSeparator ) )
            // InternalHTMLbuild.g:2158:2: ( ruleSeparator )
            {
            // InternalHTMLbuild.g:2158:2: ( ruleSeparator )
            // InternalHTMLbuild.g:2159:3: ruleSeparator
            {
             before(grammarAccess.getDivAccess().getSeparatorsSeparatorParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getDivAccess().getSeparatorsSeparatorParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__SeparatorsAssignment_3_0"


    // $ANTLR start "rule__Div__DivelementsAssignment_3_1"
    // InternalHTMLbuild.g:2168:1: rule__Div__DivelementsAssignment_3_1 : ( ruleElement ) ;
    public final void rule__Div__DivelementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2172:1: ( ( ruleElement ) )
            // InternalHTMLbuild.g:2173:2: ( ruleElement )
            {
            // InternalHTMLbuild.g:2173:2: ( ruleElement )
            // InternalHTMLbuild.g:2174:3: ruleElement
            {
             before(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Div__DivelementsAssignment_3_1"


    // $ANTLR start "rule__Next__HasratioAssignment_2_0"
    // InternalHTMLbuild.g:2183:1: rule__Next__HasratioAssignment_2_0 : ( ( '(' ) ) ;
    public final void rule__Next__HasratioAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2187:1: ( ( ( '(' ) ) )
            // InternalHTMLbuild.g:2188:2: ( ( '(' ) )
            {
            // InternalHTMLbuild.g:2188:2: ( ( '(' ) )
            // InternalHTMLbuild.g:2189:3: ( '(' )
            {
             before(grammarAccess.getNextAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 
            // InternalHTMLbuild.g:2190:3: ( '(' )
            // InternalHTMLbuild.g:2191:4: '('
            {
             before(grammarAccess.getNextAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 

            }

             after(grammarAccess.getNextAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__HasratioAssignment_2_0"


    // $ANTLR start "rule__Next__RatiosAssignment_2_1_0"
    // InternalHTMLbuild.g:2202:1: rule__Next__RatiosAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__Next__RatiosAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2206:1: ( ( RULE_INT ) )
            // InternalHTMLbuild.g:2207:2: ( RULE_INT )
            {
            // InternalHTMLbuild.g:2207:2: ( RULE_INT )
            // InternalHTMLbuild.g:2208:3: RULE_INT
            {
             before(grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__RatiosAssignment_2_1_0"


    // $ANTLR start "rule__Next__RatiosAssignment_2_2"
    // InternalHTMLbuild.g:2217:1: rule__Next__RatiosAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Next__RatiosAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2221:1: ( ( RULE_INT ) )
            // InternalHTMLbuild.g:2222:2: ( RULE_INT )
            {
            // InternalHTMLbuild.g:2222:2: ( RULE_INT )
            // InternalHTMLbuild.g:2223:3: RULE_INT
            {
             before(grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__RatiosAssignment_2_2"


    // $ANTLR start "rule__Then__HasratioAssignment_2_0"
    // InternalHTMLbuild.g:2232:1: rule__Then__HasratioAssignment_2_0 : ( ( '(' ) ) ;
    public final void rule__Then__HasratioAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2236:1: ( ( ( '(' ) ) )
            // InternalHTMLbuild.g:2237:2: ( ( '(' ) )
            {
            // InternalHTMLbuild.g:2237:2: ( ( '(' ) )
            // InternalHTMLbuild.g:2238:3: ( '(' )
            {
             before(grammarAccess.getThenAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 
            // InternalHTMLbuild.g:2239:3: ( '(' )
            // InternalHTMLbuild.g:2240:4: '('
            {
             before(grammarAccess.getThenAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 

            }

             after(grammarAccess.getThenAccess().getHasratioLeftParenthesisKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__HasratioAssignment_2_0"


    // $ANTLR start "rule__Then__RatiosAssignment_2_1_0"
    // InternalHTMLbuild.g:2251:1: rule__Then__RatiosAssignment_2_1_0 : ( RULE_INT ) ;
    public final void rule__Then__RatiosAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2255:1: ( ( RULE_INT ) )
            // InternalHTMLbuild.g:2256:2: ( RULE_INT )
            {
            // InternalHTMLbuild.g:2256:2: ( RULE_INT )
            // InternalHTMLbuild.g:2257:3: RULE_INT
            {
             before(grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__RatiosAssignment_2_1_0"


    // $ANTLR start "rule__Then__RatiosAssignment_2_2"
    // InternalHTMLbuild.g:2266:1: rule__Then__RatiosAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Then__RatiosAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHTMLbuild.g:2270:1: ( ( RULE_INT ) )
            // InternalHTMLbuild.g:2271:2: ( RULE_INT )
            {
            // InternalHTMLbuild.g:2271:2: ( RULE_INT )
            // InternalHTMLbuild.g:2272:3: RULE_INT
            {
             before(grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__RatiosAssignment_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000002E822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000002E820L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000008C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000880000L});

}