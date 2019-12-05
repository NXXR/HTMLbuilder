package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.HTMLbuildGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHTMLbuildParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Style'", "':'", "'Text'", "'#'", "'##'", "'###'", "'Image'", "'Link'", "'linktext'", "'{'", "'}'", "'<next'", "'('", "'/'", "')'", "'>'", "'<then'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalHTMLbuildParser(TokenStream input, HTMLbuildGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HTMLbuildGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHTMLbuild.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHTMLbuild.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHTMLbuild.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHTMLbuild.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalHTMLbuild.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalHTMLbuild.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13||(LA1_0>=17 && LA1_0<=18)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHTMLbuild.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalHTMLbuild.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalHTMLbuild.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.HTMLbuild.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalHTMLbuild.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalHTMLbuild.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalHTMLbuild.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalHTMLbuild.g:107:1: ruleType returns [EObject current=null] : (this_Style_0= ruleStyle | this_Content_1= ruleContent | this_Div_2= ruleDiv ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Style_0 = null;

        EObject this_Content_1 = null;

        EObject this_Div_2 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:113:2: ( (this_Style_0= ruleStyle | this_Content_1= ruleContent | this_Div_2= ruleDiv ) )
            // InternalHTMLbuild.g:114:2: (this_Style_0= ruleStyle | this_Content_1= ruleContent | this_Div_2= ruleDiv )
            {
            // InternalHTMLbuild.g:114:2: (this_Style_0= ruleStyle | this_Content_1= ruleContent | this_Div_2= ruleDiv )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 20:
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
                    // InternalHTMLbuild.g:115:3: this_Style_0= ruleStyle
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStyleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Style_0=ruleStyle();

                    state._fsp--;


                    			current = this_Style_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:124:3: this_Content_1= ruleContent
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getContentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Content_1=ruleContent();

                    state._fsp--;


                    			current = this_Content_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:133:3: this_Div_2= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDivParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_2=ruleDiv();

                    state._fsp--;


                    			current = this_Div_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStyle"
    // InternalHTMLbuild.g:145:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalHTMLbuild.g:145:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalHTMLbuild.g:146:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalHTMLbuild.g:152:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'Style' ( (lv_style_id_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_style_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_newlink_4_0 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:158:2: ( (otherlv_0= 'Style' ( (lv_style_id_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) ) )
            // InternalHTMLbuild.g:159:2: (otherlv_0= 'Style' ( (lv_style_id_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) )
            {
            // InternalHTMLbuild.g:159:2: (otherlv_0= 'Style' ( (lv_style_id_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) )
            // InternalHTMLbuild.g:160:3: otherlv_0= 'Style' ( (lv_style_id_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
            		
            // InternalHTMLbuild.g:164:3: ( (lv_style_id_1_0= RULE_ID ) )
            // InternalHTMLbuild.g:165:4: (lv_style_id_1_0= RULE_ID )
            {
            // InternalHTMLbuild.g:165:4: (lv_style_id_1_0= RULE_ID )
            // InternalHTMLbuild.g:166:5: lv_style_id_1_0= RULE_ID
            {
            lv_style_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_style_id_1_0, grammarAccess.getStyleAccess().getStyle_idIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStyleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"style_id",
            						lv_style_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getColonKeyword_2());
            		
            // InternalHTMLbuild.g:186:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHTMLbuild.g:187:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHTMLbuild.g:187:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHTMLbuild.g:188:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHTMLbuild.g:188:5: (otherlv_3= RULE_ID )
                    // InternalHTMLbuild.g:189:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStyleRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getLinkLinkCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:201:4: ( (lv_newlink_4_0= ruleLink ) )
                    {
                    // InternalHTMLbuild.g:201:4: ( (lv_newlink_4_0= ruleLink ) )
                    // InternalHTMLbuild.g:202:5: (lv_newlink_4_0= ruleLink )
                    {
                    // InternalHTMLbuild.g:202:5: (lv_newlink_4_0= ruleLink )
                    // InternalHTMLbuild.g:203:6: lv_newlink_4_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getStyleAccess().getNewlinkLinkParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_newlink_4_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStyleRule());
                    						}
                    						set(
                    							current,
                    							"newlink",
                    							lv_newlink_4_0,
                    							"org.xtext.example.mydsl.HTMLbuild.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleContent"
    // InternalHTMLbuild.g:225:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalHTMLbuild.g:225:48: (iv_ruleContent= ruleContent EOF )
            // InternalHTMLbuild.g:226:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalHTMLbuild.g:232:1: ruleContent returns [EObject current=null] : (this_Text_0= ruleText | this_Image_1= ruleImage | this_Link_2= ruleLink ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Image_1 = null;

        EObject this_Link_2 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:238:2: ( (this_Text_0= ruleText | this_Image_1= ruleImage | this_Link_2= ruleLink ) )
            // InternalHTMLbuild.g:239:2: (this_Text_0= ruleText | this_Image_1= ruleImage | this_Link_2= ruleLink )
            {
            // InternalHTMLbuild.g:239:2: (this_Text_0= ruleText | this_Image_1= ruleImage | this_Link_2= ruleLink )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
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
                    // InternalHTMLbuild.g:240:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:249:3: this_Image_1= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getImageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_1=ruleImage();

                    state._fsp--;


                    			current = this_Image_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:258:3: this_Link_2= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getLinkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_2=ruleLink();

                    state._fsp--;


                    			current = this_Link_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleText"
    // InternalHTMLbuild.g:270:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalHTMLbuild.g:270:45: (iv_ruleText= ruleText EOF )
            // InternalHTMLbuild.g:271:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalHTMLbuild.g:277:1: ruleText returns [EObject current=null] : ( () otherlv_1= 'Text' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )? this_STRING_7= RULE_STRING ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_h1_4_0=null;
        Token lv_h2_5_0=null;
        Token lv_h3_6_0=null;
        Token this_STRING_7=null;


        	enterRule();

        try {
            // InternalHTMLbuild.g:283:2: ( ( () otherlv_1= 'Text' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )? this_STRING_7= RULE_STRING ) )
            // InternalHTMLbuild.g:284:2: ( () otherlv_1= 'Text' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )? this_STRING_7= RULE_STRING )
            {
            // InternalHTMLbuild.g:284:2: ( () otherlv_1= 'Text' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )? this_STRING_7= RULE_STRING )
            // InternalHTMLbuild.g:285:3: () otherlv_1= 'Text' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )? this_STRING_7= RULE_STRING
            {
            // InternalHTMLbuild.g:285:3: ()
            // InternalHTMLbuild.g:286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextAccess().getTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
            		
            // InternalHTMLbuild.g:296:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHTMLbuild.g:297:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalHTMLbuild.g:297:4: (lv_name_2_0= RULE_ID )
                    // InternalHTMLbuild.g:298:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getColonKeyword_3());
            		
            // InternalHTMLbuild.g:318:3: ( ( (lv_h1_4_0= '#' ) ) | ( (lv_h2_5_0= '##' ) ) | ( (lv_h3_6_0= '###' ) ) )?
            int alt6=4;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt6=1;
                    }
                    break;
                case 15:
                    {
                    alt6=2;
                    }
                    break;
                case 16:
                    {
                    alt6=3;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // InternalHTMLbuild.g:319:4: ( (lv_h1_4_0= '#' ) )
                    {
                    // InternalHTMLbuild.g:319:4: ( (lv_h1_4_0= '#' ) )
                    // InternalHTMLbuild.g:320:5: (lv_h1_4_0= '#' )
                    {
                    // InternalHTMLbuild.g:320:5: (lv_h1_4_0= '#' )
                    // InternalHTMLbuild.g:321:6: lv_h1_4_0= '#'
                    {
                    lv_h1_4_0=(Token)match(input,14,FOLLOW_9); 

                    						newLeafNode(lv_h1_4_0, grammarAccess.getTextAccess().getH1NumberSignKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(current, "h1", true, "#");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:334:4: ( (lv_h2_5_0= '##' ) )
                    {
                    // InternalHTMLbuild.g:334:4: ( (lv_h2_5_0= '##' ) )
                    // InternalHTMLbuild.g:335:5: (lv_h2_5_0= '##' )
                    {
                    // InternalHTMLbuild.g:335:5: (lv_h2_5_0= '##' )
                    // InternalHTMLbuild.g:336:6: lv_h2_5_0= '##'
                    {
                    lv_h2_5_0=(Token)match(input,15,FOLLOW_9); 

                    						newLeafNode(lv_h2_5_0, grammarAccess.getTextAccess().getH2NumberSignNumberSignKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(current, "h2", true, "##");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHTMLbuild.g:349:4: ( (lv_h3_6_0= '###' ) )
                    {
                    // InternalHTMLbuild.g:349:4: ( (lv_h3_6_0= '###' ) )
                    // InternalHTMLbuild.g:350:5: (lv_h3_6_0= '###' )
                    {
                    // InternalHTMLbuild.g:350:5: (lv_h3_6_0= '###' )
                    // InternalHTMLbuild.g:351:6: lv_h3_6_0= '###'
                    {
                    lv_h3_6_0=(Token)match(input,16,FOLLOW_9); 

                    						newLeafNode(lv_h3_6_0, grammarAccess.getTextAccess().getH3NumberSignNumberSignNumberSignKeyword_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(current, "h3", true, "###");
                    					

                    }


                    }


                    }
                    break;

            }

            this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_7, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleImage"
    // InternalHTMLbuild.g:372:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalHTMLbuild.g:372:46: (iv_ruleImage= ruleImage EOF )
            // InternalHTMLbuild.g:373:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalHTMLbuild.g:379:1: ruleImage returns [EObject current=null] : (otherlv_0= 'Image' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_newlink_4_0 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:385:2: ( (otherlv_0= 'Image' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) ) )
            // InternalHTMLbuild.g:386:2: (otherlv_0= 'Image' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) )
            {
            // InternalHTMLbuild.g:386:2: (otherlv_0= 'Image' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) ) )
            // InternalHTMLbuild.g:387:3: otherlv_0= 'Image' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalHTMLbuild.g:391:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHTMLbuild.g:392:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHTMLbuild.g:392:4: (lv_name_1_0= RULE_ID )
            // InternalHTMLbuild.g:393:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getColonKeyword_2());
            		
            // InternalHTMLbuild.g:413:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_newlink_4_0= ruleLink ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHTMLbuild.g:414:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHTMLbuild.g:414:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHTMLbuild.g:415:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHTMLbuild.g:415:5: (otherlv_3= RULE_ID )
                    // InternalHTMLbuild.g:416:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getImageAccess().getLinkLinkCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:428:4: ( (lv_newlink_4_0= ruleLink ) )
                    {
                    // InternalHTMLbuild.g:428:4: ( (lv_newlink_4_0= ruleLink ) )
                    // InternalHTMLbuild.g:429:5: (lv_newlink_4_0= ruleLink )
                    {
                    // InternalHTMLbuild.g:429:5: (lv_newlink_4_0= ruleLink )
                    // InternalHTMLbuild.g:430:6: lv_newlink_4_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getNewlinkLinkParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_newlink_4_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"newlink",
                    							lv_newlink_4_0,
                    							"org.xtext.example.mydsl.HTMLbuild.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleLink"
    // InternalHTMLbuild.g:452:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalHTMLbuild.g:452:45: (iv_ruleLink= ruleLink EOF )
            // InternalHTMLbuild.g:453:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalHTMLbuild.g:459:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_linktext_6_0=null;


        	enterRule();

        try {
            // InternalHTMLbuild.g:465:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )? ) )
            // InternalHTMLbuild.g:466:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )? )
            {
            // InternalHTMLbuild.g:466:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )? )
            // InternalHTMLbuild.g:467:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalHTMLbuild.g:471:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHTMLbuild.g:472:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalHTMLbuild.g:472:4: (lv_name_1_0= RULE_ID )
                    // InternalHTMLbuild.g:473:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLinkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2());
            		
            // InternalHTMLbuild.g:493:3: ( ( (lv_address_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHTMLbuild.g:494:4: ( (lv_address_3_0= RULE_STRING ) )
                    {
                    // InternalHTMLbuild.g:494:4: ( (lv_address_3_0= RULE_STRING ) )
                    // InternalHTMLbuild.g:495:5: (lv_address_3_0= RULE_STRING )
                    {
                    // InternalHTMLbuild.g:495:5: (lv_address_3_0= RULE_STRING )
                    // InternalHTMLbuild.g:496:6: lv_address_3_0= RULE_STRING
                    {
                    lv_address_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_address_3_0, grammarAccess.getLinkAccess().getAddressSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"address",
                    							lv_address_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:513:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalHTMLbuild.g:513:4: ( (otherlv_4= RULE_ID ) )
                    // InternalHTMLbuild.g:514:5: (otherlv_4= RULE_ID )
                    {
                    // InternalHTMLbuild.g:514:5: (otherlv_4= RULE_ID )
                    // InternalHTMLbuild.g:515:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getAnchorContentCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHTMLbuild.g:527:3: (otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHTMLbuild.g:528:4: otherlv_5= 'linktext' ( (lv_linktext_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getLinktextKeyword_4_0());
                    			
                    // InternalHTMLbuild.g:532:4: ( (lv_linktext_6_0= RULE_STRING ) )
                    // InternalHTMLbuild.g:533:5: (lv_linktext_6_0= RULE_STRING )
                    {
                    // InternalHTMLbuild.g:533:5: (lv_linktext_6_0= RULE_STRING )
                    // InternalHTMLbuild.g:534:6: lv_linktext_6_0= RULE_STRING
                    {
                    lv_linktext_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_linktext_6_0, grammarAccess.getLinkAccess().getLinktextSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"linktext",
                    							lv_linktext_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleElement"
    // InternalHTMLbuild.g:555:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalHTMLbuild.g:555:48: (iv_ruleElement= ruleElement EOF )
            // InternalHTMLbuild.g:556:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalHTMLbuild.g:562:1: ruleElement returns [EObject current=null] : ( (this_Content_0= ruleContent | this_Div_1= ruleDiv ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Content_0 = null;

        EObject this_Div_1 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:568:2: ( ( (this_Content_0= ruleContent | this_Div_1= ruleDiv ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalHTMLbuild.g:569:2: ( (this_Content_0= ruleContent | this_Div_1= ruleDiv ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalHTMLbuild.g:569:2: ( (this_Content_0= ruleContent | this_Div_1= ruleDiv ) | ( (otherlv_2= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13||(LA12_0>=17 && LA12_0<=18)||LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==20) ) {
                    alt12=1;
                }
                else if ( (LA12_2==EOF||(LA12_2>=21 && LA12_2<=22)||LA12_2==27) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHTMLbuild.g:570:3: (this_Content_0= ruleContent | this_Div_1= ruleDiv )
                    {
                    // InternalHTMLbuild.g:570:3: (this_Content_0= ruleContent | this_Div_1= ruleDiv )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==13||(LA11_0>=17 && LA11_0<=18)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID||LA11_0==20) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalHTMLbuild.g:571:4: this_Content_0= ruleContent
                            {

                            				newCompositeNode(grammarAccess.getElementAccess().getContentParserRuleCall_0_0());
                            			
                            pushFollow(FOLLOW_2);
                            this_Content_0=ruleContent();

                            state._fsp--;


                            				current = this_Content_0;
                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;
                        case 2 :
                            // InternalHTMLbuild.g:580:4: this_Div_1= ruleDiv
                            {

                            				newCompositeNode(grammarAccess.getElementAccess().getDivParserRuleCall_0_1());
                            			
                            pushFollow(FOLLOW_2);
                            this_Div_1=ruleDiv();

                            state._fsp--;


                            				current = this_Div_1;
                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:590:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalHTMLbuild.g:590:3: ( (otherlv_2= RULE_ID ) )
                    // InternalHTMLbuild.g:591:4: (otherlv_2= RULE_ID )
                    {
                    // InternalHTMLbuild.g:591:4: (otherlv_2= RULE_ID )
                    // InternalHTMLbuild.g:592:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getElementAccess().getElemContentCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDiv"
    // InternalHTMLbuild.g:607:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalHTMLbuild.g:607:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalHTMLbuild.g:608:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalHTMLbuild.g:614:1: ruleDiv returns [EObject current=null] : ( ( (lv_div_id_0_0= RULE_ID ) )? otherlv_1= '{' ( (lv_divelements_2_0= ruleElement ) ) ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token lv_div_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_divelements_2_0 = null;

        EObject lv_separators_3_0 = null;

        EObject lv_divelements_4_0 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:620:2: ( ( ( (lv_div_id_0_0= RULE_ID ) )? otherlv_1= '{' ( (lv_divelements_2_0= ruleElement ) ) ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )* otherlv_5= '}' ) )
            // InternalHTMLbuild.g:621:2: ( ( (lv_div_id_0_0= RULE_ID ) )? otherlv_1= '{' ( (lv_divelements_2_0= ruleElement ) ) ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )* otherlv_5= '}' )
            {
            // InternalHTMLbuild.g:621:2: ( ( (lv_div_id_0_0= RULE_ID ) )? otherlv_1= '{' ( (lv_divelements_2_0= ruleElement ) ) ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )* otherlv_5= '}' )
            // InternalHTMLbuild.g:622:3: ( (lv_div_id_0_0= RULE_ID ) )? otherlv_1= '{' ( (lv_divelements_2_0= ruleElement ) ) ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )* otherlv_5= '}'
            {
            // InternalHTMLbuild.g:622:3: ( (lv_div_id_0_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHTMLbuild.g:623:4: (lv_div_id_0_0= RULE_ID )
                    {
                    // InternalHTMLbuild.g:623:4: (lv_div_id_0_0= RULE_ID )
                    // InternalHTMLbuild.g:624:5: lv_div_id_0_0= RULE_ID
                    {
                    lv_div_id_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					newLeafNode(lv_div_id_0_0, grammarAccess.getDivAccess().getDiv_idIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDivRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"div_id",
                    						lv_div_id_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalHTMLbuild.g:644:3: ( (lv_divelements_2_0= ruleElement ) )
            // InternalHTMLbuild.g:645:4: (lv_divelements_2_0= ruleElement )
            {
            // InternalHTMLbuild.g:645:4: (lv_divelements_2_0= ruleElement )
            // InternalHTMLbuild.g:646:5: lv_divelements_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_divelements_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivRule());
            					}
            					add(
            						current,
            						"divelements",
            						lv_divelements_2_0,
            						"org.xtext.example.mydsl.HTMLbuild.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHTMLbuild.g:663:3: ( ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHTMLbuild.g:664:4: ( (lv_separators_3_0= ruleSeparator ) ) ( (lv_divelements_4_0= ruleElement ) )
            	    {
            	    // InternalHTMLbuild.g:664:4: ( (lv_separators_3_0= ruleSeparator ) )
            	    // InternalHTMLbuild.g:665:5: (lv_separators_3_0= ruleSeparator )
            	    {
            	    // InternalHTMLbuild.g:665:5: (lv_separators_3_0= ruleSeparator )
            	    // InternalHTMLbuild.g:666:6: lv_separators_3_0= ruleSeparator
            	    {

            	    						newCompositeNode(grammarAccess.getDivAccess().getSeparatorsSeparatorParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_separators_3_0=ruleSeparator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivRule());
            	    						}
            	    						add(
            	    							current,
            	    							"separators",
            	    							lv_separators_3_0,
            	    							"org.xtext.example.mydsl.HTMLbuild.Separator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalHTMLbuild.g:683:4: ( (lv_divelements_4_0= ruleElement ) )
            	    // InternalHTMLbuild.g:684:5: (lv_divelements_4_0= ruleElement )
            	    {
            	    // InternalHTMLbuild.g:684:5: (lv_divelements_4_0= ruleElement )
            	    // InternalHTMLbuild.g:685:6: lv_divelements_4_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getDivAccess().getDivelementsElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_divelements_4_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivRule());
            	    						}
            	    						add(
            	    							current,
            	    							"divelements",
            	    							lv_divelements_4_0,
            	    							"org.xtext.example.mydsl.HTMLbuild.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDivAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleSeparator"
    // InternalHTMLbuild.g:711:1: entryRuleSeparator returns [EObject current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final EObject entryRuleSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeparator = null;


        try {
            // InternalHTMLbuild.g:711:50: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalHTMLbuild.g:712:2: iv_ruleSeparator= ruleSeparator EOF
            {
             newCompositeNode(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparator=ruleSeparator();

            state._fsp--;

             current =iv_ruleSeparator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalHTMLbuild.g:718:1: ruleSeparator returns [EObject current=null] : (this_Next_0= ruleNext | this_Then_1= ruleThen ) ;
    public final EObject ruleSeparator() throws RecognitionException {
        EObject current = null;

        EObject this_Next_0 = null;

        EObject this_Then_1 = null;



        	enterRule();

        try {
            // InternalHTMLbuild.g:724:2: ( (this_Next_0= ruleNext | this_Then_1= ruleThen ) )
            // InternalHTMLbuild.g:725:2: (this_Next_0= ruleNext | this_Then_1= ruleThen )
            {
            // InternalHTMLbuild.g:725:2: (this_Next_0= ruleNext | this_Then_1= ruleThen )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHTMLbuild.g:726:3: this_Next_0= ruleNext
                    {

                    			newCompositeNode(grammarAccess.getSeparatorAccess().getNextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Next_0=ruleNext();

                    state._fsp--;


                    			current = this_Next_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHTMLbuild.g:735:3: this_Then_1= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getSeparatorAccess().getThenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_1=ruleThen();

                    state._fsp--;


                    			current = this_Then_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleNext"
    // InternalHTMLbuild.g:747:1: entryRuleNext returns [EObject current=null] : iv_ruleNext= ruleNext EOF ;
    public final EObject entryRuleNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNext = null;


        try {
            // InternalHTMLbuild.g:747:45: (iv_ruleNext= ruleNext EOF )
            // InternalHTMLbuild.g:748:2: iv_ruleNext= ruleNext EOF
            {
             newCompositeNode(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNext=ruleNext();

            state._fsp--;

             current =iv_ruleNext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNext"


    // $ANTLR start "ruleNext"
    // InternalHTMLbuild.g:754:1: ruleNext returns [EObject current=null] : ( () otherlv_1= '<next' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' ) ;
    public final EObject ruleNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasratio_2_0=null;
        Token lv_ratios_3_0=null;
        Token otherlv_4=null;
        Token lv_ratios_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalHTMLbuild.g:760:2: ( ( () otherlv_1= '<next' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' ) )
            // InternalHTMLbuild.g:761:2: ( () otherlv_1= '<next' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' )
            {
            // InternalHTMLbuild.g:761:2: ( () otherlv_1= '<next' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' )
            // InternalHTMLbuild.g:762:3: () otherlv_1= '<next' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>'
            {
            // InternalHTMLbuild.g:762:3: ()
            // InternalHTMLbuild.g:763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNextAccess().getNextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNextAccess().getNextKeyword_1());
            		
            // InternalHTMLbuild.g:773:3: ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHTMLbuild.g:774:4: ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')'
                    {
                    // InternalHTMLbuild.g:774:4: ( (lv_hasratio_2_0= '(' ) )
                    // InternalHTMLbuild.g:775:5: (lv_hasratio_2_0= '(' )
                    {
                    // InternalHTMLbuild.g:775:5: (lv_hasratio_2_0= '(' )
                    // InternalHTMLbuild.g:776:6: lv_hasratio_2_0= '('
                    {
                    lv_hasratio_2_0=(Token)match(input,23,FOLLOW_16); 

                    						newLeafNode(lv_hasratio_2_0, grammarAccess.getNextAccess().getHasratioLeftParenthesisKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNextRule());
                    						}
                    						setWithLastConsumed(current, "hasratio", true, "(");
                    					

                    }


                    }

                    // InternalHTMLbuild.g:788:4: ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_INT) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==24) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalHTMLbuild.g:789:5: ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/'
                            {
                            // InternalHTMLbuild.g:789:5: ( (lv_ratios_3_0= RULE_INT ) )
                            // InternalHTMLbuild.g:790:6: (lv_ratios_3_0= RULE_INT )
                            {
                            // InternalHTMLbuild.g:790:6: (lv_ratios_3_0= RULE_INT )
                            // InternalHTMLbuild.g:791:7: lv_ratios_3_0= RULE_INT
                            {
                            lv_ratios_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                            							newLeafNode(lv_ratios_3_0, grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNextRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"ratios",
                            								lv_ratios_3_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,24,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getNextAccess().getSolidusKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalHTMLbuild.g:812:4: ( (lv_ratios_5_0= RULE_INT ) )
                    // InternalHTMLbuild.g:813:5: (lv_ratios_5_0= RULE_INT )
                    {
                    // InternalHTMLbuild.g:813:5: (lv_ratios_5_0= RULE_INT )
                    // InternalHTMLbuild.g:814:6: lv_ratios_5_0= RULE_INT
                    {
                    lv_ratios_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_ratios_5_0, grammarAccess.getNextAccess().getRatiosINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNextRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ratios",
                    							lv_ratios_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getNextAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNextAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNext"


    // $ANTLR start "entryRuleThen"
    // InternalHTMLbuild.g:843:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalHTMLbuild.g:843:45: (iv_ruleThen= ruleThen EOF )
            // InternalHTMLbuild.g:844:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalHTMLbuild.g:850:1: ruleThen returns [EObject current=null] : ( () otherlv_1= '<then' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_hasratio_2_0=null;
        Token lv_ratios_3_0=null;
        Token otherlv_4=null;
        Token lv_ratios_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalHTMLbuild.g:856:2: ( ( () otherlv_1= '<then' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' ) )
            // InternalHTMLbuild.g:857:2: ( () otherlv_1= '<then' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' )
            {
            // InternalHTMLbuild.g:857:2: ( () otherlv_1= '<then' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>' )
            // InternalHTMLbuild.g:858:3: () otherlv_1= '<then' ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )? otherlv_7= '>'
            {
            // InternalHTMLbuild.g:858:3: ()
            // InternalHTMLbuild.g:859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThenAccess().getThenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            // InternalHTMLbuild.g:869:3: ( ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHTMLbuild.g:870:4: ( (lv_hasratio_2_0= '(' ) ) ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )? ( (lv_ratios_5_0= RULE_INT ) ) otherlv_6= ')'
                    {
                    // InternalHTMLbuild.g:870:4: ( (lv_hasratio_2_0= '(' ) )
                    // InternalHTMLbuild.g:871:5: (lv_hasratio_2_0= '(' )
                    {
                    // InternalHTMLbuild.g:871:5: (lv_hasratio_2_0= '(' )
                    // InternalHTMLbuild.g:872:6: lv_hasratio_2_0= '('
                    {
                    lv_hasratio_2_0=(Token)match(input,23,FOLLOW_16); 

                    						newLeafNode(lv_hasratio_2_0, grammarAccess.getThenAccess().getHasratioLeftParenthesisKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThenRule());
                    						}
                    						setWithLastConsumed(current, "hasratio", true, "(");
                    					

                    }


                    }

                    // InternalHTMLbuild.g:884:4: ( ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_INT) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==24) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalHTMLbuild.g:885:5: ( (lv_ratios_3_0= RULE_INT ) ) otherlv_4= '/'
                            {
                            // InternalHTMLbuild.g:885:5: ( (lv_ratios_3_0= RULE_INT ) )
                            // InternalHTMLbuild.g:886:6: (lv_ratios_3_0= RULE_INT )
                            {
                            // InternalHTMLbuild.g:886:6: (lv_ratios_3_0= RULE_INT )
                            // InternalHTMLbuild.g:887:7: lv_ratios_3_0= RULE_INT
                            {
                            lv_ratios_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                            							newLeafNode(lv_ratios_3_0, grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThenRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"ratios",
                            								lv_ratios_3_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            otherlv_4=(Token)match(input,24,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getThenAccess().getSolidusKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalHTMLbuild.g:908:4: ( (lv_ratios_5_0= RULE_INT ) )
                    // InternalHTMLbuild.g:909:5: (lv_ratios_5_0= RULE_INT )
                    {
                    // InternalHTMLbuild.g:909:5: (lv_ratios_5_0= RULE_INT )
                    // InternalHTMLbuild.g:910:6: lv_ratios_5_0= RULE_INT
                    {
                    lv_ratios_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_ratios_5_0, grammarAccess.getThenAccess().getRatiosINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThenRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ratios",
                    							lv_ratios_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getThenAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getThenAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThen"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000162812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000062010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000162810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}