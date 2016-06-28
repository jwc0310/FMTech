package com.google.android.libraries.social.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.common.proguard.UsedByReflection;
import da;
import efj;
import ket;
import kfu;
import kgc;

@UsedByReflection
public class CheckBoxPreference
  extends kgc
{
  public CheckBoxPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  @UsedByReflection
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.Ui);
  }
  
  private CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.d, paramInt, 0);
    c(localTypedArray.getString(kfu.g));
    d(localTypedArray.getString(kfu.f));
    this.d = localTypedArray.getBoolean(kfu.e, false);
    localTypedArray.recycle();
  }
  
  protected final void a(View paramView)
  {
    super.a(paramView);
    View localView = paramView.findViewById(da.N);
    if ((localView instanceof Checkable))
    {
      ((Checkable)localView).setChecked(this.b);
      AccessibilityManager localAccessibilityManager = (AccessibilityManager)this.l.getSystemService("accessibility");
      if ((this.c) && (localAccessibilityManager.isEnabled()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        localAccessibilityEvent.setEventType(1);
        localView.onInitializeAccessibilityEvent(localAccessibilityEvent);
        localView.dispatchPopulateAccessibilityEvent(localAccessibilityEvent);
        localAccessibilityManager.sendAccessibilityEvent(localAccessibilityEvent);
      }
      this.c = false;
    }
    b(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.settings.CheckBoxPreference
 * JD-Core Version:    0.7.0.1
 */