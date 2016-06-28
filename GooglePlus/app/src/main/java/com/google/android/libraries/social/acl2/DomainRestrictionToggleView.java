package com.google.android.libraries.social.acl2;

import aau;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class DomainRestrictionToggleView
  extends RelativeLayout
{
  public TextView a;
  public TextView b;
  public CompoundButton c;
  
  public DomainRestrictionToggleView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public DomainRestrictionToggleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public DomainRestrictionToggleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aau.xO));
    this.b = ((TextView)findViewById(aau.xN));
    this.c = ((CompoundButton)findViewById(aau.xM));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl2.DomainRestrictionToggleView
 * JD-Core Version:    0.7.0.1
 */