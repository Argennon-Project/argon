// Generated from /home/aybehrouz/IdeaProjects/argon/src/org/argonlang/argc/grammar/ArgonParser.g4 by ANTLR 4.9.1
package org.argonlang.argc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArgonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArgonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArgonParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ArgonParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ArgonParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ArgonParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ArgonParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ArgonParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(ArgonParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ArgonParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ArgonParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ArgonParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ArgonParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ArgonParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ArgonParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(ArgonParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(ArgonParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(ArgonParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ArgonParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ArgonParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ArgonParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ArgonParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclarationFull}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationFull(ArgonParser.MethodDeclarationFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericMethodDeclarationFull}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclarationFull(ArgonParser.GenericMethodDeclarationFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDeclarationFull}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclarationFull(ArgonParser.FieldDeclarationFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorDeclarationFull}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationFull(ArgonParser.ConstructorDeclarationFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code temp}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp(ArgonParser.TempContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerInterfaceDeclaration}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerInterfaceDeclaration(ArgonParser.InnerInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerClassDeclaration}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerClassDeclaration(ArgonParser.InnerClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerEnumDeclaration}
	 * labeled alternative in {@link ArgonParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerEnumDeclaration(ArgonParser.InnerEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ArgonParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ArgonParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(ArgonParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(ArgonParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(ArgonParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ArgonParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ArgonParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(ArgonParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(ArgonParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ArgonParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(ArgonParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ArgonParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(ArgonParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(ArgonParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ArgonParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ArgonParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ArgonParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ArgonParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ArgonParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ArgonParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(ArgonParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ArgonParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ArgonParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ArgonParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ArgonParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ArgonParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ArgonParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ArgonParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(ArgonParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(ArgonParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ArgonParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(ArgonParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ArgonParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ArgonParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ArgonParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(ArgonParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(ArgonParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(ArgonParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(ArgonParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(ArgonParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(ArgonParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(ArgonParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(ArgonParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ArgonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ArgonParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ArgonParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(ArgonParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArgonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ArgonParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(ArgonParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(ArgonParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(ArgonParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(ArgonParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(ArgonParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(ArgonParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ArgonParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ArgonParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ArgonParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ArgonParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ArgonParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ArgonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ArgonParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ArgonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(ArgonParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(ArgonParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(ArgonParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ArgonParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(ArgonParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(ArgonParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(ArgonParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(ArgonParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(ArgonParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(ArgonParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(ArgonParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(ArgonParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(ArgonParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(ArgonParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ArgonParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(ArgonParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(ArgonParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ArgonParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ArgonParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(ArgonParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(ArgonParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArgonParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ArgonParser.ArgumentsContext ctx);
}