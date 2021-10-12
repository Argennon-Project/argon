/*
 * Copyright 2021 aybehrouz <behrouz_ayati@yahoo.com>. This file is part
 * of the Argon programming language repository.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.argonlang.argc.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArgonParser}.
 */
public interface ArgonParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ArgonParser#compilationUnit}.
     * @param ctx the parse tree
     */
    void enterCompilationUnit(ArgonParser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#compilationUnit}.
     * @param ctx the parse tree
     */
    void exitCompilationUnit(ArgonParser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#packageDeclaration}.
     * @param ctx the parse tree
     */
    void enterPackageDeclaration(ArgonParser.PackageDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#packageDeclaration}.
     * @param ctx the parse tree
     */
    void exitPackageDeclaration(ArgonParser.PackageDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#importDeclaration}.
     * @param ctx the parse tree
     */
    void enterImportDeclaration(ArgonParser.ImportDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#importDeclaration}.
     * @param ctx the parse tree
     */
    void exitImportDeclaration(ArgonParser.ImportDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeDeclaration}.
     * @param ctx the parse tree
     */
    void enterTypeDeclaration(ArgonParser.TypeDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeDeclaration}.
     * @param ctx the parse tree
     */
    void exitTypeDeclaration(ArgonParser.TypeDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#modifier}.
     * @param ctx the parse tree
     */
    void enterModifier(ArgonParser.ModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#modifier}.
     * @param ctx the parse tree
     */
    void exitModifier(ArgonParser.ModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classOrInterfaceModifier}.
     * @param ctx the parse tree
     */
    void enterClassOrInterfaceModifier(ArgonParser.ClassOrInterfaceModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classOrInterfaceModifier}.
     * @param ctx the parse tree
     */
    void exitClassOrInterfaceModifier(ArgonParser.ClassOrInterfaceModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#variableModifier}.
     * @param ctx the parse tree
     */
    void enterVariableModifier(ArgonParser.VariableModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#variableModifier}.
     * @param ctx the parse tree
     */
    void exitVariableModifier(ArgonParser.VariableModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classDeclaration}.
     * @param ctx the parse tree
     */
    void enterClassDeclaration(ArgonParser.ClassDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classDeclaration}.
     * @param ctx the parse tree
     */
    void exitClassDeclaration(ArgonParser.ClassDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeParameters}.
     * @param ctx the parse tree
     */
    void enterTypeParameters(ArgonParser.TypeParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeParameters}.
     * @param ctx the parse tree
     */
    void exitTypeParameters(ArgonParser.TypeParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeParameter}.
     * @param ctx the parse tree
     */
    void enterTypeParameter(ArgonParser.TypeParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeParameter}.
     * @param ctx the parse tree
     */
    void exitTypeParameter(ArgonParser.TypeParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeBound}.
     * @param ctx the parse tree
     */
    void enterTypeBound(ArgonParser.TypeBoundContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeBound}.
     * @param ctx the parse tree
     */
    void exitTypeBound(ArgonParser.TypeBoundContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#enumDeclaration}.
     * @param ctx the parse tree
     */
    void enterEnumDeclaration(ArgonParser.EnumDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#enumDeclaration}.
     * @param ctx the parse tree
     */
    void exitEnumDeclaration(ArgonParser.EnumDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#enumConstants}.
     * @param ctx the parse tree
     */
    void enterEnumConstants(ArgonParser.EnumConstantsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#enumConstants}.
     * @param ctx the parse tree
     */
    void exitEnumConstants(ArgonParser.EnumConstantsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#enumConstant}.
     * @param ctx the parse tree
     */
    void enterEnumConstant(ArgonParser.EnumConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#enumConstant}.
     * @param ctx the parse tree
     */
    void exitEnumConstant(ArgonParser.EnumConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#enumBodyDeclarations}.
     * @param ctx the parse tree
     */
    void enterEnumBodyDeclarations(ArgonParser.EnumBodyDeclarationsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#enumBodyDeclarations}.
     * @param ctx the parse tree
     */
    void exitEnumBodyDeclarations(ArgonParser.EnumBodyDeclarationsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceDeclaration}.
     * @param ctx the parse tree
     */
    void enterInterfaceDeclaration(ArgonParser.InterfaceDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceDeclaration}.
     * @param ctx the parse tree
     */
    void exitInterfaceDeclaration(ArgonParser.InterfaceDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classBody}.
     * @param ctx the parse tree
     */
    void enterClassBody(ArgonParser.ClassBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classBody}.
     * @param ctx the parse tree
     */
    void exitClassBody(ArgonParser.ClassBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceBody}.
     * @param ctx the parse tree
     */
    void enterInterfaceBody(ArgonParser.InterfaceBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceBody}.
     * @param ctx the parse tree
     */
    void exitInterfaceBody(ArgonParser.InterfaceBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classBodyDeclaration}.
     * @param ctx the parse tree
     */
    void enterClassBodyDeclaration(ArgonParser.ClassBodyDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classBodyDeclaration}.
     * @param ctx the parse tree
     */
    void exitClassBodyDeclaration(ArgonParser.ClassBodyDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code methodDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterMethodDeclarationFull(ArgonParser.MethodDeclarationFullContext ctx);

    /**
     * Exit a parse tree produced by the {@code methodDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitMethodDeclarationFull(ArgonParser.MethodDeclarationFullContext ctx);

    /**
     * Enter a parse tree produced by the {@code genericMethodDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterGenericMethodDeclarationFull(ArgonParser.GenericMethodDeclarationFullContext ctx);

    /**
     * Exit a parse tree produced by the {@code genericMethodDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitGenericMethodDeclarationFull(ArgonParser.GenericMethodDeclarationFullContext ctx);

    /**
     * Enter a parse tree produced by the {@code fieldDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterFieldDeclarationFull(ArgonParser.FieldDeclarationFullContext ctx);

    /**
     * Exit a parse tree produced by the {@code fieldDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitFieldDeclarationFull(ArgonParser.FieldDeclarationFullContext ctx);

    /**
     * Enter a parse tree produced by the {@code constructorDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterConstructorDeclarationFull(ArgonParser.ConstructorDeclarationFullContext ctx);

    /**
     * Exit a parse tree produced by the {@code constructorDeclarationFull}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitConstructorDeclarationFull(ArgonParser.ConstructorDeclarationFullContext ctx);

    /**
     * Enter a parse tree produced by the {@code temp}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterTemp(ArgonParser.TempContext ctx);

    /**
     * Exit a parse tree produced by the {@code temp}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitTemp(ArgonParser.TempContext ctx);

    /**
     * Enter a parse tree produced by the {@code innerInterfaceDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterInnerInterfaceDeclaration(ArgonParser.InnerInterfaceDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code innerInterfaceDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitInnerInterfaceDeclaration(ArgonParser.InnerInterfaceDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code innerClassDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterInnerClassDeclaration(ArgonParser.InnerClassDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code innerClassDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitInnerClassDeclaration(ArgonParser.InnerClassDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code innerEnumDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void enterInnerEnumDeclaration(ArgonParser.InnerEnumDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code innerEnumDeclaration}
     * labeled alternative in {@link ArgonParser#memberDeclaration}.
     * @param ctx the parse tree
     */
    void exitInnerEnumDeclaration(ArgonParser.InnerEnumDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#methodDeclaration}.
     * @param ctx the parse tree
     */
    void enterMethodDeclaration(ArgonParser.MethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#methodDeclaration}.
     * @param ctx the parse tree
     */
    void exitMethodDeclaration(ArgonParser.MethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#methodBody}.
     * @param ctx the parse tree
     */
    void enterMethodBody(ArgonParser.MethodBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#methodBody}.
     * @param ctx the parse tree
     */
    void exitMethodBody(ArgonParser.MethodBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeTypeOrVoid}.
     * @param ctx the parse tree
     */
    void enterTypeTypeOrVoid(ArgonParser.TypeTypeOrVoidContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeTypeOrVoid}.
     * @param ctx the parse tree
     */
    void exitTypeTypeOrVoid(ArgonParser.TypeTypeOrVoidContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#genericMethodDeclaration}.
     * @param ctx the parse tree
     */
    void enterGenericMethodDeclaration(ArgonParser.GenericMethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#genericMethodDeclaration}.
     * @param ctx the parse tree
     */
    void exitGenericMethodDeclaration(ArgonParser.GenericMethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#genericConstructorDeclaration}.
     * @param ctx the parse tree
     */
    void enterGenericConstructorDeclaration(ArgonParser.GenericConstructorDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#genericConstructorDeclaration}.
     * @param ctx the parse tree
     */
    void exitGenericConstructorDeclaration(ArgonParser.GenericConstructorDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#constructorDeclaration}.
     * @param ctx the parse tree
     */
    void enterConstructorDeclaration(ArgonParser.ConstructorDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#constructorDeclaration}.
     * @param ctx the parse tree
     */
    void exitConstructorDeclaration(ArgonParser.ConstructorDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#fieldDeclaration}.
     * @param ctx the parse tree
     */
    void enterFieldDeclaration(ArgonParser.FieldDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#fieldDeclaration}.
     * @param ctx the parse tree
     */
    void exitFieldDeclaration(ArgonParser.FieldDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceBodyDeclaration}.
     * @param ctx the parse tree
     */
    void enterInterfaceBodyDeclaration(ArgonParser.InterfaceBodyDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceBodyDeclaration}.
     * @param ctx the parse tree
     */
    void exitInterfaceBodyDeclaration(ArgonParser.InterfaceBodyDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceMemberDeclaration}.
     * @param ctx the parse tree
     */
    void enterInterfaceMemberDeclaration(ArgonParser.InterfaceMemberDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceMemberDeclaration}.
     * @param ctx the parse tree
     */
    void exitInterfaceMemberDeclaration(ArgonParser.InterfaceMemberDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#constDeclaration}.
     * @param ctx the parse tree
     */
    void enterConstDeclaration(ArgonParser.ConstDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#constDeclaration}.
     * @param ctx the parse tree
     */
    void exitConstDeclaration(ArgonParser.ConstDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#constantDeclarator}.
     * @param ctx the parse tree
     */
    void enterConstantDeclarator(ArgonParser.ConstantDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#constantDeclarator}.
     * @param ctx the parse tree
     */
    void exitConstantDeclarator(ArgonParser.ConstantDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceMethodDeclaration}.
     * @param ctx the parse tree
     */
    void enterInterfaceMethodDeclaration(ArgonParser.InterfaceMethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceMethodDeclaration}.
     * @param ctx the parse tree
     */
    void exitInterfaceMethodDeclaration(ArgonParser.InterfaceMethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#interfaceMethodModifier}.
     * @param ctx the parse tree
     */
    void enterInterfaceMethodModifier(ArgonParser.InterfaceMethodModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#interfaceMethodModifier}.
     * @param ctx the parse tree
     */
    void exitInterfaceMethodModifier(ArgonParser.InterfaceMethodModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#genericInterfaceMethodDeclaration}.
     * @param ctx the parse tree
     */
    void enterGenericInterfaceMethodDeclaration(ArgonParser.GenericInterfaceMethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#genericInterfaceMethodDeclaration}.
     * @param ctx the parse tree
     */
    void exitGenericInterfaceMethodDeclaration(ArgonParser.GenericInterfaceMethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#variableDeclarators}.
     * @param ctx the parse tree
     */
    void enterVariableDeclarators(ArgonParser.VariableDeclaratorsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#variableDeclarators}.
     * @param ctx the parse tree
     */
    void exitVariableDeclarators(ArgonParser.VariableDeclaratorsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#variableDeclarator}.
     * @param ctx the parse tree
     */
    void enterVariableDeclarator(ArgonParser.VariableDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#variableDeclarator}.
     * @param ctx the parse tree
     */
    void exitVariableDeclarator(ArgonParser.VariableDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#variableInitializer}.
     * @param ctx the parse tree
     */
    void enterVariableInitializer(ArgonParser.VariableInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#variableInitializer}.
     * @param ctx the parse tree
     */
    void exitVariableInitializer(ArgonParser.VariableInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#arrayInitializer}.
     * @param ctx the parse tree
     */
    void enterArrayInitializer(ArgonParser.ArrayInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#arrayInitializer}.
     * @param ctx the parse tree
     */
    void exitArrayInitializer(ArgonParser.ArrayInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classOrInterfaceType}.
     * @param ctx the parse tree
     */
    void enterClassOrInterfaceType(ArgonParser.ClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classOrInterfaceType}.
     * @param ctx the parse tree
     */
    void exitClassOrInterfaceType(ArgonParser.ClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeArgument}.
     * @param ctx the parse tree
     */
    void enterTypeArgument(ArgonParser.TypeArgumentContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeArgument}.
     * @param ctx the parse tree
     */
    void exitTypeArgument(ArgonParser.TypeArgumentContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#qualifiedNameList}.
     * @param ctx the parse tree
     */
    void enterQualifiedNameList(ArgonParser.QualifiedNameListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#qualifiedNameList}.
     * @param ctx the parse tree
     */
    void exitQualifiedNameList(ArgonParser.QualifiedNameListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#formalParameters}.
     * @param ctx the parse tree
     */
    void enterFormalParameters(ArgonParser.FormalParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#formalParameters}.
     * @param ctx the parse tree
     */
    void exitFormalParameters(ArgonParser.FormalParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#formalParameterList}.
     * @param ctx the parse tree
     */
    void enterFormalParameterList(ArgonParser.FormalParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#formalParameterList}.
     * @param ctx the parse tree
     */
    void exitFormalParameterList(ArgonParser.FormalParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#formalParameter}.
     * @param ctx the parse tree
     */
    void enterFormalParameter(ArgonParser.FormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#formalParameter}.
     * @param ctx the parse tree
     */
    void exitFormalParameter(ArgonParser.FormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#lastFormalParameter}.
     * @param ctx the parse tree
     */
    void enterLastFormalParameter(ArgonParser.LastFormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#lastFormalParameter}.
     * @param ctx the parse tree
     */
    void exitLastFormalParameter(ArgonParser.LastFormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#qualifiedName}.
     * @param ctx the parse tree
     */
    void enterQualifiedName(ArgonParser.QualifiedNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#qualifiedName}.
     * @param ctx the parse tree
     */
    void exitQualifiedName(ArgonParser.QualifiedNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#literal}.
     * @param ctx the parse tree
     */
    void enterLiteral(ArgonParser.LiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#literal}.
     * @param ctx the parse tree
     */
    void exitLiteral(ArgonParser.LiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#integerLiteral}.
     * @param ctx the parse tree
     */
    void enterIntegerLiteral(ArgonParser.IntegerLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#integerLiteral}.
     * @param ctx the parse tree
     */
    void exitIntegerLiteral(ArgonParser.IntegerLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#floatLiteral}.
     * @param ctx the parse tree
     */
    void enterFloatLiteral(ArgonParser.FloatLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#floatLiteral}.
     * @param ctx the parse tree
     */
    void exitFloatLiteral(ArgonParser.FloatLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#altAnnotationQualifiedName}.
     * @param ctx the parse tree
     */
    void enterAltAnnotationQualifiedName(ArgonParser.AltAnnotationQualifiedNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#altAnnotationQualifiedName}.
     * @param ctx the parse tree
     */
    void exitAltAnnotationQualifiedName(ArgonParser.AltAnnotationQualifiedNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotation}.
     * @param ctx the parse tree
     */
    void enterAnnotation(ArgonParser.AnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotation}.
     * @param ctx the parse tree
     */
    void exitAnnotation(ArgonParser.AnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#elementValuePairs}.
     * @param ctx the parse tree
     */
    void enterElementValuePairs(ArgonParser.ElementValuePairsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#elementValuePairs}.
     * @param ctx the parse tree
     */
    void exitElementValuePairs(ArgonParser.ElementValuePairsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#elementValuePair}.
     * @param ctx the parse tree
     */
    void enterElementValuePair(ArgonParser.ElementValuePairContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#elementValuePair}.
     * @param ctx the parse tree
     */
    void exitElementValuePair(ArgonParser.ElementValuePairContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#elementValue}.
     * @param ctx the parse tree
     */
    void enterElementValue(ArgonParser.ElementValueContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#elementValue}.
     * @param ctx the parse tree
     */
    void exitElementValue(ArgonParser.ElementValueContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#elementValueArrayInitializer}.
     * @param ctx the parse tree
     */
    void enterElementValueArrayInitializer(ArgonParser.ElementValueArrayInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#elementValueArrayInitializer}.
     * @param ctx the parse tree
     */
    void exitElementValueArrayInitializer(ArgonParser.ElementValueArrayInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationTypeDeclaration}.
     * @param ctx the parse tree
     */
    void enterAnnotationTypeDeclaration(ArgonParser.AnnotationTypeDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationTypeDeclaration}.
     * @param ctx the parse tree
     */
    void exitAnnotationTypeDeclaration(ArgonParser.AnnotationTypeDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationTypeBody}.
     * @param ctx the parse tree
     */
    void enterAnnotationTypeBody(ArgonParser.AnnotationTypeBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationTypeBody}.
     * @param ctx the parse tree
     */
    void exitAnnotationTypeBody(ArgonParser.AnnotationTypeBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationTypeElementDeclaration}.
     * @param ctx the parse tree
     */
    void enterAnnotationTypeElementDeclaration(ArgonParser.AnnotationTypeElementDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationTypeElementDeclaration}.
     * @param ctx the parse tree
     */
    void exitAnnotationTypeElementDeclaration(ArgonParser.AnnotationTypeElementDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationTypeElementRest}.
     * @param ctx the parse tree
     */
    void enterAnnotationTypeElementRest(ArgonParser.AnnotationTypeElementRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationTypeElementRest}.
     * @param ctx the parse tree
     */
    void exitAnnotationTypeElementRest(ArgonParser.AnnotationTypeElementRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationMethodOrConstantRest}.
     * @param ctx the parse tree
     */
    void enterAnnotationMethodOrConstantRest(ArgonParser.AnnotationMethodOrConstantRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationMethodOrConstantRest}.
     * @param ctx the parse tree
     */
    void exitAnnotationMethodOrConstantRest(ArgonParser.AnnotationMethodOrConstantRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationMethodRest}.
     * @param ctx the parse tree
     */
    void enterAnnotationMethodRest(ArgonParser.AnnotationMethodRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationMethodRest}.
     * @param ctx the parse tree
     */
    void exitAnnotationMethodRest(ArgonParser.AnnotationMethodRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#annotationConstantRest}.
     * @param ctx the parse tree
     */
    void enterAnnotationConstantRest(ArgonParser.AnnotationConstantRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#annotationConstantRest}.
     * @param ctx the parse tree
     */
    void exitAnnotationConstantRest(ArgonParser.AnnotationConstantRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#defaultValue}.
     * @param ctx the parse tree
     */
    void enterDefaultValue(ArgonParser.DefaultValueContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#defaultValue}.
     * @param ctx the parse tree
     */
    void exitDefaultValue(ArgonParser.DefaultValueContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#block}.
     * @param ctx the parse tree
     */
    void enterBlock(ArgonParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#block}.
     * @param ctx the parse tree
     */
    void exitBlock(ArgonParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#blockStatement}.
     * @param ctx the parse tree
     */
    void enterBlockStatement(ArgonParser.BlockStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#blockStatement}.
     * @param ctx the parse tree
     */
    void exitBlockStatement(ArgonParser.BlockStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#localVariableDeclaration}.
     * @param ctx the parse tree
     */
    void enterLocalVariableDeclaration(ArgonParser.LocalVariableDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#localVariableDeclaration}.
     * @param ctx the parse tree
     */
    void exitLocalVariableDeclaration(ArgonParser.LocalVariableDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#localTypeDeclaration}.
     * @param ctx the parse tree
     */
    void enterLocalTypeDeclaration(ArgonParser.LocalTypeDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#localTypeDeclaration}.
     * @param ctx the parse tree
     */
    void exitLocalTypeDeclaration(ArgonParser.LocalTypeDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#statement}.
     * @param ctx the parse tree
     */
    void enterStatement(ArgonParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#statement}.
     * @param ctx the parse tree
     */
    void exitStatement(ArgonParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#catchClause}.
     * @param ctx the parse tree
     */
    void enterCatchClause(ArgonParser.CatchClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#catchClause}.
     * @param ctx the parse tree
     */
    void exitCatchClause(ArgonParser.CatchClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#catchType}.
     * @param ctx the parse tree
     */
    void enterCatchType(ArgonParser.CatchTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#catchType}.
     * @param ctx the parse tree
     */
    void exitCatchType(ArgonParser.CatchTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#finallyBlock}.
     * @param ctx the parse tree
     */
    void enterFinallyBlock(ArgonParser.FinallyBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#finallyBlock}.
     * @param ctx the parse tree
     */
    void exitFinallyBlock(ArgonParser.FinallyBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#resourceSpecification}.
     * @param ctx the parse tree
     */
    void enterResourceSpecification(ArgonParser.ResourceSpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#resourceSpecification}.
     * @param ctx the parse tree
     */
    void exitResourceSpecification(ArgonParser.ResourceSpecificationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#resources}.
     * @param ctx the parse tree
     */
    void enterResources(ArgonParser.ResourcesContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#resources}.
     * @param ctx the parse tree
     */
    void exitResources(ArgonParser.ResourcesContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#resource}.
     * @param ctx the parse tree
     */
    void enterResource(ArgonParser.ResourceContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#resource}.
     * @param ctx the parse tree
     */
    void exitResource(ArgonParser.ResourceContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#switchBlockStatementGroup}.
     * @param ctx the parse tree
     */
    void enterSwitchBlockStatementGroup(ArgonParser.SwitchBlockStatementGroupContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#switchBlockStatementGroup}.
     * @param ctx the parse tree
     */
    void exitSwitchBlockStatementGroup(ArgonParser.SwitchBlockStatementGroupContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#switchLabel}.
     * @param ctx the parse tree
     */
    void enterSwitchLabel(ArgonParser.SwitchLabelContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#switchLabel}.
     * @param ctx the parse tree
     */
    void exitSwitchLabel(ArgonParser.SwitchLabelContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#forControl}.
     * @param ctx the parse tree
     */
    void enterForControl(ArgonParser.ForControlContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#forControl}.
     * @param ctx the parse tree
     */
    void exitForControl(ArgonParser.ForControlContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#forInit}.
     * @param ctx the parse tree
     */
    void enterForInit(ArgonParser.ForInitContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#forInit}.
     * @param ctx the parse tree
     */
    void exitForInit(ArgonParser.ForInitContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#enhancedForControl}.
     * @param ctx the parse tree
     */
    void enterEnhancedForControl(ArgonParser.EnhancedForControlContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#enhancedForControl}.
     * @param ctx the parse tree
     */
    void exitEnhancedForControl(ArgonParser.EnhancedForControlContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#parExpression}.
     * @param ctx the parse tree
     */
    void enterParExpression(ArgonParser.ParExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#parExpression}.
     * @param ctx the parse tree
     */
    void exitParExpression(ArgonParser.ParExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionList(ArgonParser.ExpressionListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#expressionList}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionList(ArgonParser.ExpressionListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#methodCall}.
     *
     * @param ctx the parse tree
     */
    void enterMethodCall(ArgonParser.MethodCallContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#methodCall}.
     *
     * @param ctx the parse tree
     */
    void exitMethodCall(ArgonParser.MethodCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code methodCallExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterMethodCallExpr(ArgonParser.MethodCallExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code methodCallExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitMethodCallExpr(ArgonParser.MethodCallExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code tmpExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterTmpExpr(ArgonParser.TmpExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code tmpExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitTmpExpr(ArgonParser.TmpExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code dotExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterDotExpr(ArgonParser.DotExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code dotExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitDotExpr(ArgonParser.DotExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code primaryExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryExpr(ArgonParser.PrimaryExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code primaryExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryExpr(ArgonParser.PrimaryExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code arrayExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterArrayExpr(ArgonParser.ArrayExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code arrayExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitArrayExpr(ArgonParser.ArrayExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code addExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAddExpr(ArgonParser.AddExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code addExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAddExpr(ArgonParser.AddExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code mulExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterMulExpr(ArgonParser.MulExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code mulExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitMulExpr(ArgonParser.MulExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code assignExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterAssignExpr(ArgonParser.AssignExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code assignExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitAssignExpr(ArgonParser.AssignExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code cmpExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterCmpExpr(ArgonParser.CmpExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code cmpExpr}
     * labeled alternative in {@link ArgonParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitCmpExpr(ArgonParser.CmpExprContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#lambdaExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaExpression(ArgonParser.LambdaExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#lambdaExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaExpression(ArgonParser.LambdaExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#lambdaParameters}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaParameters(ArgonParser.LambdaParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#lambdaParameters}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaParameters(ArgonParser.LambdaParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#lambdaBody}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaBody(ArgonParser.LambdaBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#lambdaBody}.
     * @param ctx the parse tree
     */
    void exitLambdaBody(ArgonParser.LambdaBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#primary}.
     * @param ctx the parse tree
     */
    void enterPrimary(ArgonParser.PrimaryContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#primary}.
     * @param ctx the parse tree
     */
    void exitPrimary(ArgonParser.PrimaryContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classType}.
     * @param ctx the parse tree
     */
    void enterClassType(ArgonParser.ClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classType}.
     * @param ctx the parse tree
     */
    void exitClassType(ArgonParser.ClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#creator}.
     * @param ctx the parse tree
     */
    void enterCreator(ArgonParser.CreatorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#creator}.
     * @param ctx the parse tree
     */
    void exitCreator(ArgonParser.CreatorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#createdName}.
     * @param ctx the parse tree
     */
    void enterCreatedName(ArgonParser.CreatedNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#createdName}.
     * @param ctx the parse tree
     */
    void exitCreatedName(ArgonParser.CreatedNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#innerCreator}.
     * @param ctx the parse tree
     */
    void enterInnerCreator(ArgonParser.InnerCreatorContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#innerCreator}.
     * @param ctx the parse tree
     */
    void exitInnerCreator(ArgonParser.InnerCreatorContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#arrayCreatorRest}.
     * @param ctx the parse tree
     */
    void enterArrayCreatorRest(ArgonParser.ArrayCreatorRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#arrayCreatorRest}.
     * @param ctx the parse tree
     */
    void exitArrayCreatorRest(ArgonParser.ArrayCreatorRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#classCreatorRest}.
     * @param ctx the parse tree
     */
    void enterClassCreatorRest(ArgonParser.ClassCreatorRestContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#classCreatorRest}.
     * @param ctx the parse tree
     */
    void exitClassCreatorRest(ArgonParser.ClassCreatorRestContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#explicitGenericInvocation}.
     * @param ctx the parse tree
     */
    void enterExplicitGenericInvocation(ArgonParser.ExplicitGenericInvocationContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#explicitGenericInvocation}.
     * @param ctx the parse tree
     */
    void exitExplicitGenericInvocation(ArgonParser.ExplicitGenericInvocationContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeArgumentsOrDiamond}.
     * @param ctx the parse tree
     */
    void enterTypeArgumentsOrDiamond(ArgonParser.TypeArgumentsOrDiamondContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeArgumentsOrDiamond}.
     * @param ctx the parse tree
     */
    void exitTypeArgumentsOrDiamond(ArgonParser.TypeArgumentsOrDiamondContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#nonWildcardTypeArgumentsOrDiamond}.
     * @param ctx the parse tree
     */
    void enterNonWildcardTypeArgumentsOrDiamond(ArgonParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#nonWildcardTypeArgumentsOrDiamond}.
     * @param ctx the parse tree
     */
    void exitNonWildcardTypeArgumentsOrDiamond(ArgonParser.NonWildcardTypeArgumentsOrDiamondContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#nonWildcardTypeArguments}.
     * @param ctx the parse tree
     */
    void enterNonWildcardTypeArguments(ArgonParser.NonWildcardTypeArgumentsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#nonWildcardTypeArguments}.
     * @param ctx the parse tree
     */
    void exitNonWildcardTypeArguments(ArgonParser.NonWildcardTypeArgumentsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeList}.
     * @param ctx the parse tree
     */
    void enterTypeList(ArgonParser.TypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeList}.
     * @param ctx the parse tree
     */
    void exitTypeList(ArgonParser.TypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeType}.
     * @param ctx the parse tree
     */
    void enterTypeType(ArgonParser.TypeTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeType}.
     * @param ctx the parse tree
     */
    void exitTypeType(ArgonParser.TypeTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#simpleType}.
     * @param ctx the parse tree
     */
    void enterSimpleType(ArgonParser.SimpleTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#simpleType}.
     * @param ctx the parse tree
     */
    void exitSimpleType(ArgonParser.SimpleTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#primitiveType}.
     * @param ctx the parse tree
     */
    void enterPrimitiveType(ArgonParser.PrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#primitiveType}.
     * @param ctx the parse tree
     */
    void exitPrimitiveType(ArgonParser.PrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#typeArguments}.
     * @param ctx the parse tree
     */
    void enterTypeArguments(ArgonParser.TypeArgumentsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#typeArguments}.
     * @param ctx the parse tree
     */
    void exitTypeArguments(ArgonParser.TypeArgumentsContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#superSuffix}.
     * @param ctx the parse tree
     */
    void enterSuperSuffix(ArgonParser.SuperSuffixContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#superSuffix}.
     * @param ctx the parse tree
     */
    void exitSuperSuffix(ArgonParser.SuperSuffixContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#explicitGenericInvocationSuffix}.
     * @param ctx the parse tree
     */
    void enterExplicitGenericInvocationSuffix(ArgonParser.ExplicitGenericInvocationSuffixContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#explicitGenericInvocationSuffix}.
     * @param ctx the parse tree
     */
    void exitExplicitGenericInvocationSuffix(ArgonParser.ExplicitGenericInvocationSuffixContext ctx);

    /**
     * Enter a parse tree produced by {@link ArgonParser#arguments}.
     * @param ctx the parse tree
     */
    void enterArguments(ArgonParser.ArgumentsContext ctx);

    /**
     * Exit a parse tree produced by {@link ArgonParser#arguments}.
     * @param ctx the parse tree
     */
    void exitArguments(ArgonParser.ArgumentsContext ctx);
}