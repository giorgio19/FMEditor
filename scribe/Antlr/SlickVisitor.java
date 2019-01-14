// Generated from Slick.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlickParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlickVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlickParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(SlickParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#proof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof(SlickParser.ProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#standardProof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardProof(SlickParser.StandardProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#startExpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartExpo(SlickParser.StartExpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#endExpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndExpo(SlickParser.EndExpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#proofHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofHead(SlickParser.ProofHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(SlickParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TheoremHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoremHeader(SlickParser.TheoremHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExerciseHeader}
	 * labeled alternative in {@link SlickParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExerciseHeader(SlickParser.ExerciseHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BibleTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibleTheorem(SlickParser.BibleTheoremContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdHocTheorem}
	 * labeled alternative in {@link SlickParser#theorem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdHocTheorem(SlickParser.AdHocTheoremContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SlickParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreviousTheoremMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreviousTheoremMethod(SlickParser.PreviousTheoremMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftEquivalesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftEquivalesRightMethod(SlickParser.LeftEquivalesRightMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightEquivalesLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightEquivalesLeftMethod(SlickParser.RightEquivalesLeftMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftImpliesRightMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftImpliesRightMethod(SlickParser.LeftImpliesRightMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightFollowsLeftMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightFollowsLeftMethod(SlickParser.RightFollowsLeftMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssumingConjunctsMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumingConjunctsMethod(SlickParser.AssumingConjunctsMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContradictionMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradictionMethod(SlickParser.ContradictionMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContrapositiveMethod}
	 * labeled alternative in {@link SlickParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContrapositiveMethod(SlickParser.ContrapositiveMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#caseProof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseProof(SlickParser.CaseProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#caseVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseVariable(SlickParser.CaseVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#caseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseList(SlickParser.CaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#case1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase1(SlickParser.Case1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#case2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase2(SlickParser.Case2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#caseProof1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseProof1(SlickParser.CaseProof1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#caseProof2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseProof2(SlickParser.CaseProof2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SlickParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicationExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationExpr(SlickParser.ImplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquivalenceExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalenceExpr(SlickParser.EquivalenceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(SlickParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelativeExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeExpr(SlickParser.RelativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetEnumExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumExpr(SlickParser.SetEnumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SlickParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(SlickParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpr(SlickParser.AdditionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeibnizExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeibnizExpr(SlickParser.LeibnizExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCompExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompExpr(SlickParser.SetCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeneralExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralExpr(SlickParser.GeneralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InverseCallExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseCallExpr(SlickParser.InverseCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SlickParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuantExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantExpr(SlickParser.QuantExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JunctionExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJunctionExpr(SlickParser.JunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSExpr(SlickParser.TSExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixExpr(SlickParser.UnaryPrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyRExpr}
	 * labeled alternative in {@link SlickParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyRExpr(SlickParser.EmptyRExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SlickParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#hintOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintOp(SlickParser.HintOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(SlickParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(SlickParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#emptyRangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyRangeExpr(SlickParser.EmptyRangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#quantifiedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedExpr(SlickParser.QuantifiedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#setEnumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumeration(SlickParser.SetEnumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#setComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetComprehension(SlickParser.SetComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#inverseCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseCall(SlickParser.InverseCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDot}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDot(SlickParser.FunctionDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionParen}
	 * labeled alternative in {@link SlickParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParen(SlickParser.FunctionParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlickParser#typedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVar(SlickParser.TypedVarContext ctx);
}