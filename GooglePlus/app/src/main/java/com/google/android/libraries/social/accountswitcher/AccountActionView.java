package com.google.android.libraries.social.accountswitcher;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import efj;

public final class AccountActionView
  extends Button
{
  public TextView a;
  
  public AccountActionView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public AccountActionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AccountActionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(efj.CK));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.accountswitcher.AccountActionView
 * JD-Core Version:    0.7.0.1
 */