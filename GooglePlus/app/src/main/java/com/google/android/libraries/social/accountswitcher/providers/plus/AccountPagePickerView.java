package com.google.android.libraries.social.accountswitcher.providers.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import ehr;

public final class AccountPagePickerView
  extends Button
{
  public TextView a;
  
  public AccountPagePickerView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public AccountPagePickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AccountPagePickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(ehr.aw));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.accountswitcher.providers.plus.AccountPagePickerView
 * JD-Core Version:    0.7.0.1
 */