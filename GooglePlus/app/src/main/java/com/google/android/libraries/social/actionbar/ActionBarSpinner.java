package com.google.android.libraries.social.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import gpu;
import gpv;
import gpw;

public final class ActionBarSpinner
  extends Spinner
{
  private gpv a;
  
  public ActionBarSpinner(Context paramContext)
  {
    super(paramContext);
  }
  
  public ActionBarSpinner(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public ActionBarSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ActionBarSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public ActionBarSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void a(gpw paramgpw)
  {
    super.setOnItemSelectedListener(new gpu(this, paramgpw));
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    gpv localgpv = this.a;
    if (localgpv != null) {
      localgpv.a = getSelectedItemPosition();
    }
    super.onMeasure(paramInt1, paramInt2);
    if (localgpv != null) {
      localgpv.a = -1;
    }
  }
  
  public final void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (paramSpinnerAdapter == null) {}
    for (this.a = null;; this.a = new gpv(this, paramSpinnerAdapter))
    {
      super.setAdapter(this.a);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.actionbar.ActionBarSpinner
 * JD-Core Version:    0.7.0.1
 */