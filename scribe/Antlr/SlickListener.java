// Generated from Slick.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlickParser}.
 */
public interface SlickListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlickParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(SlickParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(SlickParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#proof}.
	 * @param ctx the parse tree
	 */
	void enterProof(SlickParser.ProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#proof}.
	 * @param ctx the parse tree
	 */
	void exitProof(SlickParser.ProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#standardProof}.
	 * @param ctx the parse tree
	 */
	void enterStandardProof(SlickParser.StandardProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#standardProof}.
	 * @param ctx the parse tree
	 */
	void exitStandardProof(SlickParser.StandardProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#startExpo}.
	 * @param ctx the parse tree
	 */
	void enterStartExpo(SlickParser.StartExpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#startExpo}.
	 * @param ctx the parse tree
	 */
	void exitStartExpo(SlickParser.StartExpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#endExpo}.
	 * @param ctx the parse tree
	 */
	void enterEndExpo(SlickParser.EndExpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#endExpo}.
	 * @param ctx the parse tree
	 */
	void exitEndExpo(SlickParser.EndExpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#proofHead}.
	 * @param ctx the parse tree
	 */
	void enterProofHead(SlickParser.ProofHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#proofHead}.
	 * @param ctx the parse tree
	 */
	void exitProofHead(SlickParser.ProofHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(SlickParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(SlickParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TheoremHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 */
	void enterTheoremHeader(SlickParser.TheoremHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TheoremHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 */
	void exitTheoremHeader(SlickParser.TheoremHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExerciseHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 */
	void enterExerciseHeader(SlickParser.ExerciseHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExerciseHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 */
	void exitExerciseHeader(SlickParser.ExerciseHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BibleTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 */
	void enterBibleTheorem(SlickParser.BibleTheoremContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BibleTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 */
	void exitBibleTheorem(SlickParser.BibleTheoremContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdHocTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 */
	void enterAdHocTheorem(SlickParser.AdHocTheoremContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdHocTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 */
	void exitAdHocTheorem(SlickParser.AdHocTheoremContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SlickParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SlickParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreviousTheoremMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterPreviousTheoremMethod(SlickParser.PreviousTheoremMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreviousTheoremMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitPreviousTheoremMethod(SlickParser.PreviousTheoremMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftEquivalesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterLeftEquivalesRightMethod(SlickParser.LeftEquivalesRightMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftEquivalesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitLeftEquivalesRightMethod(SlickParser.LeftEquivalesRightMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightEquivalesLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterRightEquivalesLeftMethod(SlickParser.RightEquivalesLeftMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightEquivalesLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitRightEquivalesLeftMethod(SlickParser.RightEquivalesLeftMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftImpliesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterLeftImpliesRightMethod(SlickParser.LeftImpliesRightMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftImpliesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitLeftImpliesRightMethod(SlickParser.LeftImpliesRightMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightFollowsLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterRightFollowsLeftMethod(SlickParser.RightFollowsLeftMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightFollowsLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitRightFollowsLeftMethod(SlickParser.RightFollowsLeftMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssumingConjunctsMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterAssumingConjunctsMethod(SlickParser.AssumingConjunctsMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssumingConjunctsMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitAssumingConjunctsMethod(SlickParser.AssumingConjunctsMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContradictionMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterContradictionMethod(SlickParser.ContradictionMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContradictionMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitContradictionMethod(SlickParser.ContradictionMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContrapositiveMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterContrapositiveMethod(SlickParser.ContrapositiveMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContrapositiveMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitContrapositiveMethod(SlickParser.ContrapositiveMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#caseProof}.
	 * @param ctx the parse tree
	 */
	void enterCaseProof(SlickParser.CaseProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#caseProof}.
	 * @param ctx the parse tree
	 */
	void exitCaseProof(SlickParser.CaseProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#caseVariable}.
	 * @param ctx the parse tree
	 */
	void enterCaseVariable(SlickParser.CaseVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#caseVariable}.
	 * @param ctx the parse tree
	 */
	void exitCaseVariable(SlickParser.CaseVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#caseList}.
	 * @param ctx the parse tree
	 */
	void enterCaseList(SlickParser.CaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#caseList}.
	 * @param ctx the parse tree
	 */
	void exitCaseList(SlickParser.CaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#case1}.
	 * @param ctx the parse tree
	 */
	void enterCase1(SlickParser.Case1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#case1}.
	 * @param ctx the parse tree
	 */
	void exitCase1(SlickParser.Case1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#case2}.
	 * @param ctx the parse tree
	 */
	void enterCase2(SlickParser.Case2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#case2}.
	 * @param ctx the parse tree
	 */
	void exitCase2(SlickParser.Case2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#caseProof1}.
	 * @param ctx the parse tree
	 */
	void enterCaseProof1(SlickParser.CaseProof1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#caseProof1}.
	 * @param ctx the parse tree
	 */
	void exitCaseProof1(SlickParser.CaseProof1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#caseProof2}.
	 * @param ctx the parse tree
	 */
	void enterCaseProof2(SlickParser.CaseProof2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#caseProof2}.
	 * @param ctx the parse tree
	 */
	void exitCaseProof2(SlickParser.CaseProof2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(SlickParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(SlickParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicationExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImplicationExpr(SlickParser.ImplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicationExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImplicationExpr(SlickParser.ImplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EquivalenceExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquivalenceExpr(SlickParser.EquivalenceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquivalenceExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquivalenceExpr(SlickParser.EquivalenceExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom(SlickParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom(SlickParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelativeExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelativeExpr(SlickParser.RelativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelativeExpr(SlickParser.RelativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetEnumExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetEnumExpr(SlickParser.SetEnumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetEnumExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetEnumExpr(SlickParser.SetEnumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SlickParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SlickParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(SlickParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(SlickParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(SlickParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(SlickParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeibnizExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeibnizExpr(SlickParser.LeibnizExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeibnizExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeibnizExpr(SlickParser.LeibnizExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetCompExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetCompExpr(SlickParser.SetCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetCompExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetCompExpr(SlickParser.SetCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneralExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneralExpr(SlickParser.GeneralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneralExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneralExpr(SlickParser.GeneralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InverseCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInverseCallExpr(SlickParser.InverseCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InverseCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInverseCallExpr(SlickParser.InverseCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SlickParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SlickParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QuantExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterQuantExpr(SlickParser.QuantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QuantExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitQuantExpr(SlickParser.QuantExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JunctionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJunctionExpr(SlickParser.JunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JunctionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJunctionExpr(SlickParser.JunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TSExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTSExpr(SlickParser.TSExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TSExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTSExpr(SlickParser.TSExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixExpr(SlickParser.UnaryPrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixExpr(SlickParser.UnaryPrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyRExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyRExpr(SlickParser.EmptyRExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyRExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyRExpr(SlickParser.EmptyRExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(SlickParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(SlickParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#hintOp}.
	 * @param ctx the parse tree
	 */
	void enterHintOp(SlickParser.HintOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#hintOp}.
	 * @param ctx the parse tree
	 */
	void exitHintOp(SlickParser.HintOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(SlickParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(SlickParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(SlickParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(SlickParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#emptyRangeExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyRangeExpr(SlickParser.EmptyRangeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#emptyRangeExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyRangeExpr(SlickParser.EmptyRangeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedExpr(SlickParser.QuantifiedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedExpr(SlickParser.QuantifiedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#setEnumeration}.
	 * @param ctx the parse tree
	 */
	void enterSetEnumeration(SlickParser.SetEnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#setEnumeration}.
	 * @param ctx the parse tree
	 */
	void exitSetEnumeration(SlickParser.SetEnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#setComprehension}.
	 * @param ctx the parse tree
	 */
	void enterSetComprehension(SlickParser.SetComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#setComprehension}.
	 * @param ctx the parse tree
	 */
	void exitSetComprehension(SlickParser.SetComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#inverseCall}.
	 * @param ctx the parse tree
	 */
	void enterInverseCall(SlickParser.InverseCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#inverseCall}.
	 * @param ctx the parse tree
	 */
	void exitInverseCall(SlickParser.InverseCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDot}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDot(SlickParser.FunctionDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDot}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDot(SlickParser.FunctionDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionParen}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParen(SlickParser.FunctionParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionParen}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParen(SlickParser.FunctionParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlickParser#typedVar}.
	 * @param ctx the parse tree
	 */
	void enterTypedVar(SlickParser.TypedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlickParser#typedVar}.
	 * @param ctx the parse tree
	 */
	void exitTypedVar(SlickParser.TypedVarContext ctx);
}