package com.intellij.lang.javascript.flex.projectStructure.model;

import com.intellij.flex.model.bc.ComponentSet;
import com.intellij.flex.model.bc.LinkageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Dependencies {

  @Nullable
  SdkEntry getSdkEntry();

  DependencyEntry[] getEntries();

  @NotNull
  LinkageType getFrameworkLinkage();

  /**
   * Returns target player as set in UI. Note that actual value may be different if additional compiler config file is used: see {@link com.intellij.lang.javascript.flex.build.FlexCompilerConfigFileUtil#getInfoFromConfigFile(String)}
   */
  @NotNull
  String getTargetPlayer();

  @NotNull
  ComponentSet getComponentSet();
}
