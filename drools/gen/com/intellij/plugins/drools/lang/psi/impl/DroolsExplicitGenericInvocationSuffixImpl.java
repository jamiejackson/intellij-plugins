// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.drools.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.drools.lang.lexer.DroolsTokenTypes.*;
import com.intellij.plugins.drools.lang.psi.*;

public class DroolsExplicitGenericInvocationSuffixImpl extends DroolsPsiCompositeElementImpl implements DroolsExplicitGenericInvocationSuffix {

  public DroolsExplicitGenericInvocationSuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DroolsVisitor visitor) {
    visitor.visitExplicitGenericInvocationSuffix(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DroolsVisitor) accept((DroolsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DroolsArguments getArguments() {
    return findChildByClass(DroolsArguments.class);
  }

  @Override
  @Nullable
  public DroolsIdentifier getIdentifier() {
    return findChildByClass(DroolsIdentifier.class);
  }

  @Override
  @Nullable
  public DroolsSuperSuffix getSuperSuffix() {
    return findChildByClass(DroolsSuperSuffix.class);
  }

}
