package org.sonar.samples.java.checks;

import java.util.List;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree.Kind;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;

import com.google.common.collect.ImmutableList;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.MethodTree;

@Rule(key =  "AvoidTooManyParametersForMethod",description = "Method should not have more than five input parameters", 
priority = Priority.MINOR, tags = {"bug"})
public class AvoidTooManyParametersForMethodRule 
	extends IssuableSubscriptionVisitor{

	@Override
	public List<Kind> nodesToVisit(){
		return ImmutableList.of(Tree.Kind.METHOD);
		
	}
	
	@Override
	public void visitNode(Tree tree) {
		MethodTree methodTree = (MethodTree) tree;
		
		MethodSymbol methodSymbol = methodTree.symbol();
		if(methodSymbol.parameterTypes().size()>5) {
			reportIssue(tree, "Too many params");
		}
		
	}
 }
