package com.google.android.libraries.social.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.common.proguard.UsedByReflection;
import efj;
import ket;
import kfg;

@UsedByReflection
public final class PreferenceCategory
  extends kfg
{
  public PreferenceCategory(Context paramContext)
  {
    this(paramContext, null);
  }
  
  @UsedByReflection
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.Ul);
  }
  
  private PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final boolean a(ket paramket)
  {
    if ((paramket instanceof PreferenceCategory)) {
      throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
    }
    return super.a(paramket);
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final boolean e()
  {
    return !super.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.settings.PreferenceCategory
 * JD-Core Version:    0.7.0.1
 */