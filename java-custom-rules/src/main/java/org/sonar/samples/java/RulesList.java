/*
 * Copyright (C) 2012-2022 SonarSource SA - mailto:info AT sonarsource DOT com
 * This code is released under [MIT No Attribution](https://opensource.org/licenses/MIT-0) license.
 */
package org.sonar.samples.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.sonar.plugins.java.api.JavaCheck;
import org.sonar.samples.java.checks.AvoidAnnotationRule;
import org.sonar.samples.java.checks.AvoidBrandInMethodNamesRule;
import org.sonar.samples.java.checks.AvoidMethodDeclarationRule;
import org.sonar.samples.java.checks.AvoidSuperClassRule;
import org.sonar.samples.java.checks.AvoidTooManyParametersForMethodRule;
import org.sonar.samples.java.checks.AvoidTreeListRule;
import org.sonar.samples.java.checks.MyCustomSubscriptionRule;
import org.sonar.samples.java.checks.SecurityAnnotationMandatoryRule;
import org.sonar.samples.java.checks.SpringControllerRequestMappingEntityRule;

import com.google.common.collect.ImmutableList;

public final class RulesList {

  private RulesList() {
  }
  
  public static List<Class<?>> getChecks() {
	  return ImmutableList.<Class<?>>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
	  
	  }


//  public static List<Class<? extends JavaCheck>> getChecks() {
//    List<Class<? extends JavaCheck>> checks = new ArrayList<>();
////    checks.add(getJavaChecks());
////    checks.addAll(getJavaTestChecks());
//    return Collections.unmodifiableList(checks);
//  }

  /**
   * These rules are going to target MAIN code only
   */
//  public static Class<? extends JavaCheck> getJavaChecks() {
//    return Collections.unmodifiableList(Arrays.asList(
//      SpringControllerRequestMappingEntityRule.class,
//      AvoidAnnotationRule.class,
//      AvoidBrandInMethodNamesRule.class,
//      AvoidMethodDeclarationRule.class,
//      AvoidSuperClassRule.class,
//      AvoidTreeListRule.class,
//      MyCustomSubscriptionRule.class,
//      SecurityAnnotationMandatoryRule.class));
//  }
  
  
public static  List<Class<? extends JavaCheck>> getJavaChecks() {
return ImmutableList.<Class<? extends JavaCheck>>builder()
//		.add(SpringControllerRequestMappingEntityRule.class)
//		.add(AvoidAnnotationRule.class)
//		.add(AvoidBrandInMethodNamesRule.class)
//		.add(AvoidMethodDeclarationRule.class)
//		.add(AvoidSuperClassRule.class)
//		.add(AvoidTreeListRule.class)
//		.add(MyCustomSubscriptionRule.class)
//		.add(SecurityAnnotationMandatoryRule.class)
//		.add(SecurityAnnotationMandatoryRule.class)
		.add(AvoidTooManyParametersForMethodRule.class).build();
		
      
}

  /**
   * These rules are going to target TEST code only
   */
//  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
//    return Collections.unmodifiableList(Arrays.asList(
//      NoIfStatementInTestsRule.class));
//  }
  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder().build();
  }
}